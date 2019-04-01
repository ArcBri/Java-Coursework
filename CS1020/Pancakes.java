/**
 * Name         :Arcillas Brian Joshua Pelaez
 * Matric No.   :A0167854N
 * PLab Acct.   :plab8521
 */
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
// Check with a Lab TA before you import anything else.
// You will get ZERO if you violate the restrictions.

public class Pancakes {
LinkedList<String> pancake=new LinkedList();
    private void run() {
		Scanner sc=new Scanner(System.in);
		int initial=sc.nextInt();
		for(int counter=0; counter<initial; counter++){ //uses addLast as the input of colours is from top to bottom ie u add head first and last last
			String initialColour=sc.next();
			pancake.addLast(initialColour);
		}
		int cycles=sc.nextInt();
		for(int cycle=0; cycle<cycles; cycle++){
			String operation=sc.next();     
			switch(operation){
				case "ADD":
				String colour=sc.next();
				addPancake(colour);
				break;
				case "REMOVE":
				removePancake();
				break;
				case "FLIP":
				int start=sc.nextInt();
				int end=sc.nextInt();
				flip(start, end);
				break;
				case "PRINT":
				show();
				break;
			}
		}
    }

    public static void main(String[] args) {
        Pancakes pancakes = new Pancakes();
        pancakes.run();
    }
	public void addPancake(String pancakeColour){ //adding to top of stack is akin to adding a new head element hence addFirst
		pancake.addFirst(pancakeColour);
		System.out.println("Pancake with top colour "+pancakeColour+" added.");
	}
	public void removePancake(){
		if(pancake.size()==0){
			System.out.println("No pancakes to remove.");
			}else{
			System.out.println("Pancake with top colour "+pancake.pop()+" removed."); //the pop() method retrieves and removes the first element ie the first pancake
			}
	}
	public void show(){
		System.out.print("Pancakes: " );
		if(pancake.size()==0){
			System.out.println("[]."); //if no pancakes print out the answer straight
		}else{
			int pancakeSize=pancake.size(); // line always starts with Pancakes: [ so that is printed out first. The first colour is printed and the subsequent ones are printed as ", colour" to adhere to format. once loop is done print out the ]. and new line
			System.out.print("[");
			String current=pancake.getFirst();
			System.out.print(current);
			for(int i=1; i<pancakeSize; i++){
				current=pancake.get(i);
				System.out.print(", "+current);
				if(i==pancakeSize-1){
					System.out.println("].");
				}
			}
		}
	}
	public void flip(int i, int j){
		if(j>(pancake.size())){
			System.out.println("Indices are not valid.");
		}else{
			LinkedList<String>flipped=new LinkedList();
			for(int target=(i-1); target<j; target++){
				String flipTarget=pancake.get(i-1);
				if(flipTarget.charAt(0)=='W'){ //Check whether current pancake is white. if so black is added to flipped list otherwise white is added
				    flipped.addLast("BLACK"); //As the top pancake becomes the bottom in the flipped state, addLast is used
				}else{
					flipped.addLast("WHITE");
				}
				pancake.remove(i-1);
			}
			int amtToFlip=(j-i)+1;
			while(amtToFlip!=0){
				pancake.addFirst(flipped.pop()); //pop is used to retrieve colour for adding to pile and then moving on to colour below
				amtToFlip--;
			}
			System.out.println("Flip trick performed.");
		}
	}

}

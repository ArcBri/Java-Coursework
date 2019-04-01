/**
 * Name   :Arcillas Brian Joshua Pelaez
 * Matric No. :A0167854N
 */
import java.util.*;
import java.lang.*;

public class Love {
private Letter letter=new Letter();
private Letter letter2=new Letter();
 public void run() {
     Scanner sc = new Scanner(System.in);
  int words=sc.nextInt();
  for(int i=0; i<words; i++){
   String word=sc.next();
   letter.create(word);
   letter2.create(word);
 }
 }
 public static void main(String[] args) {
  Love myLove = new Love();
  myLove.run();
  int instance=myLove.forward();
  int instant=myLove.reverse();
//  System.out.println(instance);
  //System.out.println(instant);
  System.out.println(Math.min(instance, instant));
 }
 public int forward(){
   return letter.forwarded();

 }
 public int reverse(){
return letter2.reversed();
  
 }
 class Letter{
    private HashMap<String, Integer> occurence = new HashMap<String, Integer>();
 private Queue<String> start = new LinkedList<String>();
 private Stack<String> end =new Stack<String>();
 
 public void create(String word){
   if(occurence.containsKey(word)==false){
    occurence.put(word, 1);
   }else{
    Integer amount=occurence.get(word);
    amount+=1;
    occurence.remove(word);
    occurence.put(word, amount);
   }
   start.offer(word);
   end.push(word);
  }
 

 public int forwarded(){
   while(occurence.get(start.peek())>1){
   String current=start.poll();
   Integer amt=occurence.get(current);
   occurence.remove(current);
   occurence.put(current, amt-1);

  }

  while(occurence.get(end.peek())>1){
   String now=end.pop();
   Integer amnt=occurence.get(now);
   occurence.remove(now);
   occurence.put(now, amnt-1);

  }
  String endpt=end.peek();
  int unique=endpt.length();
  while(start.peek().equals(endpt)==false){
   String uniqueword=start.poll();
   unique+=uniqueword.length();
  }
  return unique;
 }
 public int reversed(){
   while(occurence.get(end.peek())>1){
   String now=end.pop();
   Integer amnt=occurence.get(now);
   occurence.remove(now);
   occurence.put(now, amnt-1);

  }
  while(occurence.get(start.peek())>1){
   String current=start.poll();
   Integer amt=occurence.get(current);
   occurence.remove(current);
   occurence.put(current, amt-1);

  }
  String startpt=start.peek();
  int unique=startpt.length();
  while(end.peek().equals(startpt)==false){
   String uniqueword=end.pop();
   unique+=uniqueword.length();
  }
  return unique;

 }
 }
}

/**
 * Name         :Arcillas Brian Joshua Pelaez
 * Matric No.   :A0167854N
 * PLab Acct.   :
 */

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.NoSuchElementException;
// Check with a LabTA before you decide to import anything else...
// Using other Collection classes and arrays might result in 0 marks

public class Album {
  
  public static void main(String[] args) {
    Album album = new Album();
    album.run();
  }
  
  private void run() {
    indAlbum albumA = new indAlbum("A");
    indAlbum albumB = new indAlbum("B");
    
    Scanner sc = new Scanner(System.in);
    int cycles = sc.nextInt();
    String operation;
 String albumName;
    int photoID;
 int index;
    for(int i = 0; i < cycles; i++){
      operation = sc.next();
      
      switch(operation.charAt(0)){
        case 'I':
          albumName = sc.next();
          index = sc.nextInt();
          photoID = sc.nextInt();
          switch(albumName.charAt(0)){
            case 'A':
              albumA.insertAt(index, photoID);
              break;
            case 'B':
              albumB.insertAt(index, photoID);
              break;
          }
          break;
        case 'D':
          albumName = sc.next();
          index = sc.nextInt();
          switch(albumName.charAt(0)){
            case 'A':
              albumA.deleteAt(index);
              break;
            case 'B':
              albumB.deleteAt(index);
              break;
          }
          break;
        case 'P':
          albumName = sc.next();
          switch(albumName.charAt(0)){
            case 'A':
              albumA.preview();
              break;
            case 'B':
              albumB.preview();
              break;
          }
          break;
        case 'C':
          System.out.println("Number of distinct photos: " + (albumA.count(albumB)) +".");
          break;
        case 'U':
          albumName = sc.next();
          switch(albumName.charAt(0)){
            case 'A':
              albumA.undo();
              break;
            case 'B':
              albumB.undo();
              break;
          }
          break;
      }
    }
    
  }
}

class indAlbum{
  private ExtendedLinkedList<Integer> photo;
  private String albumName;
  private LinkedList<String> action;
  private LinkedList<Integer> previous;
  private LinkedList<Integer> prevIndex;
  
  indAlbum(String name){
    albumName=name;
    photo= new ExtendedLinkedList<Integer>();
    action =new LinkedList<String>();
    previous=new LinkedList<Integer>();
    prevIndex=new LinkedList<Integer>();
  }
  public void undo(){
    if(action.peek()!=null){
    String operatn=action.pop();
    Integer idx=prevIndex.pop();
    Integer item=previous.pop();
    if(operatn.charAt(0)=='I'){
      if(idx==0){
        photo.removeFirst();
      }else{
        ListNode<Integer> eleBefore = photo.getFirstPtr();
        for(int i=0; i<idx-1; i++){
          eleBefore=eleBefore.getNext();
        }
        photo.removeAfter(eleBefore);
      }
      System.out.println("Album " + albumName + " has been undone.");
    }else if(operatn.charAt(0)=='D'){
      if(idx==1){
        photo.addFirst(item);
      }else{
        ListNode<Integer> eleBefore = photo.getFirstPtr();
        for(int i=0; i<idx-2; i++){
          eleBefore=eleBefore.getNext();
        }
        photo.addAfter(eleBefore, item);
      }
            System.out.println("Album " + albumName + " has been undone.");
    }
    }else{
      System.out.println("No changes in album " +albumName + " to undo.");
    }
  }
  public void insertAt(int index, int id){
    if(index>photo.size()){
      System.out.println("Invalid position, album "+albumName+" only has "+photo.size()+" photos.");
    }else if(index==0){
      photo.addFirst(id);
      action.push("INSERT");
      previous.push(id);
      prevIndex.push(index);
      System.out.println("Photo " + id + " inserted after position " + index + " of album " + albumName + ".");
    }else{
      ListNode<Integer> target=photo.getFirstPtr();
      for(int i=0; i<index-1; i++){
        target= target.getNext();
      }
      photo.addAfter(target, id);
      action.push("INSERT");
      previous.push(id);
      prevIndex.push(index);
      System.out.println("Photo " + id + " inserted after position " + index + " of album " + albumName + ".");
    }
    
    
    
    
  }
  
  public void deleteAt(int index){
    if(index>photo.size()){
      System.out.println("Invalid position, album "+albumName+" only has "+photo.size()+" photos.");
    }else if(index==0){
      System.out.println("Invalid position 0.");
    }else{
      if(index==1){
        previous.push(photo.getFirst());
        photo.removeFirst();
      }else{
        
      ListNode<Integer> target=photo.getFirstPtr();
      for(int i=0; i<index-2; i++){
        target= target.getNext();
      }
      previous.push(photo.removeAfter(target));
      }
      action.push("DELETE");
      prevIndex.push(index);
      System.out.println("Photo deleted from position " + index + " of album " + albumName + ".");
      
    }
  }
  
  public void preview(){
    System.out.print("Album "+albumName+": [");
    ListNode<Integer> printTarget= photo.getFirstPtr();
    if(printTarget!=null){
      System.out.print(printTarget.getElement());
      printTarget=printTarget.getNext();
    while(printTarget!=null){
      System.out.print(", "+printTarget.getElement());
      printTarget=printTarget.getNext();
    }
    }
    System.out.println("].");
    
  }
  public int count(indAlbum b){
    
    ExtendedLinkedList<Integer> combined=new ExtendedLinkedList<Integer>();
    
    for(ListNode<Integer> curr=this.photo.getFirstPtr(); curr!=null; curr=curr.getNext()){
      if(!combined.contains(curr.getElement())){
        combined.addFirst(curr.getElement());
      }
    }
    for(ListNode<Integer> curr=b.photo.getFirstPtr(); curr!=null; curr=curr.getNext()){
      if(!combined.contains(curr.getElement())){
        combined.addFirst(curr.getElement());
      }
    }
    return combined.size();
  }
}


/* List node for ExtendedLinkedList */
/* You may modify this! */
/* Add comments for any methods you have added */
class ListNode <E> {
  protected E element;
  protected ListNode <E> next;
  
  /* constructors */
  public ListNode(E item) { element = item; next = null; }
  public ListNode(E item, ListNode <E> n) { element = item; next=n;}
  
  /* get the next ListNode */
  public ListNode <E> getNext() {
    return this.next;
  }
  
  /* get the element of the ListNode */
  public E getElement() {
    return this.element;
  }
}

/* ExtendedLinkedList discussed in Lectue 5B */
/* You may modify this! */
/* Add comments for any methods you have added */
class ExtendedLinkedList <E> {
  private ListNode <E> head = null;
  private int num_nodes = 0;
  
  public boolean isEmpty() { return (num_nodes == 0); }
  public int size() { return num_nodes; }
  public E getFirst() throws NoSuchElementException {
    if (head == null) 
      throw new NoSuchElementException("can't get from an empty list");
    else return head.getElement();
  }
  
  public boolean contains(E item) {
    for (ListNode <E> n = head; n!= null; n=n.next)
      if (n.getElement().equals(item)) return true;
    return false;
  }
  
  public void addFirst(E item) {
    head = new ListNode <E> (item, head);
    num_nodes++;
  }
  
  public E removeFirst() throws NoSuchElementException {
    ListNode <E> ln;
    if (head == null) 
      throw new NoSuchElementException("can't remove from empty list");
    else { 
      ln = head;
      head = head.next;
      num_nodes--;
      return ln.element;
    }
  }
  public ListNode <E> getFirstPtr() { 
    return head; 
  }
  
  public void addAfter(ListNode <E> current, E item) {
    if (current != null) { 
      current.next = new ListNode <E> (item, current.next);
    } else {
      head = new ListNode <E> (item, head);
    }
    num_nodes++;
  }
  
  public E removeAfter(ListNode <E> current) throws NoSuchElementException {
    E temp;
    if (current != null) {
      if (current.next != null) {// current is not pointing to last node
        temp = current.next.element;
        current.next = current.next.next;
        num_nodes--;  return temp;
      } else throw new NoSuchElementException("No next node to remove");
    } else { // if current is null, assume we want to remove head
      if (head != null) {
        temp = head.element;
        head = head.next; 
        num_nodes--;  return temp;
      } else throw new NoSuchElementException("No next node to remove");
    }
  }
  public void print() {
    ListNode <E> ln = head;
    System.out.print("List is: " + ln.element);
    for (int i=1; i < num_nodes; i++) {
      ln = ln.next;
      System.out.print(", " + ln.element);}
    System.out.println(".");
  }
}

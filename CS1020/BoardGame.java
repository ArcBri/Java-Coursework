/**
 * Name   :
 * Matric No.  :
 * PLab Acct.  :
 */
import java.util.*;
import java.lang.Math;

public class BoardGame {
  private Space[] board;
  private Space player;
  
  private void run() {
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    int sides = sc.nextInt();
    Space newplayer=new Space(1, sides);
    player=newplayer;
    Space[] boardGame = new Space[length];
    board=boardGame;
    for (int i = 0; i < length; i++) { //generate a blank board
      Space space = new Space(i);
      board[i] = space;
    }
    int numblock = sc.nextInt();
    for (int j = 0; j < numblock; j++) { //add blocked spaces
      int blockid = sc.nextInt()-1;
      board[blockid].block();
    }
    int numdice = sc.nextInt();
    for (int k = 0; k < numdice; k++) { //add dice to spaces
      int diceid = sc.nextInt()-1;
      int dicesides = sc.nextInt();
      board[diceid].addDice(dicesides);
    }
    // done with generating the game board
    int score = play(player.getScore());
    System.out.println("Maximum score: " + score);
  }
  private int play(int prevScore){
    int maxScore=-1;
    if (player.getSpace() >= board.length) {
      player.clearDice();
      return 0;
    }else if (board[player.getSpace()].getblock()) {
      player.clearDice();
      return 0;
    }else if(player.getSpace()==board.length){
      return player.getScore();
    }else{
      int diceSide=board[player.getSpace()].getDice();
      int diceAmt=board[player.getSpace()].getScore();
      player.addManyDice(diceAmt, diceSide);
     int minroll=player.getScore();
      int maxroll=player.rolldice();
      for(int i=minroll; i<maxroll; i++){
        player.move(i);
       maxScore= Math.max(prevScore,play(player.getScore()));
      }
    }
    return maxScore;
   
  }
  
  public static void main(String[] args) {
    BoardGame myBoardGame = new BoardGame();
    myBoardGame.run();
  }
}

class Space {
  private int spaceID;
  private Boolean blocked=false;
  private Dice dice;
  private Dice origDice;
  public Space(int id) {
    spaceID=id;
    dice=new Dice(0, 0);
  }
  public Space(int id, int sides){
    spaceID=id;
    dice=new Dice(1, sides);
    origDice=dice;
  }
  public int getSpace(){
    return spaceID;
  }
  public void move(int amount){
    spaceID+=amount;
  }
  public void block(){
    blocked=true;
  }
  public boolean getblock(){
    return blocked;
  }
  public void addDice(int sides){
    dice.addNewDice(1, sides);
  }
  public void addManyDice(int amt, int sides){
    dice.addNewDice(amt, sides);
  }
  public void clearDice(){
    int origSide=origDice.getSides();
    dice.changeDice(origSide);
    
  }
  public boolean getBlocked() {
    return this.blocked;
  }
  public int getDice() {
    return dice.getSides();
  }
  public int getScore(){
    return dice.getAmt();//minroll
  }
  public int rolldice(){
    return dice.getSides();
  }
}

class Dice {
  private int sides;
  private int amount;
  
  public Dice(int dieSides) {
    amount=1;
    sides = dieSides;
  }
  public Dice(int amt, int side){
    amount=amt;
    sides=side;
  }
  public void addNewDice(int amt, int side){
    amount+=amt;
    sides+=side;
  }
  public void changeDice(int side){
    amount=1;
    sides=side;
  }
  public int getSides(){ //number of sides and maxroll
    return sides;
  }
  public int getAmt(){//minroll
    return amount;
  }
}


import java.io.Console;
import java.util.Random;
import java.util.Scanner;

public class RPS {

  public static String  myTurn() {
    try (Scanner myObj = new Scanner(System.in)) {
      System.out.println("Enter your move!");
      String x = myObj.nextLine(); 
      return x;
    }
  }

  public static String  yourTurn(String []plays) {
    Random rnd = new Random();
    int x = rnd.nextInt((2 - 0) + 1) + 0;
    return plays[x];
  }
    
  public static boolean gameOn(String  me, String  you, String []plays){
      if (me.equals(plays[0]) & you.equals(plays[2])){
          return true;}

      else if (me.equals(plays[1]) & you.equals(plays[0])){
          return true;}

      else if (me.equals(plays[2]) & you.equals(plays[1]) ){
          return true;}
          // you win!
      else{
          return false;}
    }



    public static void main(String[] args) {
      String  plays[] = {"rock","paper","scissors"};
      // 0 > 2       // 2 > 1       // 1 > 0
      String  me =myTurn();
      String  you=yourTurn(plays);

      boolean  game= gameOn(me, you,plays);
      System.out.println("Opponent played: "+you);

      if (game){System.out.println("You win!!");}
      else{System.out.println("You lose...");}

    }
  }
  
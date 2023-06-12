using System;

class Program {

public static string myTurn() {
    Console.WriteLine("Enter your move!");
    string x = Console.ReadLine();
    return x;
}

public static string yourTurn(string[]plays) {
  Random rnd = new Random();
  return plays[rnd.Next(0, 2)];
}
  
public static bool gameOn(string me, string you, string[]plays){
    if (me == plays[0] & you == plays[2]){
        return true;}

    else if (me == plays[1] & you == plays[0]){
        return true;}

    else if (me == plays[2] & you == plays[1]){
        return true;}
        // you win!
    else{
        return false;}
  }


  public static void Main (string[] args) {
      
      string[] plays = {"rock","paper","scissors"};
      // 0 > 2       // 2 > 1       // 1 > 0
      
      string me =myTurn();
      string you=yourTurn(plays);
      Console.WriteLine("Opponent played: "+you);
      bool game= gameOn(me, you,plays);
      
      if (game){ Console.WriteLine("You win!") ;  }
      else{ Console.WriteLine("You lose..."); }
        
      }
      
      }
      



public class Player{
   public static int totalPlayers=0;
   String playerName;
  public static void main(String [] args){
   Player player1=new Player();
   player1.playerName="Bob";
     totalPlayers++;
   Player player2=new Player();
   player2.playerName="Kalix";
     totalPlayers++;
     System.out.println("Total Players:" +totalPlayers++);
 }
}
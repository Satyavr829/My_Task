import java.util.Scanner;

class Guesser{
	int gusserNum;
	public int NumFromGusser() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Gusser Kindly Guess The Number...");
		gusserNum = sc.nextInt();
		return gusserNum;
	}
}
class Player{
	int playerNum;
	public int NumFromPlayer() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Player Kindly Guess The Number...");
		playerNum = sc.nextInt();
		return playerNum;
	}
}
class Umpire{
	int umpireNum;
	int playerNum1;
	int playerNum2;
	int playerNum3;
	public void collectNumFromGusser() {
		Guesser gs= new Guesser();
		umpireNum= gs.NumFromGusser();
	}
	public void collectNumFromPalyer() {
		Player p1= new Player();
		Player p2= new Player();
		Player p3= new Player();
		playerNum1=p1.NumFromPlayer();
		playerNum2= p2.NumFromPlayer();
		playerNum3= p3.NumFromPlayer();
	}
	public void compare() {
		if(umpireNum == playerNum1) {
			if(umpireNum== playerNum1 && umpireNum == playerNum2) {
				System.out.println("Player 1 And 2 Tied The Match");
			}else if(umpireNum == playerNum2 && umpireNum == playerNum3) {
				System.out.println("Player 2 And 3 Tied The Match");
			}else if(umpireNum==playerNum1 && umpireNum == playerNum3) {
				System.out.println("Player 1 and 3 Won The Match");
			}else 
			System.out.println("Player 1 Won The Match");
		}else if(umpireNum == playerNum2) {
			System.out.println("Player 2 Won The Match");
		}else if(umpireNum == playerNum3) {
			System.out.println("Player 3 Won The Match");
		}else {
			System.err.println("Game Lost! Try Again...");
		}
	}
}

public class LunchGame {
public static void main(String[] args) {
	Umpire um= new Umpire();
	um.collectNumFromGusser();
	um.collectNumFromPalyer();
	um.compare();
}
}

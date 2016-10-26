// William Gabriel Tim
import java.util.Scanner;
import java.util.Random;

public class RRPS {

	public static void main(String[] args) {
		int P;
		int myScore = 0;
		int pcScore = 0;
		
		System.out.println("Write 0 for Rock, 1 for Scissors and 2 for paper!");
		System.out.println(" ");
		System.out.println("Rock Paper Scissors!");
		

		
		while (pcScore < 2 && myScore < 2) {
			
			Random rand = new Random();
			int C = rand.nextInt(3);
		
		
		
			Scanner in = new Scanner(System.in);
			P = in.nextInt();
	
			for(int i=0; i<4; i++){
				System.out.println(" ");	
			}
			
			if ((P == 0) && (C == 1) || (P == 1 && C == 2) || (P == 2 && C == 0)) {
				System.out.println("You win?");
				myScore ++;
				
			}
			else if (P == C) {
				System.out.println("Draw");
			}
			else {
				System.out.println("You lose?");
				pcScore ++;
			}
			System.out.println(" ");
			System.out.println("My score is " + myScore);
			System.out.println("PC score is " + pcScore);

	
		}
		
	}

}

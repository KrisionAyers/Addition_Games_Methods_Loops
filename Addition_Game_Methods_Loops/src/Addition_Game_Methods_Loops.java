import java.util.Scanner;
public class Addition_Game_Methods_Loops {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score;
		// Call the addition game.
		score = additionGameMethod();
		
		System.out.println("All done.");
		
	}
	public static int additionGameMethod() {
		
		int score = 0;
		int hardness = 5;
		int stopIndex = 2;
		boolean isAnswerCorrect;
		
		for(int index = 0; index<stopIndex; index=index+1){
			System.out.println("Howdy");
			isAnswerCorrect = checkAnserMethod(hardness);
			if(isAnswerCorrect);
				System.out.println("it was correct");
		}{
				System.out.println("it was correct");

		}
		
		
		return score;
		
	}
	public static boolean checkAnserMethod(int hardness) {
		
		return false;
		
		
		
		
	}
}

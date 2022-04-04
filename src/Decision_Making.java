import java.util.Scanner;

public class Decision_Making {

	public static void main(String[] args) {
		// User input integer 1-100
		//

		Scanner scnr = new Scanner(System.in);
		System.out.println("What is your name?");
		String input = scnr.nextLine();
		System.out.println("Hello, " + input + "!");
		System.out.println("Choose a number between 1-100");
		int numInput = scnr.nextInt();
		if (numInput % 2 == 0) {
			System.out.println(input + ", you chose " + numInput + " and it is odd");
		}if (numInput >= 2 && numInput % 2 == 1 && numInput <= 25) {
			System.out.println(input + ".The number you chose, " + numInput + ",is even and less than 25");	
		}if (numInput >= 26 && numInput <= 60 && numInput % 2 ==1) {
			System.out.println(input + ".The number you chose is even and between 26 to 60.");
		}if (numInput >= 60 && numInput %2 == 1) {
			System.out.println(input + ", the number you chose is" + numInput + ". It is even." );
		}
		}
			

}




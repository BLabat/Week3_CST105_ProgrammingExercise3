/** Program: Programming Exercise 3
 * File: GuessingGame.java
 * Summary: Has user guess a random generated number
 * Author: Brandon Labat
 * Date: March 11, 2018
 */
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		//variables
		int ran = (int)(Math.random() * 10000 + 1);//random number generator
		int tries = 0;
		int guess;
		int low = 0;
		int high = 10001;
		System.out.print("Choose a number between 1-10000: " );
		Scanner input = new Scanner(System.in);
		guess = input.nextInt();
		tries++;
		
		while (guess != ran) {//begin while loop
			if(guess > ran) {high = guess;}
			if(guess < ran) {low = guess;}
			if (guess < ran) {
				System.out.print("Higher. Choose a number between " + low  + "-" + high + ": ");
				guess = input.nextInt();
				tries++;
			}//end while loop
			else if (guess > ran) {//begin else statement
				System.out.print("Lower.  Choose a number between " + low + "-" + high + ": ");
				guess = input.nextInt();
				tries++;
			}
		}
		if (guess == ran)
			System.out.println("CORRECT!");
			System.out.println("It took " + tries + " tries");
		}//end main method
	}//end class
		
		
/*
 * DeJonte July
 * 09/20/2019
 * 1115	
 * Homework Week 3
 * JulyProblem3c
 */
import java.util.Scanner;
public class JulyProblem3c {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a 3 digit number: ");
		
		int n = input.nextInt();
		int singles = n%10;
		int tens = (n/10)%10;
		int hundreds = (n/100);
		
	
		int sum = singles + tens + hundreds;
		int prod = singles * tens * hundreds;
		
		System.out.println("Your number is " + n);
		System.out.println("Sum: " + sum);
		System.out.println("Product: " + prod);
		
		input.close();
		
		
		
	}

}

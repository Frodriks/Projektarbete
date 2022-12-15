package projektarbete;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	
	char operators;
	Double firstNumber, secondNumber, answer;
	
	// Asks user to enter operator
	public void getOperators () {
		while(true) {
				Scanner input = new Scanner (System.in); 
				System.out.println("Choose an operator: + , - , * , /");
				operators = input.next().charAt(0);
			
				if(operators == '+' || operators == '-'  || operators == '*' || operators == '/'){
					return;
				}else {
					System.out.println("Something went wrong, try typing one of the operators");
				}		
		}
	}
	// Asks user to enter a number.
	public void getFirstNumber() {
		while(true) {
			try {
			Scanner input = new Scanner (System.in); 
			System.out.println("Enter your first number");
			firstNumber = input.nextDouble();
			return;
			// If the user enters anything else than a number, it catches it and runs the block of code until it gets a correct input.
			} catch(InputMismatchException e) {
				System.out.println("Something went wrong, try typing a number");
			}
		}
	}
	// Asks user to enter a number
	public void getSecondNumber() {
		while(true) {
			try {
			Scanner input = new Scanner (System.in); 
			System.out.println("Enter your second number");
			secondNumber = input.nextDouble();
			return;
			// If the user enters anything else than a number, it catches it and runs the block of code until it gets a correct input.
			} catch(InputMismatchException e) {
				System.out.println("Something went wrong, try typing a number");
			}
		}
	}
	
	//Calculate the answer, depending on which operator the user chose.
	public void getAnswer() {
		System.out.println("Here's the awnser to your equation");
		
		try {
			switch (operators) {
				case '+':
					answer = firstNumber + secondNumber;
					System.out.println(firstNumber + " + " + secondNumber + " = " + answer);
					break;
				case '-':
					answer = firstNumber - secondNumber;
					System.out.println(firstNumber + " - " + secondNumber + " = " + answer);
					break;
				case '*':
					answer = firstNumber * secondNumber;
					System.out.println(firstNumber + " * " + secondNumber + " = " + answer);
					break;
				case '/':
					answer = firstNumber / secondNumber;
					System.out.println(firstNumber + " / " + secondNumber + " = " + answer);
					break;	
			}
		} catch (Exception e) { //Catches exceptions like: 0/0(NaN) or 10/0(Infinity)
			System.out.println(e.getMessage());
			System.out.println("*************");
			e.printStackTrace();
		} 
	}
}
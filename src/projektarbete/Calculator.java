package projektarbete;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	
	boolean a = true;
	char operators;
	Double firstNumber, secondNumber, answer;
	
	// Asks users to enter operator
	public void getOperators () {
		while(true) {
			try {
				Scanner input = new Scanner (System.in); 
				System.out.println("Choose an operator: + , - , * , /");
				operators = input.next().charAt(0); 	//det är bara den första som är viktig. Funkar att skriva ex. +hflsdhfs4832, och då blir det +
													//Hur gör jag för att den bara godkänner om det är en operator??
			
				//input.close();
				if(operators == '+' || operators == '-'  || operators == '*' || operators == '/'){
					//return operators;
					a = false;
					break;
				}else {
					System.out.println("Invalid operator");
				}
			}catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("*************");
				e.printStackTrace();
			}
		
		}
	}
	
	public void getFirstNumber() {
		while(true) {
			try {
			Scanner input = new Scanner (System.in); 
			System.out.println("Enter your first number");
			firstNumber = input.nextDouble();
			//input.close();
			a = false;
			break;
			} catch(InputMismatchException e) {
				System.out.println("Något gick fel, prova skriv en siffra");
			}
		}
	}
	
	public void getSecondNumber() {
		while(true) {
			try {
			Scanner input = new Scanner (System.in); 
			System.out.println("Enter your second number");
			secondNumber = input.nextDouble();
			//input.close();
			a = false;
			break;
			} catch(InputMismatchException e) {
				System.out.println("Något gick fel, prova skriv en siffra");
			}
		}
	}
	
	public void getAnswer() {  //operators, firstNumber, secondNumber
		System.out.println("Here's the awnser to your equation");
		
		try {
			switch (operators) {
		// performs addition between numbers
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
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("*************");
			e.printStackTrace();
		} 
	}
}
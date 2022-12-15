package projektarbete;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		

		//Calls the methods from the calculator class and runs it through a while(true)-loop
		while(true) { 
			Calculator operators = new Calculator();
			operators.getOperators();
			
			Calculator firstNumber = new Calculator();
			operators.getFirstNumber();
			
			Calculator secondNumber = new Calculator();
			operators.getSecondNumber();
			
			Calculator answer = new Calculator();
			operators.getAnswer();
			
			//Asks the user if they want to continue or exit the program
			Scanner input = new Scanner (System.in);
			System.out.println("Press enter or to run again or type 'esc' to exit"); // You can type something else as well to run the code again
			String next = input.nextLine();
			if (next.contains("esc")){
				System.out.println("Closing calculator");
				System.exit(0);		
			}
			}
	
	}

}

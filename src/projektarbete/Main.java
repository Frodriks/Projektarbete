package projektarbete;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		

		
		while(true) { 
			Calculator operators = new Calculator();
			operators.getOperators();
			
			Calculator firstNumber = new Calculator();
			operators.getFirstNumber();
			
			Calculator secondNumber = new Calculator();
			operators.getSecondNumber();
			
			Calculator answer = new Calculator();
			operators.getAnswer();
			
			Scanner input = new Scanner (System.in); //vill ha en funktion för att avsluta eller köra om koden
			System.out.println("Press enter to run again or type 'esc' to exit.");
			String next = input.nextLine();
			if (next.contains("esc")){
				System.out.println("Closing calculator");
				System.exit(0);
				//break;
			//}else {
				//continue;
				
			}
			}
	
	}

}

# Projektarbete

I have created a simple calculator that you can run in the IDE terminal. It takes in two inputs of numbers and one of the four basic operators, Addition, Subtraction, Multiplication and Division. You can run the program over and over again by pressing enter at the of the program or you can type “esc” and press enter to exit the program. For this project I used two different classes, one called "Calculator" that holds all the methods and the other class is called “Main” that calls all the methods and runs the code inside a public static void main (String[] args).

The Calculator class has four different methods and the first three methods run through a while(true)-loop to get the correct input before it can continue with the code. 

The first method is called getOperators() and is used for taking in an operator of the user's choice. If the user types in anything else than: + , - , * , or / , it tells the user to type in one of the correct operators. To be able to detect this it runs through an if/else statement.
 
The second and the third method is called getFirstNumber() and getSecondNumber(). It is used for taking in numbers from the user, if the user enters anything other than numbers it catches it and tells the user to enter a number instead. To be able to detect this it uses a Try…Catch with the Exception java.util.InputMismatchException; that catches it if the input was anything other than an int.

The last method is called getAnswer() and is used to calculate an answer depending on what inputs the user has given through the earlier methods. The method runs through cases depending on what input the user gave in the first method, + , - , * or /.  If the user chooses to divide 0/0(NaN) or 10/0(Infinity), it detects this with a Try…Catch Exception e and tells the user what went wrong.

The Main class calls all the methods from the Calculator class and runs it through a while(true)-loop. At the end of the while(true)-loop the user can choose to run the code again by pressing enter or terminate the code by typing “esc”.

package basics;
import java.util.Scanner;
public class UserInputOutput {
	private static final Scanner scan = new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Hello, World!");
	InputOutput();
}
	

public static void InputOutput(){
	System.out.println("user Input:");
	System.out.println("Please enter the first number: ");
	int num1 = scan.nextInt();
	System.out.println("Please enter the second number: ");
	int num2 = scan.nextInt();
	System.out.println("User Input is: "+num1+" "+num2);

	System.out.println("\nOutput:");
	System.out.println("Choose operation: +, - , *, /");
	String op = scan.next();
	switch(op){
	case "+":
		System.out.println("+ selected\nThe addition of 2 numbers are: "+(num1+num2));
		break;
	case "*":
		System.out.println("* selected\nThe multiplication of 2 numbers are: "+(num1*num2));
		break;
	case "-":
		System.out.println("- selected\nThe subtraction of 2 numbers are: "+(num1-num2));
		break;
	case "/":
		System.out.println("- selected\nThe division of 2 numbers are: "+(num1/num2));
		break;

	default:
		System.out.println("Invalid operator!!. please try again with a valid operator");




	}



}

}






















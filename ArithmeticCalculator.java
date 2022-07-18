import java.util.*;
public class ArithmeticCalculator {
	public static void main(String[] args) {
	      double Number1;
	      double Number2;
	      double Answer;
	      char op;
	      try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter two numbers: ");
			  Number1 = scanner.nextDouble();
			  Number2 = scanner.nextDouble();
			  System.out.println("Enter an operator (+, -, *, /): ");
			  op = scanner.next().charAt(0);
		}
	      switch(op) {
	         case '+': Answer = Number1 + Number2;
	            break;
	         case '-': Answer = Number1 - Number2;
	            break;
	         case '*': Answer = Number1 * Number2;
	            break;
	         case '/': Answer = Number1 / Number2;
	            break;
	      default: System.out.println("Error! Enter correct operator");
	         return;
	      }
	      System.out.println("The result is: ");
	      System.out.println(Number1 + " " + op + " " + Number2 + " = " + Answer);
	   }
}

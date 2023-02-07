package arithmeticcalculator;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		char decision='Y';
		while(decision=='Y') {
		
			Scanner s = new Scanner(System.in);
			System.out.println("enter first number:");
			int x= s.nextInt();
			System.out.println("enter second number:");
			int y= s.nextInt();
			System.out.println("select the operation: \n\naddition: + \nsubtraction: - \nmultiplication: * \ndivision:/ \nmodulus: %");
			String op=s.next();
			int res;
			float res1;
			
			
			Calculator obj=new Calculator();
			switch(op) {
			case "+": res=obj.Addition(x,y);
			System.out.println(res);
			break;
			case "-": res=obj.Subtraction(x,y);
			System.out.println(res);
			break;
			case "*": res=obj.Multiplication(x,y);
			System.out.println(res);
			break;
			case "/": res1=obj.Division(x,y);
			System.out.println(res1);
			break;
			case "%": res=obj.Modulus(x,y);
			System.out.println(res);
			break;
			default: System.out.println("invalid operation");
			}
			System.out.println("Do you want to continue  Y/N");
			decision=s.next().charAt(0);
			
		}
		System.out.println();
	}
	
}
	

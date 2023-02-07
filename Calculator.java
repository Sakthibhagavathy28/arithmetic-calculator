package arithmeticcalculator;

public class Calculator {
	public int addition(int n1, int n2) {
		int n3=n1+n2;
		return n3;
	}
	public int subtraction(int n1,int n2) {
		return n1-n2;
	}
	public int multiplication(int n1,int n2) {
		return n1*n2;
	}
	public float division(int n1,int n2) {
		if(n2==0) {
			System.out.println("number cannot be divided by 0;");
		}
		else
		{
			float x=n1;
			float y=n2;
			return x/y;
		}
		return 0;
	}
	public int modulus(int n1,int n2) {
		if(n2==0) {
			System.out.println("number cannot be divided by 0;");
		}
		else
		{
			return n1%n2;
		}
		return 0;
	}
}

package trying;

//Write a program to swap or exchange two numbers. You should not use any temporary or third variable to swap.

public class SwapNumbers {

	public static void main(String[] args) {
		int a=10;
		int b=15;
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}

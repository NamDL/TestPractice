package trying;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int num=2345;
		int n=0;
		while(num > 0){
			n=n*10;
			n+=num%10;
			num=num/10;
		}
		System.out.println(n);
		
		
		
        }

	}


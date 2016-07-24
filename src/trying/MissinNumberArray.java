package trying;

import java.util.BitSet;

//In an array 1-100 numbers are stored, one number is missing how do you find it?
//usingn(n+1)/2

public class MissinNumberArray {

	public static void main(String[] args) {
		int[] num={1,2,3,4,8,5};
		int length=num.length+1;
		int actualLength=length*(length+1)/2;
		int sum=0;
		for(int i:num){
			sum+=i;
		}
		//System.out.println(actualLength-sum);
		//using bitset
		BitSet bit= new BitSet(num.length);
		int expectedMissingNumber=2;
		for(int i=0;i<num.length;i++){
			bit.set(num[i]);
		}
		int last=0;
		for(int i=0;i<expectedMissingNumber;i++){
			last= bit.nextClearBit(last);
			System.out.println(last);
			last++;
		}
	}
}
	
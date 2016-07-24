package trying;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*A perfect number is a positive integer that is equal to the sum of its proper positive divisors, that is, 
 * the sum of its positive divisors excluding the number itself. Equivalently, a perfect number is a number that
 *  is half the sum of all of its positive divisors. The first perfect number is 6, because 1, 2 and 3 are its 
 *  proper positive divisors, and 1 + 2 + 3 = 6. Equivalently, the number 6 is equal to half the sum of all
 *   its positive divisors: ( 1 + 2 + 3 + 6 ) / 2 = 6.*/

public class PerfectNumber {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		int number=6;
		for(int i=1;i<=35;i++){
			if(number%i==0){
				list.add(i);
			}
		}
		Iterator<Integer> itr=list.iterator();
		int sum=0;
		while(itr.hasNext()){
			sum+=itr.next();
		}
		if((sum/2)==number){
			System.out.println("Yes");
		}else{
			System.out.println("NO");
		}
		
	}

}

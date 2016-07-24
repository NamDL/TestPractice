package trying;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ZigZagNumbers {
	
	public static void main(String[] args) {
		int n=8;
		ZigZagNumbers zee= new ZigZagNumbers();
		System.out.println(zee.count(n));
		System.out.println(zee.countRec(n));
	}
	public int count(int n){
		List<String> CrunchifyList= new ArrayList<String>();
		CrunchifyList.add("eBay");
		CrunchifyList.add("Paypal");
		CrunchifyList.add("Google");
		CrunchifyList.add("Yahoo");		
		List<String> subs= CrunchifyList.subList(0, 2);
		subs.add(2, "amazon");
		
		Iterator<String> its= CrunchifyList.listIterator(0);
		while(its.hasNext()){
			System.out.println(" "+its.next());
		}
		int[] T= new int[n+1];
		T[0]=1;
		T[1]=1;
		T[2]=2;
		for(int i=3;i<=n;i++){
			T[i]=T[i-3]+T[i-2]+T[i-1];
		}
		return T[n];
	}
	public int countRec(int n){
		if(n<0)
			return 0;
		if(n==0)
			return 1;
		else
			return (countRec(n-1)+countRec(n-2)+countRec(n-3));
	}

}

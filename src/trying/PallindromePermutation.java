	package trying;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//CheCk if permutation of a string is a pallindrome 
public class PallindromePermutation {

	public static void main(String[] args) {
		String str="TARRT";
		int flag=0;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>(); 
		for(int i=0;i<str.length();i++){
			int loc= str.charAt(i);
			if(map.containsKey(loc)){
				int val=map.get(loc);
				map.put(loc, ++val);
			}else{
				map.put(loc, 1);
			}
		}
		Iterator itr=map.entrySet().iterator();
		for(Map.Entry<Integer, Integer> entry: map.entrySet()){
			if((entry.getValue()%2!=0)){
				flag++;
			}
		}
		
		if(flag>1){
			System.out.println("No Pallandrome");
		}else{
			System.out.println("Pallindrome exists");
		}
	}
}

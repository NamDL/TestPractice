package trying;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*Write a program to find out duplicate or repeated characters in a string, and calculate the count of repetition.*/

public class DuplicateCharInaArray {

	public static void main(String[] args) {
		String str="Namrathat";
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		char[] cha= str.toCharArray();
		for(int i=0;i<cha.length;i++){
			if(map.containsKey(cha[i])){
				int val=(map.get(cha[i]));
				map.put(cha[i],++val);
			}else{
				map.put(cha[i], 1);
			}
		}
		Iterator its=map.entrySet().iterator();
			for(Map.Entry<Character,Integer> entry: map.entrySet()){
				if(entry.getValue()!=1){
					System.out.println(entry.getKey()+" "+entry.getValue());
				}				
			}
			System.out.println("ghdf "+map.hashCode());
		}
	
}

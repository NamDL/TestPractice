package trying;

import java.util.HashMap;
import java.util.Map;

//Check if two strings are anagrams
public class Anagram {

	public static void main(String[] args) {
		String A="motherinlaw";
		String B="womanshitjhjhjhjhler";
		checkAnagram(A,B);
		//put the characters into the map
		/*Map<Character, Integer> lettersInWord1 = new HashMap<Character, Integer>();
		for(int i=0;i<A.length()-1;i++){
			int val=lettersInWord1.get(A.charAt(i));
			lettersInWord1.replace(A.charAt(i), ++val);
			val=lettersInWord1.get(A.charAt(i));
			lettersInWord1.replace(A.charAt(i), --val);
		}
		System.out.println(lettersInWord1.toString());*/
	}
	
	//Method two
	public static void checkAnagram(String str, String ana){
		if(ana.length()==str.length()){
			for(int i=0;i<str.length();i++){
				char c=str.charAt(i);
				int index=ana.indexOf(c);
				if(index!=-1){
					ana=ana.substring(0,index)+ana.substring(index+1,ana.length());
				}else{
					System.out.println("Not Anagram");
					return;
				}			
			}
		}
		else{
			System.out.println("NOT a anagram");
			return;
		}
		System.out.println("Anangram");
	}
}

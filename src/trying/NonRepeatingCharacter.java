package trying;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String str="Namrantha";
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			map.put(c, map.containsKey(c) ? map.get(c)+1 : 1);
		}
		for(int i=0;i<str.length();i++){
			if(map.get(str.charAt(i))==1){
				System.out.println(str.charAt(i));
				break;
			}
		}
	}

}

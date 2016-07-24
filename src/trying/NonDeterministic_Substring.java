package trying;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NonDeterministic_Substring {

	/*public static void main(String[] args) {
		String a="001010101100010111010";
		String b="???";
		int length=b.length();
		int count=0;
		//Map<Character,Integer> map= new HashMap<Character, Integer>();
		Set<String> map=new HashSet<String>();
		for(int i=0;i<a.length();i++){
			if(i+length <a.length()){
				if (!(map.contains(a.substring(i, i+length)))){
					map.add(a.substring(i, i+length));
				}
			}
		}
		ArrayList<String> list= new ArrayList<String>();
		ArrayList<String> sol=callForB(map,b,list,-1);
		for (String string : sol) {
			if(map.contains(string)){
				count++;
			}
		}
		System.out.println(count);

	}
	
	public static ArrayList<String> callForB(Set<String> map,String b,ArrayList<String> list,int i){
		i=i+1;
		if (i==b.length()){
			list.add(b);
			return list;
		}
		if(b.charAt(i)=='?'){
			char[] val=b.toCharArray();
			val[i]='0';
			callForB(map,String.valueOf(val),list,i);
			val[i]='1';
			callForB(map,String.valueOf(val),list,i);			
		}else{
			callForB(map,b,list,i);
		}
		return list;
	}*/
	
	public static void main(String[] args) {
		String a="001010101100010111010";
		String b="???";
		HashSet<String> set = new HashSet<>();
		StringBuilder sb= new StringBuilder();
		for(int i=0;i>b.length();i++){
			if(b.charAt(i)=='?'){
				sb.append("[01]");
			}else{
				sb.append(b.charAt(i));
			}
		}
		Pattern p = Pattern.compile(sb.toString());
	    
	    Matcher m = p.matcher(a);
	    int last = 0;
	    
	    while(m.find(last)) {
	    
	      set.add(m.group());
	      last = m.start() + 1;
	    }
		System.out.println(set.size());
	}
}

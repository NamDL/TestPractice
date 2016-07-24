package trying;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ParenthesisMatching {

	public static void main(String[] args) {
		List<String> strList= new ArrayList<String>();
		List<String> res= new ArrayList<String>();
		strList.add("{([{}])}");
		strList.add("[]");
		strList.add("{([})}");
		for(String str :strList){
			int sol=checkIfValid(str);
			if(sol==0){
				res.add("YES");
			}else{
				res.add("No");
			}
		}
		for(String str :res){
			System.out.println(str);
		}

	}
	
	public static int checkIfValid(String str){
		Stack<Character> stack= new Stack<Character>();
		char[] chr=str.toCharArray(); 
		for(int i=0;i<chr.length;i++){
			if(chr[i]==')' || chr[i]=='}' ||chr[i]== ']'){
				if(stack.isEmpty()){
					return -1;
				}
				char poped=stack.pop();
				if(chr[i]==')'){
					if(poped!='('){
						return -1;
					}
				}
				else if(chr[i]=='}'){
					if(poped!='{'){
						return -1;
					}
				}
				else if(chr[i]==']'){
					if(poped!='['){
						return -1;
					}
				}				
			}else{
				stack.push(chr[i]);
			}
		}
		if(stack.isEmpty()){
			return 0;
		}else{
			return -1;
		}
	}

}

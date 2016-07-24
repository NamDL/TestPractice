package trying;

import java.util.Stack;

public class BalancedBracketts {

	public static void main(String[] args) {
		String b="{}((){)}[])";
		char[] ch=b.toCharArray();
		boolean flag=true;
		Stack stack= new Stack();
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='{' || ch[i]=='[' || ch[i]=='('){
				stack.push(ch[i]);
			}//
			else if(ch[i]=='}' || ch[i]==']' || ch[i]==')'){
					if(stack.empty()){
						System.out.println("Not Balanced");
					}
					char a=(char) stack.pop();
					char c=ch[i];
					if(c=='(' && (a!=')')){
						System.out.println("Not Balanced");
						flag=false;
						break;
					}else if(c=='{' && (a!='}')){
						System.out.println("Not Balanced");
						flag=false;
						break;
					}else if(c=='[' && (a!=']')){
						System.out.println("Not Balanced");
						flag=false;
						break;
					}
					
			}		
		}
		if(flag && stack.empty()){
			System.out.println("Balanced");
		}else{
			System.out.println("Not Balanced");
		}
	}

}

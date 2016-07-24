package trying;

import java.util.Stack;

public class StackreverseSortRecur {

	public static void main(String[] args) {
		Stack<Integer> st= new Stack<Integer>();
		st.push(5);
		st.push(6);
		st.push(9);
		st.push(2);
		System.out.println(st.toString());
		//reverse
		st=recur(st);
		System.out.println(st.toString());
		
	}
	public static Stack<Integer> recur(Stack<Integer> st){
		if(!st.isEmpty()){
			int item=st.pop();
			st=recur(st);
			//reverse
			//st=insertUlta(st,item);
			//sort
			st=sort(st,item);
		}
		return st;
	}
	public static Stack<Integer> reverse(Stack<Integer> st, int item){
		if(st.isEmpty()){
			st.push(item);
		}else{
			int item2=st.pop();
			st=reverse(st,item);
			st.push(item2);						
		}
		return st;
	}
	
	public static Stack<Integer> sort(Stack<Integer> st, int item){
		if(st.isEmpty()){
			st.push(item);
		}else{
			int item2=st.pop();
			if(item<item2){
				st=sort(st,item);
				st.push(item2);
			}else{
				//st=sort(st,item2);
				st.push(item);
			}			
		}
		return st;
	}

}

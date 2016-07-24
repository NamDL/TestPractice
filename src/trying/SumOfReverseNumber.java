package trying;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 *You have two numbers represented by a linked list, where each node contains a
single digit. The digits are stored in reverse order, such that the 1 's digit is at the head
of the list. Write a function that adds the two numbers and returns the sum as a
linked list.
 * */

public class SumOfReverseNumber {

	public static void main(String[] args) {
		ArrayList<Integer> anc= new ArrayList<Integer>();
		
		Node root= new Node(5);
		Node.insert(root, 1);
		Node.insert(root, 6);
		Node root2=new Node(3);
		Node.insert(root2, 4);
		Node.insert(root2, 4);
		Node first=root;
		Node second=root2;
		int carry=0;
		Node result=null;
		while(first!=null && second!=null){
			int val1=first.data;
			int val2=second.data;
			int res=val1+val2+carry;
			carry=res/10;
			res=res%10;
			System.out.println(res);
			result=Node.insert(result,res);
			first=first.next;
			second=second.next;
		}
		if(first!=null){
			Node.insert(result,first.data+carry);
			carry=first.data/10;
			first=first.next;
		}else if(second!=null){
			Node.insert(result,second.data+carry);
			carry=first.data;
			second=second.next;
		}
		if(carry!=0){
			Node.insert(result, carry);
		}		
		Node.printList(result);

	}

}

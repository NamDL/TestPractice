package trying;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinarySearchTree {
private Node root;
	
	private static class Node{
		int data;
		Node left;
		Node ryt;		
		Node(int data){
			Node left=null;
			Node ryt=null;
			this.data=data;
		}		
	}
	BinarySearchTree(){
		root=null;
	}
	
	public boolean look(int data){
		return (lookup(root,data));
	}
	
	private boolean lookup(Node node, int d){
		if(node==null){
			return false;
		}else{
			while(node.data !=d){
				if(node.data<d){
					node=node.ryt;
				}else{
					node=node.left;
				}
			}
		}
		if(node.data==d){
			return true;
		}else{
			return false;
		}		
	}
	
	public void inert(int data){
		root=(insert(root,data));
	}
	
	private Node insert(Node node, int data) { 
	    if (node==null) { 
	    	node = new Node(data); 
	    } 
	    else { 
	    	if (data <= node.data) { 
	    		node.left = insert(node.left, data);
	    	} 
	      else { 
	        node.ryt = insert(node.ryt, data); 
	      } 
	    }
	    return(node); // in any case, return the new pointer to the caller 
	  } 
	public void print(){
		prints(root);
	}
	private void prints(Node root){
		if(root==null){
			return;
		}else{
			System.out.println(root.data);
			prints(root.left);
			prints(root.ryt);			
		}
	}
	public int maxDepth(){
		return(maxDepth(root));
	}
	private int maxDepth(Node node){
		if(node==null){
			return 0;
		}else{
			int left=maxDepth(node.left);
			int right= maxDepth(node.ryt);
			return((left>right?left:right)+1);
		}
	}
	private int minValue(){
		Node node=root;
		Node parent=null;
		while(node!=null){
			parent=node;
			node=node.left;
		}
		return (parent.data);
	}
	public void inOrder(){
		//System.out.println("printing first");
		//inOrder(root);
		ArrayList<Integer> a = new ArrayList<Integer>();
	
		//inOrder(root,a);
		System.out.println("printint WORECUR");
		inOrderWORecur(root);
	}
	
	private void inOrderWORecur(Node root){
		if(root==null){
			return;
		}
		Node current=root;
		Stack<Node> st= new Stack<Node>();
		while(current!=null){
			st.push(current);
			current=current.left;
		}
		while(!st.isEmpty()){			
				current=st.pop();
				System.out.println(current.data);
				if(current.ryt!=null){
					current=current.ryt;
					while(current!=null){
						st.push(current);
						current=current.left;
					}
				}			
		}
	}
	
	private void inOrder(Node root){
		if(root==null){
			return;
		}else{
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.ryt);
		}
	}
	private void inOrder(Node root, ArrayList<Integer> A){
		if(root==null){
			return;
		}else{
			inOrder(root.left,A);
			A.add(root.data);
			inOrder(root.ryt,A);
		}
	}
	public void postOrder(){
		postOrder(root);
	}
	private void postOrder(Node root){
		if(root==null){
			return;
		}else{
			System.out.print(root.data+" ");
			inOrder(root.left);
			inOrder(root.ryt);
			
		}
	}
	public boolean hasPathSum(int sum){
		int val=hasPathSum(root, sum);
		if(val==1){
			return true;
		}else{
			return false;
		}
	}	
	
	private int hasPathSum(Node node, int sum){
		if(node.left==null && node.ryt==null){
			return node.data;
		}else{
			int left=node.data+hasPathSum(node.left, sum);
			if(left==sum){
				return 1;
			}
			int right=node.data+hasPathSum(node.ryt, sum);
			if(right==sum){
				return 1;
			}
		}
		return 0;
	}
	public void mirrior(){
		mirror(root);
	}
	private void mirror(Node node){
		if(node!=null){
			Node temp= node.left;
			node.left=node.ryt;
			node.ryt=temp;
			mirror(node.left);
			mirror(node.ryt);
		}					
	}
	public static String[] checkStr(String[] str){
		String[] result= new String[str.length];
		int flag=0;
		for(int i=0;i<str.length;i++){
			char[] charStr= str[i].toCharArray();
			for(int j=0,k=charStr.length-1;j-k>0;j++,k--){
				if(charStr[j]!=charStr[k]){
					flag=1;
					break;
				}
			}
						
			if(flag==1){
				result[i]="NO";
			}else{
				result[i]="YES";
			}
		}
		return result;
	
	}
	public int findNode(int data){
		Node node= (find(root,data));
		if(node==null){
			return -1;
		}else{
			return node.data;
		}
	}
	
	///////////////////////////////////////////////////
	public Node find(Node cur,int val) {
		Node result = null;
        if(cur.left != null)
            result = find(cur.left,val);
        if(cur.data == val)
            return cur;
        if(result ==null && cur.ryt != null)
            result = find(cur.ryt,val);
        return result;
    }
////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		
		BinarySearchTree bst= new BinarySearchTree();
		bst.inert(5);
		bst.inert(3);
		bst.inert(9);
		bst.inert(1);
		bst.inert(4);
		bst.inert(6);
		bst.inert(10);
		
		//bst.print();
		//System.out.println("The max depth is "+bst.maxDepth());
		//System.out.println("The minimum "+bst.minValue());
		//System.out.print(" first");
		//bst.inOrder();
		/*System.out.println();
		System.out.println("has Path= "+bst.hasPathSum(9));
		bst.mirrior();
		bst.print();
		
		System.out.print(" second");
		bst.inOrder();
		System.out.println("pre order");
		bst.postOrder();*/
		//int res=bst.findNode(344);
		//System.out.println(res);
		
		
		
		
	}

}

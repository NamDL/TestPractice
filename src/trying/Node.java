package trying;

import java.util.List;
import java.util.Stack;

public class Node {
	public Node next;
	public int data;
	
	public Node(int dat){
		data=dat;
	}
	//insert at the end
	public static Node insert(Node root, int data){
		Node node= new Node(data);
		node.data=data;
		node.next=null;
		if(root==null){
			return node;
		}else{		
			while(root.next!=null){
			root=root.next;
			}
			root.next=node;
		}
		return node;
	}
	public static Node insertFront(Node root, int data){
		Node node= new Node(data);
		node.next=null;
		if(root==null){
			return node;
		}else{		
			node.next=root;
			return node;
		}
		
	}
	
	public static void printList(Node root){
		while(root!=null){
			System.out.println(root.data);
			root=root.next;
		}
		
	}
	
	/*
	 * Wr it e code to remove duplicates from an unsorted linked list. 
	 * FOLLOW UP How would you solve this problem if a temporary buffer is not allowed?
	 * 
	 * */
	
	public static Node removeDuplicates(Node root){
		Node rot=root;
		while(rot!=null){
			Node current=rot.next;
			Node prev=rot;
			
			while(current!=null){
				if(current.data==rot.data){
					prev.next=current.next;
					current=current.next;
										
				}else{
					prev=current;
					current=current.next;
					
				}
			}
			rot=rot.next;
		}
		return root;
	}
	
	/*
	 * Implement an algorithm to find the kth to last element of a singly linked list.
	 * */
	
	public static void kLastNode(Node root,int k){
		Node node=root;
		Node dub=root;
		
			int count=0;
			while(count<k-1 && dub !=null){
				dub=dub.next;
				if(dub==null){
					return;
				}
				count++;
			}
			if(dub==null){
				return;
			}
			while(dub.next!=null){
				node=node.next;
				dub=dub.next;
			}			
				
		System.out.println(k+"th node has value "+node.data);
		return;
		
	}
	
	/**
	 *Implement an algorithm to delete a node in the middle of a singly linked list, given only access to that node.
	 * EXAMPLE Input: the node c from the linked list a->b->c->d->e Result: nothing is returned, 
	 * but the new linked list looks like a- >b- >d->e 
	 *
	 */
	
	public static void deleteGivenNode(Node c){
		Node ex=c;
		Node prev=c;
		while(ex.next!=null){
			ex.data=ex.next.data;
			prev=ex;
			ex=ex.next;
		}
		prev.next=null;
	}
	
	public static void main(String[] args) {
		Node root=insert(null,5);
		Node node=insert(root,6);
		Node newroot=insertFront(root,4);
		Node node2=insert(root,4);
		insert(root,5);
		insert(root,3);
		insert(root,7);
		insert(root,3);
		insert(root,2);
		insert(root,11);
		insert(root,15);
		insert(root,30);
		printList(newroot);
		System.out.println();
		newroot=removeDuplicates(newroot);
		printList(newroot);
		System.out.println();
		kLastNode(newroot,2);
		deleteGivenNode(node);
		printList(newroot);
	}

}

import java.util.*;
class Node{
	Node next = null;
	int data;
	public Node(int d){
		data = d;
	}

	void appendToTail(int d){
		Node end = new Node(d);
		Node n = this;
		while(n.next!=null){
			n = n.next;
		}
		n.next = end;
	}

	Node deleteNode(Node root,int d){
		Node n = root;
		// if(n.data == d){
		// 	return root.next;
		// }
		while(n.next!=null){
			if(n.next.data ==d){
				n.next = n.next.next;
				return root;
			}
			n = n.next;
		}
		return root;
	}

	void print(Node root){
		Node n = root;
		while(n!=null){
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.println();
	}
}

class Remove_Dups{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter length of list: ");
		int n = s.nextInt();
		
		System.out.println("Enter numbers: ");
		Node root = new Node(-1);
		for(int i=0;i<n;i++){
			root.appendToTail(s.nextInt());
		}
		deleteDups(root);
		root.print(root);
	}
	public static void deleteDups(Node n){
		HashSet<Integer> set = new HashSet<Integer>();
		Node previous = null;
		while(n!=null){
			if(set.contains(n.data)){
				previous.next = n.next;
			}else{
				set.add(n.data);
				previous = n;
			}
			n = n.next;
		}
	}
}
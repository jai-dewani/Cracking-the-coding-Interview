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
		Node n = root.next;
		while(n!=null){
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.println();
	}
}
class Kth_Last_Element{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = s.nextInt();
		System.out.println("Enter Elements: ");
		Node root = new Node(-1);
		for(int i=0;i<n;i++){
			root.appendToTail(s.nextInt());
		}

		System.out.print("Enter K value: ");
		int k = s.nextInt();

		Node answer = last_element(root,k);
		if(answer==null){
			System.out.println("NULL");
		}else{
			System.out.println(answer.data);
		}
	}
	public static Node last_element(Node n, int k){
		Node kth = null;
		Node root = n;
		int i = 0;
		while(n!=null){
			i+=1;
			if(i==k){
				kth = root;
			}else if(i>k){
				kth = kth.next;
			}
			n = n.next;
		}
		return kth;
	}
}


public class SinglularLinkedLists {
   
	static class Node {
	
	int data;
	Node next;
	
	public Node(int d) {
		this.data = d;
	}
	}
	
	Node head;
	
	public void print_list() {
		Node n = head;
		
		
		while(n!= null)
		{
			System.out.println(n.data + " ");
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		
	SinglularLinkedLists L1 = new SinglularLinkedLists();
	
	L1.head = new Node(1);
	Node second = new Node(2);
	Node third = new Node(3);
	Node fourth = new Node(4);
	
	
	L1.head.next = second;
	second.next = third;
	third.next = fourth;
	
	L1.print_list();
	
		
	}
	
	 /*Node head;// head of list for traversal use
	 
	//why declare as static class https://stackoverflow.com/questions/9560600/java-no-enclosing-instance-of-type-foo-is-accessible
	 

	  static class Node {
		 
		int data;
		Node next;
		 
		public Node(int d) {
			data = d;
		}	
	}
	
	public void printList() {
		Node n = head;
		while(n!= null) {
			System.out.println(n.data +" ");
			n = n.next;
		}
	}
	public static void main(String[] args){
		
		SinglularLinkedLists Lnkdlst = new SinglularLinkedLists();
		
	Lnkdlst.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		Lnkdlst.head.next = second;
		second.next = third;
		
		Lnkdlst.printList();
		
		
		
		
		
		
	}*/
	
	}

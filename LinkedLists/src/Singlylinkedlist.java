
public class Singlylinkedlist {
	
	Node head;
	
	static class Node {
		
		int data;
		Node next;
		
		public Node(int d) {
			
			this.data = d;
		}
	}
	
	
	public static Singlylinkedlist insert(Singlylinkedlist list, int list_data ) {
		
		Node new_node =  new Node(list_data);
		new_node.next = null;
		
		if(list.head == null) {
			list.head = new_node;
		}
		
		else {
			Node last= list.head;
			while (last.next != null)
			{
				last = last.next;
			}
			
			last.next = new_node;
		}
		
		return list;
	}
	
	public static Singlylinkedlist printlist(Singlylinkedlist L1) {
		Node currNode = L1.head;
		
		System.out.println(" Printing your Linked list: ");
		
		while(currNode!= null) {
			System.out.println("  "+ currNode.data);
			currNode = currNode.next; 
		}
		return L1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singlylinkedlist list_obj = new Singlylinkedlist();
		
		insert(list_obj, 1);
		
		/*list_obj = insert(list_obj, 2);
		printlist(list_obj);
		
		insert(list_obj, 3);*/
	
		/*list_obj = insert(list_obj, 4);
		list_obj = insert(list_obj, 5);
		list_obj = insert(list_obj, 6);
		list_obj = insert(list_obj, 7);
		list_obj = insert(list_obj, 8);
		list_obj = insert(list_obj, 9);
		list_obj = insert(list_obj, 10);*/
		
		printlist(list_obj);
		
		
		
				

	}

}

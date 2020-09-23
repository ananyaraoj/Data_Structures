
public class SLL_Del {

	Node head;
	
	static class Node {
		int data;
		Node next;
		
		public Node(int d) {
			data = d;
		}
	}
	public static SLL_Del Insert(SLL_Del list, int list_data) {
		
		Node new_node = new Node(list_data);
		new_node.next = null;
		
		if(list.head == null) {
			list.head = new_node;
		}
		
		else {
			Node traverse = list.head;
			
			while(traverse.next!=null) {
				traverse = traverse.next;
			}
			
			traverse.next = new_node;
			
		}
		
		return list;
	}
	
	public SLL_Del Delete(SLL_Del list, int key) {
		
		Node prev = null;
		Node curr = list.head;
		 
		if(curr!= null && curr.data==key) {
			list.head = curr.next;
			System.out.println(key + " found and deleted X");
			return list;
		}
		
		
		
		while(curr!= null && curr.data!=key) {
			prev = curr;
			curr = curr.next;
		}
		
		if(curr!=null) {
			prev.next = curr.next;
			
			System.out.println(key + " found and deleted X");
			return list;
		}
		
		while(curr!= null && curr.data!=key) {
			curr = curr.next;
		}
		
		System.out.println(key + " does  not exist in the list! :( ");
		return list;
		 
		
	}
	
    public void printlist(SLL_Del L1) {
    	
    	Node currNode = L1.head;
    	
    	System.out.println(" Your LinkedList: ");
    	
    	while(currNode!=null) {
    		System.out.print(currNode.data + "  ");
    		currNode = currNode.next;
    	}
    	
    	
	}
	public static void main(String[] args) {
		
		SLL_Del list_obj = new SLL_Del();
		
	list_obj =	Insert(list_obj, 10);
    list_obj =  Insert(list_obj, 20);
	list_obj =	Insert(list_obj, 30);
	list_obj =	Insert(list_obj, 40);
	/*	Insert(list_obj, 50);
		Insert(list_obj, 60);
		Insert(list_obj, 70);
		Insert(list_obj, 80);
		Insert(list_obj, 90);
		Insert(list_obj, 100);*/
		
		list_obj.Delete(list_obj, 10);
		
		list_obj.Delete(list_obj, 40);
		list_obj.Delete(list_obj, 50);
		
		list_obj.printlist(list_obj);
		
				

	} 

}

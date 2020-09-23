
public class SLL_DEL_POS {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		public Node(int d) {
			data = d;
		}
		
	}
	
	public static SLL_DEL_POS insert(SLL_DEL_POS list, int list_data) {
		Node new_node = new Node(list_data);
		new_node.next = null; 
	
		if(list.head == null ) {
			list.head = new_node;
			
		}
		
		else {
			Node curr = list.head;
			
			while(curr.next!= null) {
				curr = curr.next;
			}
			
			curr.next = new_node;
		}
		return list;
	}
	
   public static SLL_DEL_POS Delete(SLL_DEL_POS list, int index) {
	   
	   Node curr = list.head;
	   
	   if(curr!=null && index == 0) {
		   list.head = curr.next;
		   System.out.println("Element" + curr.data + "at" + index + "deleted");
		   return list;
	   }
	   int counter = 0;
	   Node prev = null;
	   while(curr!= null &&  counter!= index) {
			  
			      prev = curr;
				  curr = curr.next;
				  counter++;
		   }
	   if(curr!=null) {
			   prev.next = curr.next;
			   System.out.println("Element" + curr.data + "at" + index + "deleted");
		   }
	   
	   
	   
	   if(curr==null) {
		   System.out.println("Element at Index" +index + " is out of bound");
	   }
	   return list;
	   
	   
   }
			
   public static void printlist(SLL_DEL_POS L1) {
	   
	   Node currNode = L1.head;
	   
	   System.out.println("Your LinkedList : ");
	   while(currNode!=null) {
		  
		   System.out.println("  " + currNode.data);
		   currNode = currNode.next;
		   
	   }
	  
	  
   }

	public static void main(String[] args) {
		SLL_DEL_POS list_obj = new SLL_DEL_POS();
		
		insert(list_obj, 10);
		insert(list_obj, 20);
		insert(list_obj, 30);
		insert(list_obj, 40);
		insert(list_obj, 50);
		insert(list_obj, 60);
		insert(list_obj, 70);
		
		
		printlist(list_obj);
		
		Delete(list_obj, 0);
		Delete(list_obj, 3);
		Delete(list_obj, 4);
		Delete(list_obj, 6);

		printlist(list_obj);
		

	}

}

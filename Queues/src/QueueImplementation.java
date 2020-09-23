public class QueueImplementation {
 
	Node head, tail;
	
	QueueImplementation(){
		head = null;
		tail = null;
	}
	
	static class Node{
		int val;
		Node next;
		
		Node(int v){
			
			val = v;
		}
	}
	
	public void enqueue(int val) {
		Node new_node = new Node(val);
		
		if(tail==null) {
			head = tail = new_node;
		}
		
		else {
			
			tail.next = new_node;
			tail = new_node;
			}
		}
	
	
	public Integer dequeue() {
		int dqued_val = Integer.MIN_VALUE;
		if(head == null)
			return null;
		else {
			dqued_val = head.val;
			head = head.next;
			return dqued_val;
		}
	}
	
	public int size() {
		int count = 0;
		Node temp = head;
		
		while(temp != null){
			temp = temp.next;
			count++;	
		}
		return count;
	}
	
	public Integer front() {
		if(head != null) {
			return head.val;
		}
		
		else
			return null;
	}
	
	public Integer rear() {
		if(tail!=null)
			return tail.val;
		else
			return null;
	}
	
	public static void main(String[] args) {
		QueueImplementation obj = new QueueImplementation();
		
		obj.enqueue(100);
		obj.enqueue(200);
		obj.enqueue(300);
		obj.enqueue(400);
		obj.enqueue(500);
		
		System.out.println("\n" + obj.size() + " is the size of the queue");
		
		System.out.println("\n" + obj.dequeue() + " is dequeued from the queue" );
		System.out.println("\n" + obj.dequeue() + " is dequeued from the queue" );
		
		System.out.println("\n"+ obj.size() + "  is the updated size of the queue");
		
		System.out.println("\n" + obj.front() + "is the queue head" );
		System.out.println("\n" + obj.rear() + "is the queue tail" );
		
		
	}
/*	Node head, tail;
	
	QueueImplementation() {
		head = null;
		tail = null;
	}

	
	static class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}
	}
	
	public void enqueue(int val) {
		Node newnode = new Node(val);
		if (tail == null) {
			head = tail = newnode;
		} else {
			tail.next = newnode;
			tail = newnode;
		}
	}

	
	public Integer dequeue() {
		if (head != null) {
			head = head.next;
		}
		return null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	
	public int size() {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	
	public Integer front() {
		if (head != null)
			return head.val;
		else
			return null;
	}


	public Integer rear() {
		if (tail != null)
			return tail.val;
		else
			return null;
	}
	
	public static void main(String[] args) {
		QueueImplementation queue = new QueueImplementation();
		queue.enqueue(10);
		queue.enqueue(15);
		queue.enqueue(25);
		queue.enqueue(78);
		//queue.dequeue();
		System.out.println("queue front is " + queue.front());
		System.out.println("queue rear is " + queue.rear());
		System.out.println("queue size is " + queue.size());
		//queue.dequeue();
		//queue.dequeue();
		System.out.println("queue size is " + queue.size());
	}
*/

}  
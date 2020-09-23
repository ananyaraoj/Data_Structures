public class StackAsLinkedList{
	StackNode top;
	
	static class StackNode{
		int data;
		StackNode next;
		
		StackNode(int d){
			data = d;
		}
	}
	
	public boolean isEmpty() {
		if(top==null) {
			return true;
		}
		
		else
			return false;
	}
	
	public void push(int data) {
		StackNode new_node = new StackNode(data);
		
		if(top == null) {
			top = new_node;
		}
		
		else {
			StackNode temp = top;
			top = new_node;
			new_node.next = temp;
		}
		
		System.out.println(data + "  pushed into the stack ");
	}
	
	public int pop() {
		int popped = Integer.MIN_VALUE;
		
		if(top == null) {
			System.out.println("Stack is empty");
			return Integer.MIN_VALUE;
		}
		
		else {
			popped = top.data;
			top = top.next;
		}
		return popped;
	}
	
	public void peek() {
		if(top == null) {
			System.out.println("Stack is empty");
			
		}
		
		else
			System.out.println("top element is" + top.data);
			
	}
	
	public static void main(String[] args) {
		StackAsLinkedList obj = new StackAsLinkedList();
		
		obj.push(100);
		obj.push(200);
		obj.push(300);
		obj.push(400);
		obj.push(500);
		
		System.out.println(obj.pop()+"  is popped from the stack");
		
		obj.peek();
	}
	
	
}
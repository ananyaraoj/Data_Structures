package ananya.hashmap;

public class CustomHashMap<K, V>{
	int capacity = 16;
	Entry<K, V>[] table;
	
	public CustomHashMap() {
		table = new Entry[capacity];
	}
	
	public CustomHashMap(int capacity) {
		table = new Entry[capacity];
	}
	
	public int index(K key) {
		if( key == null) {
			return 0;
		}
		
		return Math.abs(key.hashCode() % capacity);
	}
	
	
	public void put(K key, V value) {
		int index =  index(key);
		Entry<K, V> new_entry = new Entry<K,V>(key, value, null);
		
		if(table[index] == null)
			table[index] = new_entry;
		
		else {
			Entry<K, V> prev = null;
			Entry<K, V> curr = table[index];
			
			while(curr != null ) {
				if(curr.getKey().equals(key)){
					curr.setValue(value);
					break;
				}
//now that keys are not equal which means the hashcodes are equal, you need to attach this as a new node				
//so maintain 2 pointers to the node which is already present. prev points to data of that node and curr points to the next of that node
			
				prev = curr; 
				curr = curr.getNext();	
			}
			
			//now that prev is pointing to data of current node, just make the next of it pointing to the new entry
			if(prev != null)
			    prev.setNext(new_entry);    
		}
	     	
	}
	
	public void display() {
		for(int i = 0; i < capacity; i++) {
			if( table[i] != null) {
				Entry<K, V> curr = table[i];
				while (curr != null) {
				System.out.println("key : " + curr.getKey());
				System.out.println("Value : " + curr.getValue());
				curr = curr.getNext();
				}
			}
		}
	}
	
	public void remove(K key) {
		int index = index(key);
		Entry<K, V> prev = null;
		Entry<K, V> curr = table[index];
		
		while(curr != null) {
			if(curr.getKey().equals(key)) {
				//checking if previous is null to make sure that if its the last element 
				if(prev == null) {
					curr = curr.getNext();
					table[index] = curr;
					return;
				}
				//This else condition is met when prev is assigned with something which means 
				//when the keys are not equal but indexes are, the node is searching for a paerticular 
				//entry to be deleted
				//In the case of 1 and 17, if you want to delete 17, then initially the
				//equal key condition will fail(1 & 17) and and prev is set with 17 value
				//so you assign prev = 1 and traverse to its next and set its next to curr which is 17
				else {
					prev.setNext(curr.getNext());
					return;
				}
			}
			//So if the key doesn't match make prev = curr and traverse using curr. The following lines
			//are only for traversal
			prev = curr;
			curr = curr.getNext();
		}
	}
	
	public V get (K key) {
		V value = null;
		int index = index(key);
		Entry<K, V> curr = table[index];
		
		while (curr != null) {
			if(curr.getKey().equals(key)) {
				value = curr.getValue();
			}
			curr = curr.getNext();
		}
		return value;
	}
	
	
	public static void main(String[] args) { 
	  CustomHashMap<Integer, String> map = new CustomHashMap<Integer, String>();
	  
	  map.put(1,  "CSE");
	 
	  map.put(1, "replaced CSE");
	 map.put(2, "ISE");
	  
	  map.put(17, "Same hashcode");
	  
	  
	  map.display();	
	  map.remove(2);
	  map.remove(17);
	  map.remove(1);
	  
	}
		
	}

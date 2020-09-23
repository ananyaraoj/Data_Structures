package ananya.hashmap;

class Entry<K, V> {
	
	K key;
	V value;
	Entry<K, V> next;
	
	public Entry(K key, V value, Entry<K, V> next) {
		this.key = key;
		this.value = value;
		this.next = next ; 
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	public Entry<K, V> getNext() {
		return next;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	public void setNext(Entry<K, V> next) {
		this.next = next;
	}
}
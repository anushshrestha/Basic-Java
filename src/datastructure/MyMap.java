package datastructure;

public class MyMap<K,V> {
	private final K key;
	private V value;
	
	public MyMap(K key, V value) {
		// TODO Auto-generated constructor stub
		this.key= key;
		this.value=value;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	public void setValue(V value) {
		this.value = value;
	}	
}

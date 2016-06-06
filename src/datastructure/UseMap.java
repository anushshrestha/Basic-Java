package datastructure;

import java.util.Arrays;
import java.util.HashSet;

public class UseMap<K,V> {
	
	private int size;
	private int DEFAULT_CAPACITY= 16;
	
	@SuppressWarnings("unchecked")
	private MyMap<K, V>[]values = new MyMap[DEFAULT_CAPACITY];
	
	public V get(K key) {
		for(int i=0;i<size;i++){
			if(values[i]!=null){
				if(values[i].getKey().equals(key)){
					return values[i].getValue();
				}
			}
		}
		return null;
	}
	
	public void put(K key, V value) {
		boolean insert = true;
		for(int i=0;i<size;i++){
			if(values[i].getKey().equals(key)){
				values[i].setValue(value);
				insert=false;
			}
		}
		if(insert){
			ensureCapa();
			values[size++]= new MyMap<K, V>(key, value);	
		}
	}
	
	private void ensureCapa() {
		if(size==values.length){
			int newSize=values.length*2;
			values=Arrays.copyOf(values, newSize);
		}
	}
	
	public int size(){
		return size;
	}
	
	public void remove(K key) {
		for(int i=0;i<size;i++){
			if(values[i].getKey().equals(key)){
				values[i]=null;
				size--;
				condenseArray(i);				
			}

		}
	}
	
	private void condenseArray(int start) {
		for(int i = start;i<size;i++){
			values[i]=values[i+1];
		}
	}
	
	public HashSet<K> keySet() {
		HashSet<K> set = new HashSet<K>();
		for(int i=0;i<size;i++){
			set.add(values[i].getKey());
		}
		return set;
	}
	
	
}

package generics3.demo0;

class HashTable<K, V> {
	private K key;
	private V value;

	public HashTable(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

}

public class App {

	public static <T> T showItem(T no) {
		System.out.println("item is : " + no);
		return no;
	}

	public static <U> void printItems(U[] items) {
		for (U item : items) {
			System.out.println(item);

		}
	}

	public static <T, U> void printMultipleItems(T t, U u) {

		System.out.println(t.toString());
		System.err.println(u.toString());

	}

	public static void main(String[] args) {

	}
}

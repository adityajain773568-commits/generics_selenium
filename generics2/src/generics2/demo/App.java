package generics2.demo;

import java.util.ArrayList;

class Box<T> {

	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

}

public class App {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Aditya");
		arrayList.add("Jain");
		arrayList.add("Java Developer");
		ArrayList arr = arrayList;
		arr.add(199);
//		String string = arrayList.get(3);
		System.out.println(arrayList);
	}
}

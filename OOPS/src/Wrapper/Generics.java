package Wrapper;

class Generics<T> {

	private T item;

	public void set(T item) {

		this.item = item;

	}

	public T get() {

		return item;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Generics<Integer> intbox = new Generics<>();

		Generics<Double> dbox = new Generics<>();

		Generics<String> strbox = new Generics<>();

		intbox.set(100);
		dbox.set(120.2500);
		strbox.set("Sai");

		System.out.println(intbox.get() + " Integer Value ");
		System.out.println(dbox.get() + " Double Value ");
		System.out.println(strbox.get() + " String Value ");

	}

}

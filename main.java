package Bai1;

public class MAIN {
	
	public static void main(String [] argv) {
		ArrayDeque<Integer> arrayDeque = new ArrayDeque();
		System.out.println("SIZE = "+ arrayDeque.size() );
		arrayDeque.enqueueFront(123);
		System.out.println("SIZE = "+ arrayDeque.size() );
		arrayDeque.enqueueFront(523);
		System.out.println("SIZE = "+ arrayDeque.size() );
		arrayDeque.enqueueFront(423);
		System.out.println("SIZE = "+ arrayDeque.size() );
		arrayDeque.enqueueFront(623);
		System.out.println("SIZE = "+ arrayDeque.size() );
		System.out.println(arrayDeque.first());
		System.out.println(arrayDeque.last());
	}
}

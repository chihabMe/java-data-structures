package linkedlist;

public class Main {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();
		Queue<String> queue = new Queue<>();
		queue.add("c");
		queue.add("h");
		queue.add("i");
		queue.add("h");
		queue.add("a");
		queue.add("b");
		queue.print();
		queue.remove(2);
		queue.print();
		System.out.println("length  = "+queue.getLength());
		System.out.println(queue.getValueOf(1));
		System.out.println(queue.search("b"));
		System.out.println(queue.getLastItem());
		queue.reverse();
		queue.clear();
		queue.print();
	}

}

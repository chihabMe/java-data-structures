package linkedlist;

public class Stack<T> extends LinkedList<T>{
	@Override
	public void add(T val) {
		Node<T> newNode = new Node<>();
		newNode.data=val;
		newNode.next=null;
		if(isEmpty()) {
			head=newNode;

		}else {
			newNode.next=head;
			head=newNode;
		}
		this.length++;
		
	}
}

package linkedlist;

public class Queue<T> extends LinkedList<T>{

	@Override
	public void add(T val) {
		Node<T> newNode = new Node<>();
		newNode.data=val;
		newNode.next=null;
		if(isEmpty()) {
			head=newNode;

		}else {
			Node temp =head ;
			while(temp.next!=null)temp=temp.next;
			temp.next=newNode;
		}
		this.length++;
		
	}




	



}

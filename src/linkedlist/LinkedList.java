package linkedlist;

public abstract class LinkedList<T> {
	
	int length=0 ;
	Node<T> head = null;
	// the adding is different between the stack and the queue but we must have an adding method 
	public abstract void add(T val);
	//
	
	// the queue and the stack 
	public void clear () {
		Node temp =head ;
		Node holder ;
		while(temp!=null) {
			holder = temp ; 
			temp=temp.next;
			System.out.println("deleting "+holder.data);
			holder=null;
		}
		head = null;
		this.length=0;
	}
	public boolean isEmpty() {
		return head==null && this.length==0;
	}

	public int getLength() {
		
		return this.length;
	}
	public void print() {
		if(isEmpty()) {
			System.out.println("the list is empty");
			return ;
		}
		Node<T> temp = head ;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	public void remove(int index) {
		if(index>=this.length || index<0) {
			System.out.println("Error : out of range ");
			return;
		} ;
		if(isEmpty()) {
			System.out.println("the queue is empty ");
			return ;
		}

		Node<T> temp = head;
		Node<T> holder ;
		if(index==0) {
			holder  = temp ;
			head = temp.next ;
			System.out.println("deleting "+holder.data+" ..  done! ");
			holder =null;

			return ;
			
		}
		int i=0;
		while(i<index-1) {
			i++;
			temp = temp.next;
			}
		holder = temp.next;
		temp.next=holder.next;
		System.out.println("deleting "+holder.data+" .. done! ");
		holder = null;
		this.length--;
	}

	public T getValueOf(int index) {
		if(isEmpty()) {
			
		System.out.println("the list is empty "); 
		return (T) null;
		}
		if(index<0 || index>=length) {
			System.out.println("Error : out of range ");
			return (T) null; 
		}
		int i = 0 ; 
		Node<T> temp = head ;  
		while(i<index) {
			temp = temp.next;
			i++;
		}
		return temp.data;
	}

	public int getIndexOf(T val) {
		if(isEmpty()) {
			
		System.out.println("the list is empty "); 
		return -1;
		}
		

		int i = 0 ; 
		Node<T> temp = head ; 
		while(temp!=null ) {
			if(temp.data.equals(val))return i ;
			i++;
			temp=temp.next;
		}
		System.out.println("the value "+val+" does not exsist");
		return -1;
	}

	public int search(T val) {
		return this.getIndexOf(val);
		
	}

	public T getLastItem() {
		if(isEmpty()) {
			System.out.println("the list is empty");
			return null;
		}
		Node temp =head ; 
		while(temp.next!=null)temp = temp.next;
		return (T) temp.data;
	}

	public void reverse() {
		Node<T> prev = null ;
		Node<T> current = head ; 
		Node<T>  next = head ; 
		while(current!=null) {
			next = current.next;
			current.next=prev ;
			prev = current ;
			current = next;
		}
		head = prev;
	}
}

package lecture13;

public class ll {
    public static class Node{
    	int data;
    	Node next;
    }
    
	public static class Linkedlist{
		Node head;
		Node tail;
		int size;
		
		void addLast(int val) {
			Node nn = new Node();
			nn.data = val;
					
			if(size == 0) {
				head = tail = nn;
			}else {
				tail.next = nn;
				tail = nn;
			}
			size++;
		}
		
		void display() {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}
		
		void removeFirst() {
			if(size == 0) {
				System.out.println("list is empty");
			}
			else if(size == 1) {
				head = tail = null;
				size--;
			}
			else {
				head = head.next;
				size--;
			}
		}
		
		void addFirst(int val) {
			Node nn = new Node();
			nn.data = val;
			
			if(size == 0) {
				head = tail = nn;
			}else {
				nn.next = head;
				head = nn;
			}
			size++;
		}
		
		int getFirst() {
			if(size == 0) {
				System.out.println("list is empty");
				return -1;
			}else {
				return head.data;
			}
		}
		
		int getLast() {
			if(size == 0) {
				System.out.println("list is empty");
				return -1;
			}else {
				return tail.data;
			}
		}
		
		int getAt(int idx) {
			if(idx < 0 || idx >= size) {
				System.out.println("Invalid arguments");
				return -1;
			}
			else if(size == 0) {
				System.out.println("List is empty");
				return -1;
			}
			else if(idx == 0) {
				return getFirst();
			}
			else if(idx == size - 1) {
				return getLast();
			}
			else {
				Node temp = head;
				for(int i=0 ;i < idx;i++) {
					temp = temp.next;
				}
				
				return temp.data;
			}
		}
		
		void addAt(int idx,int val) {
			if(idx < 0  || idx > size) {
				System.out.println("Invalid arguments");
			}
			else if(idx == 0) {
				addFirst(val);
			}
			else if(idx == size) {
				addLast(val);
			}
			else {
				Node temp = head;
				for(int i=0;i < idx - 1;i++) {
					temp = temp.next;
				}
				
				Node nn = new Node();
				nn.data = val;
				nn.next = temp.next;
				temp.next = nn;
				size++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist ll = new Linkedlist();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.display();
		ll.removeFirst();
		ll.display();
		ll.addFirst(100);
		ll.display();
		System.out.println(ll.getAt(2));
		ll.addAt(2,300);
		ll.display();
	}

}

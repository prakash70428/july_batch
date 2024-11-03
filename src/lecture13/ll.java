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
		
		void addlast(int val) {
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
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist ll = new Linkedlist();
		ll.addlast(10);
		ll.addlast(20);
		ll.addlast(30);
		ll.addlast(40);
		ll.display();
		ll.removeFirst();
		ll.display();
		ll.addFirst(100);
		ll.display();
	}

}

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
		
		void removeLast() {
			if(size == 0) {
				System.out.println("list is empty");
			}
			else if(size == 1) {
				head = tail = null;
			}
			else {
				Node temp = head;
				for(int i=0;i < size - 2;i++){
					temp = temp.next;
				}
				
				temp.next = null;
				tail = temp;
				size--;
			}
		}
		
		void removeAt(int idx) {
			if(idx < 0 || idx >= size) {
				System.out.println("Invalid Arguments");
			}
			else if(idx == 0) {
				removeFirst();
			}
			else if(idx == size - 1) {
				removeLast();
			}
			else {
				Node temp = head;
				for(int i=0;i < idx - 1;i++) {
					temp = temp.next;
				}
				
				temp.next = temp.next.next;
				size--;
			}
		}
		
		Node getNodeAt(int idx) {
			Node temp = head;
			for(int i=0 ;i < idx;i++) {
				temp = temp.next;
			}
			
			return temp;
		}
		
		void reverseDI() {
			int left = 0;
			int right = size - 1;
			
			while(left < right) {
				Node lnode = getNodeAt(left);
				Node rnode = getNodeAt(right);
				
				int temp = lnode.data;
				lnode.data = rnode.data;
				rnode.data = temp;
				
				left++;
				right--;
			}
		}
		
		void reversePI() {
			Node prev = null;
			Node curr = head;
			
			while(curr != null) {
				Node temp = curr.next;
				curr.next = prev;
				
				prev = curr;
				curr = temp;
			}
			
			Node temp = head;
			head = tail;
			tail = temp;
		}
		
		int KthFromLast(int k) {
			Node slow = head;
			Node fast = head;
			
			for(int i=1;i <= k;i++) {
				fast = fast.next;
			}
			
			while(fast != tail) {
				fast = fast.next;
				slow = slow.next;
			}
			
			return slow.data;
		}
		
		int mid() {
			Node slow = head;
			Node fast = head;
			
			while(fast.next != null && fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			
			return slow.data;
		}
		
		Linkedlist mergeTwoSortedList(Linkedlist l1,Linkedlist l2) {
			Linkedlist ans = new Linkedlist();
			Node t1 = l1.head;
			Node t2 = l2.head;
			
			while(t1 != null && t2 != null) {
				if(t1.data < t2.data) {
					ans.addLast(t1.data);
					t1 = t1.next;
				}else {
					ans.addLast(t2.data);
					t2 = t2.next;
				}
			}
			
			while(t1 != null) {
				ans.addLast(t1.data);
				t1 = t1.next;
			}
			
			while(t2 != null) {
				ans.addLast(t2.data);
				t2 = t2.next;
			}
			
			return ans;
		}
		
		Node getMiddleNode(Node head,Node tail) {
			Node slow = head;
			Node fast = head;
			
			while(fast.next != null && fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			
			return slow;
		}
		
		Linkedlist mergeSort(Node head,Node tail) {
			if(head == tail) {
				Linkedlist bans = new Linkedlist();
				bans.addLast(head.data);
				return bans;
			}
			
			Node mid = getMiddleNode(head,tail);
			Linkedlist fsh = mergeSort(head,mid);
			Linkedlist ssh = mergeSort(mid.next,tail);
			Linkedlist ans = mergeTwoSortedList(fsh,ssh);
			return ans;
		}
		
		void removeDuplicated() {
			Linkedlist ans = new Linkedlist();
			ans.addLast(this.getFirst());
			this.removeFirst();
			
			while(this.size > 0) {
				int val = this.getFirst();
				this.removeFirst();
				
				if(ans.getLast() != val) {
					ans.addLast(val);
				}
			}
			
			//this = ans; [this is read only]
			this.head = ans.head;
			this.tail = ans.tail;
			this.size = ans.size;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist ll = new Linkedlist();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
//		ll.display();
//		ll.removeFirst();
//		ll.display();
//		ll.addFirst(100);
//		ll.display();
//		System.out.println(ll.getAt(2));
//		ll.addAt(2,300);
//		ll.display();
//		ll.removeLast();
//		ll.display();
//		ll.removeAt(2);
//		ll.display();
//		ll.reverseDI();
//		ll.display();
//		ll.reversePI();
//		ll.display();
//		ll.addLast(40);
		ll.addLast(50);
		ll.addLast(60);
		ll.addLast(70);
		ll.addLast(80);
		ll.display();
		//System.out.println(ll.KthFromLast(3));
		System.out.println(ll.mid());
	}

}

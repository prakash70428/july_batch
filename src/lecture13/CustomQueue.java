package lecture13;

public class CustomQueue {
    private int[] data;
    private int front;
    private int size;
    
    public CustomQueue(int cap) {
    	data = new int[cap];
    	front = 0;
    	size = 0;
    }
    
    public int size() {
    	return size;
    }
    public void display() {
    	for(int i=0;i < size;i++) {
    		System.out.print(data[(front + i) % data.length] + " ");
    	}
    	System.out.println();
    	
    }
    public void add(int val) {
    	if(size == data.length) {
    		int[] oa = data;
    		data = new int[2 * oa.length];
    		for(int i=0;i < size ;i++) {
    			data[i] = oa[(front + i) % oa.length];
    		}
    		front = 0;
    	}
    	int rear = (front + size) % data.length;
    	data[rear] = val;
    	size++;
    }
    public int remove() {
    	if(size == 0) {
    		System.out.println("Queue Underflow");
    		return -1;
    	}
    	
    	int rv = data[front];
    	front = (front + 1) % data.length;
    	size--;
    	return rv;
    }
    public int peek() {
    	if(size == 0) {
    		System.out.println("Queue Underflow");
    		return -1;
    	}
    	
    	return data[front];
    }
}

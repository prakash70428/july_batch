package lecture13;

public class queue_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomQueue q = new CustomQueue(5);
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.display();
		q.remove();
		q.remove();
		q.display();
		System.out.println(q.peek());
	}

}

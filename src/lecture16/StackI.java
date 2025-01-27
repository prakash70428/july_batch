package lecture16;

public interface StackI {
   int x = 10;
//	public static final int x = 10;
   void push(int item);
   
   int pop();
   
   //by default
   public abstract int peek();
   
}

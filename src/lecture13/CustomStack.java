package lecture13;

public class CustomStack {
      int[] data;
      int tos;
      
      public CustomStack(int cap) {
    	  data = new int[cap];
    	  tos = -1;
      }
      
      void push(int val) throws Exception {
    	  if(isfull()) {
    		  throw new Exception("Bhai stack full ho gya hai");
    	  }
//    	  if(tos == data.length - 1) {
//    		  System.out.println("Stack Overflow");
//    		  return;
//    	  }
    	  
    	  tos++;
    	  data[tos] = val;
      }
      
      int size() {
    	  return tos + 1;
      }
      
      void display() {
    	  for(int i=tos;i >= 0;i--) {
    		  System.out.print(data[i] + " ");
    	  }
    	  System.out.println();
      }
      
      int pop() throws Exception {
    	  if(isEmpty()) {
    		  throw new Exception("Bhai stack empty hai");
    	  }
//    	  if(tos == -1) {
//    		  System.out.println("Stack Underflow");
//    		  return -1;
//    	  }
    	  
    	  int rv = data[tos];
    	  tos--;
    	  return rv;
      }
      
      int top() throws Exception {
    	  if(isEmpty()) {
    		  throw new Exception("Bhai stack empty hai");
    	  }
//    	  if(tos == -1) {
//    		  System.out.println("Stack Underflow");
//    		  return -1;
//    	  }
    	  
    	  int rv = data[tos];
    	  return rv;
      }
      
      boolean isfull() {
    	  return tos == data.length - 1;
      }
      
      boolean isEmpty() {
    	  return tos == -1;
      }
}

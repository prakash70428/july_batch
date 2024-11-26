package lecture14;
import java.util.*;
public class binary_tree {
    public static class Node{
    	int data;
    	Node left;
    	Node right;
    	
    	public Node(int data) {
    		this.data = data;
    	}
    }
    public static class pair{
    	Node node;
    	int state;
    	
    	public pair(Node node,int state) {
    		this.node = node;
    		this.state = state;
    	}
    }
    public static Node Construct(Integer[] arr) {
    	Stack<pair> st = new Stack<>();
    	Node root = new Node(arr[0]);
    	st.push(new pair(root,0));
    	
    	for(int i=1;i < arr.length;i++) {
    		pair tos = st.peek();
    		if(arr[i] == null) {
    			tos.state++;
    			if(tos.state == 2) {
    				st.pop();
    			}
    		}else {
    			Node n = new Node(arr[i]);
    			if(tos.state == 0) {
    				tos.node.left = n;
    				tos.state++;
    			}else {
    				tos.node.right = n;
    				st.pop();
    			}
    			st.push(new pair(n,0));
    		}
    	}
    	
    	return root;
    }
    
    public static void display(Node root) {
    	
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer[] arr = {10,20,40,null,null,50,60,null,null,null,30,70,null,80,null
        		           ,null,90,null,null};
        
        Node root = Construct(arr);
        display(root);
	}

}

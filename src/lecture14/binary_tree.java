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
    
    public static void display(Node node) {
    	if(node == null) {
    		return;
    	}
    	
    	String str = "";
    	str += node.left == null ? "." : node.left.data + " ";
    	str += "<- " + node.data + "-> ";
    	str += node.right == null ? "." : node.right.data + " ";
    	System.out.println(str); 
    	
    	display(node.left);
    	display(node.right);
    }
    
    public static int size(Node node) {
    	if(node == null) {
    		return 0;
    	}
    	
    	int lans = size(node.left);
    	int rans = size(node.right);
    	int ans = lans + rans + 1;
    	return ans;
    }
    
    public static int sum(Node node) {
    	if(node == null) {
    		return 0;
    	}
    	
    	int lans = sum(node.left);
    	int rans = sum(node.right);
    	int ans = lans + rans + node.data;
    	return ans;
    }
    
    public static int max(Node node) {
    	if(node == null) {
    		return Integer.MIN_VALUE;
    	}
    	
    	int lans = max(node.left);
    	int rans = max(node.right);
    	int ans = Math.max(node.data,Math.max(lans, rans));
    	return ans;
    }
    
    public static int height(Node node) {
    	if(node == null) {
    		return -1;
    	}
    	
    	int lh = height(node.left);
    	int rh = height(node.right);
    	int ans = Math.max(lh, rh) + 1;
    	return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer[] arr = {10,20,40,null,null,50,60,null,null,null,30,70,null,80,null
        		           ,null,90,null,null};
        
        Node root = Construct(arr);
        display(root);
        System.out.println(size(root));
        System.out.println(height(root));
	}

}

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
    	
    	public Node(int data,Node left,Node right) {
    		this.data = data;
    		this.left = left;
    		this.right = right;
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
    
    public static boolean find(Node node,int data) {
    	if(node == null) {
    		return false;
    	}
    	
    	if(node.data == data) {
    		return true;
    	}
    	
    	boolean lans = find(node.left,data);
    	if(lans == true) {
    		return true;
    	}
    	
    	boolean rans = find(node.right,data);
    	if(rans == true) {
    		return true;
    	}
    	
    	return false;
    }
    
    public static ArrayList<Node> nodeToRootPath(Node node,int data){
    	if(node == null) {
    		return new ArrayList<>();
    	}
    	
    	if(node.data == data) {
    		ArrayList<Node> bans = new ArrayList<>();
    		bans.add(node);
    		return bans;
    	}
    	
    	ArrayList<Node> lans = nodeToRootPath(node.left,data);
    	if(lans.size() > 0) {
    		lans.add(node);
    		return lans;
    	}
    	
    	 ArrayList<Node> rans = nodeToRootPath(node.right,data);
    	 if(rans.size() > 0) {
    		 rans.add(node);
    		 return rans;
    	 }
    	 
    	 return new ArrayList<>();
    }
    
    public static void iterativePrePostInTraversal(Node node) {
    	Stack<pair> st = new Stack<>();
    	st.push(new pair(node,0));
    	
    	String pre = "";
    	String in = "";
    	String post = "";
    	
    	while(st.size() != 0) {
    		pair tos = st.peek();
    		if(tos.state == 0) {
    			pre += tos.node.data + " ";
    			tos.state++;
    			if(tos.node.left != null) {
    				st.push(new pair(tos.node.left,0));
    			}
    		}
    		else if(tos.state == 1) {
    			in += tos.node.data + " ";
    			tos.state++;
    			if(tos.node.right != null) {
    				st.push(new pair(tos.node.right,0));
    			}
    		}
    		else {
    			post += tos.node.data + " ";
    			st.pop();
    		}
    	}
    	
    	System.out.println("pre:" + pre);
    	System.out.println("in:" + in);
    	System.out.println("post:" + post);
    }
	
    public static void printKLevelDown(Node node,int k,Node blocker) {
    	if(node == null || node == blocker) {
    		return;
    	}
    	
    	if(k == 0) {
    		System.out.println(node.data);
    		return;
    	}
    	
    	printKLevelDown(node.left,k - 1,blocker);
    	printKLevelDown(node.right,k - 1,blocker);
    }
    
    public static void createLeftCloneTree(Node node) {
    	if(node == null) {
    		return;
    	}
    	
    	createLeftCloneTree(node.left);
    	createLeftCloneTree(node.right);
    	Node clone = new Node(node.data,node.left,null);
    	node.left = clone;
    }
    
    public static void transformBackfromleftClonedTree(Node node) {
    	if(node == null) {
    		return;
    	}
    	
    	transformBackfromleftClonedTree(node.left.left);
    	transformBackfromleftClonedTree(node.right);
    	node.left = node.left.left;
    }
    
    public static void levelOrder(Node node) {
    	Queue<Node> q = new ArrayDeque<>();
    	q.add(node);
    	
    	while(q.size() != 0) {
    		Node rn = q.remove();
    		System.out.print(rn.data + " ");
    		if(rn.left != null) {
    			q.add(rn.left);
    		}
    		if(rn.right != null) {
    			q.add(rn.right);
    		}
    	}
    	
    	System.out.println();
    }
    
    public static void printKNodesFar(Node node,int data,int k) {
    	ArrayList<Node> al = nodeToRootPath(node,data);
    	for(int i=0 ;i < al.size();i++) {
    		printKLevelDown(al.get(i),k-i,i == 0 ? null : al.get(i - 1));
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer[] arr = {10,20,40,null,null,50,60,null,null,null,30,70,null,80,null
        		           ,null,90,null,null};
        
        Node root = Construct(arr);
//        display(root);
//        System.out.println(size(root));
//        System.out.println(height(root));
//        System.out.println(find(root,600));
//        System.out.println(nodeToRootPath(root,80));
//        iterativePrePostInTraversal(root);
////        printKLevelDown(root,2);
//        transformBackfromleftClonedTree(root);
        levelOrder(root);
	}

}

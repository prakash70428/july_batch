package lecture14;

import lecture14.binary_tree.Node;

public class Binary_Search_Tree {
     public class Node{
    	 int val;
    	 Node left;
    	 Node right;
     }
     
     private Node root;
     
     public Binary_Search_Tree(int[] in) {
    	 root = CreateTree(in,0,in.length - 1);
     }
     
     public Node CreateTree(int[] in,int si,int ei) {
    	 if(si > ei) {
    		 return null;
    	 }
    	 
    	 int mid = (si + ei) / 2;
    	 Node nn = new Node();
    	 nn.val = in[mid];
    	 nn.left = CreateTree(in,si,mid - 1);
    	 nn.right = CreateTree(in,mid + 1,ei);
    	 return nn;
     }
     
     public void PreOrder() {
    	 PreOrder(this.root);
    	 
     }
     
     public void PreOrder(Node node) {
    	 if(node == null) {
    		 return;
    	 }
    	 
    	 System.out.println(node.val + " ");
    	 PreOrder(node.left);
    	 PreOrder(node.right);
     }
     
     public int max() {
    	 return max(this.root);
     }
     
     private int max(Node node) {
     	if(node == null) {
     		return Integer.MIN_VALUE;
     	}
     	
     	int rans = max(node.right);
     	int ans = Math.max(node.val,rans);
     	return ans;
     }
     
     public boolean find(int item) {
    	 return find(this.root,item);
     }
     
     private boolean find(Node nn,int item) {
    	 if(nn == null) {
    		 return false;
    	 }
    	 
    	 if(nn.val == item) {
    		 return true;
    	 }
    	 else if(nn.val < item) {
    		 return find(nn.right,item);
    	 }
    	 else {
    		 return find(nn.left , item);
    	 }
     }
}

package hackerrank_cracking_07_Tree;

public class Main {
    class Node {
        int data;
        Node left;
        Node right;
     }
	boolean checkBST(Node root) {
		if(root.left == null && root.right == null)
			return true;
		if(root.right == null && root.data > root.left.data && checkBST(root.left)){
			return true;
		}
		if(root.data > root.left.data && root.data < root.right.data
				&& checkBST(root.left) && checkBST(root.right)){
			return true;
		}
		return false;
    }
}

package BSTPairSum.java;
import java.util.HashSet;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BSTPairSum {
	 TreeNode root;

	    public BSTPairSum() {
	        root = null;
	    }

	    // Helper function to find a pair with a given sum in the BST
	    public boolean findPair(TreeNode node, int sum, HashSet<Integer> set) {
	        if (node == null)
	            return false;

	        if (findPair(node.left, sum, set))
	            return true;

	        if (set.contains(sum - node.val)) {
	            System.out.println("Pair is (" + node.val + "," + (sum - node.val) + ")");
	            return true;
	        }
	        set.add(node.val);

	        return findPair(node.right, sum, set);
	    }

	    public static void main(String[] args) {
	        BSTPairSum bst = new BSTPairSum();
	        bst.root = new TreeNode(40);
	        bst.root.left = new TreeNode(20);
	        bst.root.right = new TreeNode(60);
	        bst.root.left.left = new TreeNode(10);
	        bst.root.left.right = new TreeNode(30);
	        bst.root.right.left = new TreeNode(50);
	        bst.root.right.right = new TreeNode(70);

	        int targetSum = 130;
	        HashSet<Integer> set = new HashSet<>();
	        if (!bst.findPair(bst.root, targetSum, set))
	            System.out.println("Nodes are not found.");
	    }

}

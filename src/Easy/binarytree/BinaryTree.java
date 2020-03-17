package Easy.binarytree;

public class BinaryTree {

    public TreeNode root;

    public BinaryTree(){
        root = null;
    }

    public BinaryTree(int val) {
        root = new TreeNode(val);
    }

    /**
     * recursive helper method
     * @param val the value to be inserted into the tree
     */
    public void insertHelp(int val) {
        root = insert(root, val);//update the tree
    }

    /**
     * recursive method for inserting nodes into a Binary Search Tree
     * @param next the next node to check
     * @param val the value to insert into the tree
     * @return the newest node with updated information
     */
    public TreeNode insert(TreeNode next, int val) {

        //if the current node is null give it a TreeNode
        if (next == null) {
            return new TreeNode(val);
        }

        //determine which path to take according to the value
        if (next.val > val) {
            next.left = insert(next.left, val);//travel down the left tree
        } else {
            next.right = insert(next.right, val);//travel down the right tree
        }

        return next;//return the node to maintain consistency

    }

    public void printInOrder(TreeNode root) {

        if (root.left != null) {
            printInOrder(root.left);
        }

        System.out.println(root.val);

        if (root.right != null) {
            printInOrder(root.right);
        }

    }

}

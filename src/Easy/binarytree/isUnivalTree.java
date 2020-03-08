package Easy.binarytree;

public class isUnivalTree {

    public static void main(String args[]) {

        System.out.println("Garbage");
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        System.out.println(isUnivalTree(root));

    }

    /**
     * starter recursive function
     * @param root treenode to start the search from
     * @return whether the given tree is a unival tree
     */
    public static boolean isUnivalTree(TreeNode root) {
        int val = root.val;
        return check(root, val);//call the recursive function
    }

    /**
     * check if the root value is different from the value of its children
     * @param root node that stores a value and children
     * @param val value to match
     * @return whether the value of root matched val
     */
    public static boolean check(TreeNode root, int val) {

        if (root.val != val) {//fails if the value doesn't match
            return false;
        } else {
            if (root.left != null && root.right != null) {//check the values of both children
                return check(root.left, val) && check(root.right, val);
            } else if (root.left != null) {//check the value of the left child
                return check(root.left, val);
            } else if (root.right != null) {//check the value of the right child
                return check(root.right, val);
            } else {
                return true;//the values match in this branch
            }
        }

    }

}

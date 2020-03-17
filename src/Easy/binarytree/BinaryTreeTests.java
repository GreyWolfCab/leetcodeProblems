package Easy.binarytree;

public class BinaryTreeTests {

    public static void main(String args[]) {

        BinaryTree bt = new BinaryTree();

        bt.insertHelp(5);
        bt.insertHelp(1);
        bt.insertHelp(6);
        bt.insertHelp(3);
        bt.insertHelp(4);

        bt.printInOrder(bt.root);

    }

}

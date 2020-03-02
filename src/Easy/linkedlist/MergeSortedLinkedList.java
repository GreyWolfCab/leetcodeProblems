package Easy.linkedlist;

public class MergeSortedLinkedList {

    public static void main(String args[]) {
        SingleLinkedList ls1 = new SingleLinkedList();
        ls1.insert(1);
        ls1.insert(2);
        ls1.insert(4);

        SingleLinkedList ls2 = new SingleLinkedList();
        ls2.insert(1);
        ls2.insert(3);
        ls2.insert(4);

        SingleLinkedList merged = ls1.merge2Lists(ls2);
        System.out.println(merged.toString());
    }

}

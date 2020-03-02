package Easy.linkedlist;

public class SingleLinkedList {

    Node head;//beginning point of the linked list

    class Node {
        int data;//data to be stored
        Node next;//the next element in the list (how the list is maintained)

        /**
         * node with data constructor
         * @param d
         */
        Node (int d) {
            data = d;
            next = null;
        }
    }

    /**
     * insert a new piece of data into the list
     * @param data value to enter into the list
     * @return whether the data was successfully entered into the list
     */
    public boolean insert(int data) {

        Node newNode = new Node(data);//create a new node
        boolean isSuccess = false;

        if (this.head == null) {//if the list is empty, create a new head
            this.head = newNode;
            isSuccess = true;
        } else {
            Node curr = this.head;//select the lists starting point
            while (curr.next != null) {//iterate through the list till the end
                curr = curr.next;
            }
            curr.next = newNode;//insert the new node at the end of the list
            isSuccess = true;
        }

        return isSuccess;
    }

    /**
     * merge two singly linked lists into one list
     * @param ls1 the other list to merge with
     * @return the newly merged list
     */
    public SingleLinkedList merge2Lists(SingleLinkedList ls1) {

        SingleLinkedList mergedList = new SingleLinkedList();//the newly merged list

        Node curr1 = this.head;//first element in the first list
        Node curr2 = ls1.head;//first element in the second list

        if (curr1 == null) {//the first list is empty just push the second list
            return ls1;
        } else if (curr2 == null) {//the second list is empty push the first list
            return this;
        } else {//otherwise iterate through both lists for the next value in ascending order
            while (curr1 != null || curr2 != null) {//elements in either list have not been processed
                if (curr1 == null) {//the first list has no more elements
                    mergedList.insert(curr2.data);
                    curr2 = curr2.next;
                } else if (curr2 == null) {//the second list has no more elements
                    mergedList.insert(curr1.data);
                    curr1 = curr1.next;
                } else if (curr1.data < curr2.data) {//the first list element is less than the second list element
                    mergedList.insert(curr1.data);
                    curr1 = curr1.next;
                } else if (curr1.data > curr2.data) {//the first list element is greater than the second list element
                    mergedList.insert(curr2.data);
                    curr2 = curr2.next;
                } else if (curr1.data == curr2.data) {//the elements from both lists are equal
                    mergedList.insert(curr1.data);
                    curr1 = curr1.next;
                }
            }
        }

        return mergedList;

    }

    /**
     * allocate the pieces of this single linked list into a printable format
     * @return the elements of the list in order
     */
    public String toString() {
        String mes = "";

        if (this.head == null) {//if the list is empty
            mes = "Empty list";
        } else {
            Node curr = this.head;//gather the started element for the list
            while (curr != null) {//iterate to the end of the list
                if (curr.next == null) {//if its the final element
                    mes += curr.data;//format for the final element
                } else {//format the typical element for printing
                    mes += "" + curr.data + ", ";
                }
                curr = curr.next;//iterator increments
            }
        }

        return mes;
    }
}

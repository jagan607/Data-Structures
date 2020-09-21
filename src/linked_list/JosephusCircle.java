package linked_list;

public class JosephusCircle {
    public static void main(String[] args) {
        Node node = Node.getLinkedList(true);

        findSafePlace(node, 3);

    }

    private static void findSafePlace(Node head, int m) {
        Node pt1 = head , pt2 = head;
        while (pt1.next!=pt1){
            int count = 1;

            while (count != m){
                pt2 = pt1;
                pt1 = pt1.next;
                count++;
            }
            pt2.next = pt1.next;
            pt1 = pt2.next;

        }

        Node.printNodeData(pt1);

    }
}

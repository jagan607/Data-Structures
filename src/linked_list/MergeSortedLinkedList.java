package linked_list;

public class MergeSortedLinkedList {

    public static void main(String[] args) {
        Node node =getNewList();
        Node node1 = getList();
        Node.printLinkedList(mergeList(node,node1));
        Node.printLinkedList(findMergeNode(node,node1));
    }

    private static Node mergeList(Node head1, Node head2) {
        Node tempNode = new Node(0);

        Node tail = tempNode;
        while (true){

            if (head1 == null){
                tail.next = head2;
                break;
            }
            if (head2 == null){
                tail.next = head1;
                break;
            }

            if (head1.data <= head2.data){
                tail.next = head1;
                head1 = head1.next;
            }
            else {
                tail.next = head2;
                head2 = head2.next;
            }

            tail = tail.next;
        }

        return tempNode.next;
    }

    private static Node getNewList() {
        Node node = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node.next = node1;
        node1.next = node2;
        return node;
    }

    private static Node getList() {
        Node node = new Node(3);
        Node node1 = new Node(4);
        Node node2 = new Node(5);
        Node node3 = new Node(9);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;

        return node;
    }

    static Node findMergeNode(Node head1, Node head2) {
        int count = 0;
        int head1Count = findSize(head1);
        int head2Count = findSize(head2);
        int diff = head1Count - head2Count;
        if (diff < 0){
            while (count<= head2Count){
                count++;
                head2 = head2.next;
            }
        }
        else {
            while (count <= head1Count){
                count++;
                head1 = head1.next;
            }
        }

        while (head1 == head2){
            head1 = head1.next;
            head2 = head2.next;
        }

        return head1;
    }

    private static int findSize(Node head) {
        int headCount = 0;
        while (head !=null){
            headCount++;
            head = head.next;
        }
        return headCount;
    }
}

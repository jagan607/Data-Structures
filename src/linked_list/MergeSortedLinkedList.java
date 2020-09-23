package linked_list;

public class MergeSortedLinkedList {

    public static void main(String[] args) {
        Node node =getNewList();
        Node node1 = getList();
        Node.printLinkedList(findMergeNode(node,node1));
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
        Node node2 = new Node(9);
        node.next = node1;
        node1.next = node2;

        return node;
    }

    static Node findMergeNode(Node head1, Node head2) {
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
}

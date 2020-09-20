package linked_list;

public class NodeInsertion {
    public static void main(String[] args) {
        Node node = Node.getLinkedList();

        printLinkedList( insertNodeAtTheEnd(node,10));

        printLinkedList(insertNodeAtTheBeginning(node,15));

    }

    private static void printLinkedList(Node node) {
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    private static Node insertNodeAtTheEnd(Node head, int data) {
        Node lastNode = head;
        while (lastNode.next!=null) lastNode = lastNode.next;
        lastNode.next = new Node(data);
        return head;
    }

    private static Node insertNodeAtTheBeginning(Node head, int data){
        Node firstNode = new Node(data);
        firstNode.next = head;
        return  firstNode;
    }


}

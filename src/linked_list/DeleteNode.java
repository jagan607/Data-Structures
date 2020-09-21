package linked_list;

public class DeleteNode {
    public static void main(String[] args) {
        Node node = Node.getLinkedList(false);
        deleteLastNode(node);
        deleteNodeAtGivenPosition(node.next.next);
        Node.printLinkedList(node);
    }

    private static void deleteLastNode(Node head) {
        Node tempNode = head;
        while (tempNode.next.next!=null) tempNode = tempNode.next;
        tempNode.next = null;
    }

    public static void deleteNodeAtGivenPosition(Node prevNode){
        prevNode.next = prevNode.next.next;
    }

}

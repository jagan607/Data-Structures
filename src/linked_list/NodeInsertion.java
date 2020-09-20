package linked_list;

import static linked_list.Node.printLinkedList;

public class NodeInsertion {
    public static void main(String[] args) {
        Node node = Node.getLinkedList(false);

        printLinkedList( insertNodeAtTheEnd(node,10));
        printLinkedList(insertNodeAtTheBeginning(node,15));
        insertNodeAtGivenPosition(20, node.next.next);
        printLinkedList(node);

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

    private static void insertNodeAtGivenPosition(int data, Node prevNode){
        Node tempNode = prevNode.next;
        Node node = new Node(data);
        prevNode.next = node;
        node.next = tempNode;
    }


}

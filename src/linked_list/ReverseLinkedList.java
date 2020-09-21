package linked_list;

public class ReverseLinkedList {

    public static void main(String[] args) {
        Node node = Node.getLinkedList(false);
        Node.printLinkedList(reverseList(node));
    }

    private static Node reverseList(Node node) {
        Node prevNode = null , currentNode = node, next;
        while (currentNode!=null){
            next = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = next;
        }
        return prevNode;
    }
}

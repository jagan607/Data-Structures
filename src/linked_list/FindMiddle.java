package linked_list;

public class FindMiddle {

    public static void main(String[] args) {
        Node node = Node.getLinkedList(false);
        Node.printNodeData(findMiddle(node));
    }

    private static Node findMiddle(Node node) {
        Node slowPointerNode = node, fastPointerNode = node;
        while (fastPointerNode.next!=null){
            fastPointerNode = fastPointerNode.next.next;
            slowPointerNode = slowPointerNode.next;
        }
        return slowPointerNode;
    }
}

package linked_list;

import java.util.HashSet;

public class CyclicLinkedList {

    public static void main(String[] args) {
        Node node = Node.getLinkedList(true);
        Node node1 = Node.getLinkedList(false);

        System.out.println(detectLoop(node));
        System.out.println(detectLoop(node1));

    }

    private static String detectLoop(Node node) {
        HashSet<Node> nodeHashSet = new HashSet<>();
        while (node!=null){
            if (nodeHashSet.contains(node)) return "It's a Cyclic Linked List.";
            nodeHashSet.add(node);
            node = node.next;
        }
        return "Not a cyclic Linked List.";
    }
}

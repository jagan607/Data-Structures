package linked_list;

public class Node {

        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;

        }

        public static Node getLinkedList(boolean loop){
            Node node = new Node(1);
            Node node1 = new Node(2);
            Node node2 = new Node(5);
            Node node3 = new Node(3);
            Node node4 = new Node(9);
            Node node5 = new Node(4);
            Node node6 = new Node(0);
            node.next = node1;
            node1.next = node2;
            node2.next = node3;
            node3.next = node4;
            node4.next = node5;
            node5.next = node6;
            if (loop) node6.next = node;

            return node;
        }



    public static void printLinkedList(Node node) {
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void printNodeData(Node node){
        System.out.println(node.data);
    }

    public static Node getSortedLists(){
            
    }



}

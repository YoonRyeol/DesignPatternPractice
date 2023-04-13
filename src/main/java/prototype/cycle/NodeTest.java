package prototype.cycle;

import java.util.HashSet;
import java.util.Set;

public class NodeTest {

    public static void printNode(Node node){
        Set<Integer> his = new HashSet<>();
        while(node != null && !his.contains(node.id)){
            his.add(node.id);
            System.out.print(node.id + ":" + node + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, node1);
        Node copy1 = node2.clone();
        printNode(node2);
        printNode(copy1);

        Node node3 = new Node(3, null);
        Node node4 = new Node(4, node3);
        node3.next = node4;

        Node copy2 = node3.clone();

        printNode(node3);
        printNode(copy2);

    }
}

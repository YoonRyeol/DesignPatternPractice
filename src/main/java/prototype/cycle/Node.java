package prototype.cycle;

import java.util.HashMap;
import java.util.Map;

public class Node implements Cloneable{

    private static Map<Integer, Node> his = new HashMap<>();

    int id;
    Node next;

    public Node(int id, Node next) {
        this.id = id;
        this.next = next;
    }

    @Override
    protected Node clone() throws CloneNotSupportedException {
        int depth = his.size();
        if(his.containsKey(this.id))
            return his.get(this.id);

        Node node = new Node(this.id, null);
        his.put(this.id, node);

        if(next == null)
            node.next = this.next;
        else
            node.next = this.next.clone();
        if(depth == 0)
            his.clear();
        return node;
    }
}

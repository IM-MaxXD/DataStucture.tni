public class Node {
    Object data;
    Node next;

    public Node (Object data) {
        this.data = data;
        this.next = null;
    }

    public String getAddress() {
        return "" + Integer.toHexString(System.identityHashCode(this));
    }

    public static String getAddress(Node node) {
        return (node == null) ? "null" : node.getAddress();
    }
}

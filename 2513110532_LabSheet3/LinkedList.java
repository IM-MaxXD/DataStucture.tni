public class LinkedList {
    Node head;

//1
    public String traversal() {
        Node node = head;
        String result = "";
        boolean isFirst = true;

        while (node != null) {
            if (!isFirst) {
                result += ", ";
            }
            result += node.data;
            isFirst = false;
            node = node.next;
        }

        return "[" + result + "]";
    }

   //2-3
    public void insert(int position, Object value) {

        Node new_node = new Node(value);

        if (head == null) {
            head = new_node;
        }

        else if (position == 0) {
            new_node.next = head;
            head = new_node;
        }

        else {
            Node node = head;
            int curr_position = 0;

            while (node != null && curr_position < position - 1) {
                node = node.next;
                curr_position = curr_position + 1;
            }

            new_node.next = node.next;
            node.next = new_node;
        }
    }
}
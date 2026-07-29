public class DoublyLinkedList {

    private Node head;
    private Node tail;

    public DoublyLinkedList () {
        this.head = null;
        this.tail = null;
    }

    public String traversal() {
        Node current_node = head;
        String result = "[";
        boolean first = true;
        while (current_node != null) {
            result += (!first ? ", " : "") + current_node.data;
            current_node = current_node.next;
            first = false;
        }
        result += "]";
        return result;
    }

    public void insert(Object value) {
        Node new_node = new Node(value);

        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            new_node.previous = tail;
            tail = new_node;
        }
    }

    public void insert(int position, Object value) {
        Node new_node = new Node(value);

        if (head == null) {
            head = new_node;
            tail = new_node;
        } else if (position == 0) {
            new_node.next = head;
            head.previous = new_node;
            head = new_node;
        } else {
            Node current_node = head;
            int current_position = 0;
            while (current_node != null && current_position < position - 1) {
                current_node = current_node.next;
                current_position++;
            }
            if (current_node != null) {
                new_node.previous = current_node;
                new_node.next = current_node.next;
                if (current_node.next != null) {
                    current_node.next.previous = new_node;
                } else {
                    tail = new_node;
                }
                current_node.next = new_node;
            }
        }
    }

    public void remove() {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.previous;
            tail.next = null;
        }
    }

    public void remove(int position) {
        if (head == null) {
            return;
        }
        if (position == 0) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.previous = null;
            }
        } else {
            Node current_node = head;
            int current_position = 0;
            while (current_node != null && current_position < position) {
                current_node = current_node.next;
                current_position++;
            }
            if (current_node != null) {
                if (current_node == tail) {
                    tail = tail.previous;
                    tail.next = null;
                } else {
                    current_node.previous.next = current_node.next;
                    current_node.next.previous = current_node.previous;
                }
            }
        }
    }

    public String backwardTraversal() {
        Node current_node = tail;
        String result = "[";
        boolean first = true;
        while (current_node != null) {
            result += (!first ? ", " : "") + current_node.data;
            current_node = current_node.previous;
            first = false;
        }
        result += "]";
        return result;
    }
}
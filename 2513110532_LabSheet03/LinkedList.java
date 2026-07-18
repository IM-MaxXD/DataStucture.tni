public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public String traversal() {
        Node current_node = head;
        String result = "[";
        while (current_node != null) {
            result += current_node.data;
            if (current_node.next != null) {
                result += ", ";
            }
            current_node = current_node.next;
        }
        result += "]";
        return result;
    }

    public void insert(int position, Object value) {
        Node new_node = new Node(value);

        if (head == null) {
            head = new_node;
        } else if (position == 0) {
            new_node.next = head;
            head = new_node;
        } else {
            Node current_node = head;
            int current_position = 0;

            while (current_node != null && current_position < position - 1) {
                current_node = current_node.next;
                current_position++;
            }
            if (current_node != null) {
                new_node.next = current_node.next;
                current_node.next = new_node;
            }
        }
    }

    public void insert(Object value) {
        Node new_node = new Node(value);

        if (head == null) {
            head = new_node;
        } else {
            Node current_node = head;
            while (current_node.next != null) {
                current_node = current_node.next;
            }
            current_node.next = new_node;
        }
    }

    public void remove(int position) {
        if (head == null) return;

        if (position == 0) {
            head = head.next;
        } else {
            Node node = head;
            int curr_position = 0;

            while (node.next.next != null && curr_position < position - 1) {
                node = node.next;
                curr_position++;
            }
            if (node.next != null) {
                node.next = node.next.next;
            }
        }
    }

    public void removeLastElement() {
        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {
                Node node = head;
                while (node.next.next != null) {
                    node = node.next;
                }
                node.next = null;
            }
        }
    }

    public int length() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public Object get(int position) {
        Node current = head;
        int count = 0;
        while (current != null && count < position) {
            current = current.next;
            count++;
        }
        return (current != null) ? current.data : null;
    }

    public void set(int position, Object value) {
        Node current = head;
        int count = 0;
        while (current != null && count < position) {
            current = current.next;
            count++;
        }
        if (current != null) {
            current.data = value;
        }
    }

    public void clear() {
        head = null;
    }
}
public class LinkedList {
 Node head; // The first node of the list
 
 public LinkedList() {
 this.head = null; // The list starts empty
 }
 
 public String traversal() {
	 Node current_node = head;
	 String result = "";
	 while (current_node  != null) {
		 result += current_node.data;
		 current_node = current_node.next;
	 }
	 return result;
 }
 
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
		 Node current_node = head;
		 int current_position =0;
		 while (current_node != null && current_position < position-1) {
			 current_node = current_node.next;
			 current_position++;
		 }
		 new_node.next = current_node.next;
		 current_node.next = new_node;
	 }
 }
 // Common operations (insert, length, traversal, delete, get, etc.) go here
 
 public void insert (Object value) {
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
 
 public void remove (int position) {
	 if (position == 0) {
		 Node current_node = head;
		 head = current_node.next;
	 } else {
		 int current_position = 0;
		 while (current_node.next.next != null && current_position < position - 1) {
			 current_node = current_node.next;
			 current_position++;
		 }
	 }
	 current_node.next = current_node.next.next;
 }
 
 public void removeLastElement() {
	 if (head is null) {
		 if (head.next is null)
		 
	 }
 }
 
 public int length() {
	 return 0;
 }
 
 public Object get(int position) {
	 return null;
 }
 
}

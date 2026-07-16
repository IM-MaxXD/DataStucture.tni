public class TestLinkedNode {
 public static void main(String[] args) {
 Node node1 = new Node("Alice");
 System.out.print("node1 created! ");
 System.out.println("Address = " + Node.getAddress(node1));
 System.out.println("Data = " + node1.data);
 System.out.println("Pointer address = " + Node.getAddress(node1.next));
 Node node2 = new Node(25);
 System.out.print("\nnode2 created! ");
 System.out.println("Address = " + Node.getAddress(node2));
 System.out.println("Data = " + node2.data);
 System.out.println("Pointer address = " + Node.getAddress(node2.next));
 node1.next = node2;
 System.out.println("\nnode1 point to address: " + Node.getAddress(node1.next));
 System.out.println("node2 address = " + Node.getAddress(node2));
 System.out.println("node2 point to address: " + Node.getAddress(node2.next));
 
 Node node3 = new Node(true);
 Node node4 = new Node(17.5);
 
 node3.next = node3;
 node4.next = node4;
 
 
 
 }
}
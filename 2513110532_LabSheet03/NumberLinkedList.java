public class NumberLinkedList {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();

        numbers.insert(0, 37);
        numbers.insert(0, 7);
        numbers.insert(0, 4);
        numbers.insert(0, 16);
        System.out.println("All elements = " + numbers.traversal());

        numbers.insert(2, 20);
        System.out.println("Insert 20 to index 2 = " + numbers.traversal());

        numbers.insert(25);
        System.out.println("Append 25 into list = " + numbers.traversal());

        numbers.remove(0);
        System.out.println("Deleted the first element = " + numbers.traversal());

        numbers.remove(2);
        System.out.println("Deleted element index 2   = " + numbers.traversal());

        numbers.removeLastElement();
        System.out.println("Deleted the last element  = " + numbers.traversal());
        System.out.println();
        System.out.println("Length of elements in List = " + numbers.length());
        System.out.println("Element in index 1         = " + numbers.get(1));

        numbers.set(1, 100);
        System.out.println("Updated index 1 to 100     = " + numbers.traversal());

        numbers.clear();
        System.out.println("Clear Linked List          = " + numbers.traversal());
    }
}

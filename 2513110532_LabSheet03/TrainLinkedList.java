public class TrainLinkedList {
    public static void main(String[] args) {

        LinkedList greenline = new LinkedList();

        greenline.insert("Mo-chit");
        greenline.insert("Ari");
        greenline.insert("Sanam-Pao");

        System.out.println("All Stations : " + greenline.traversal());

        greenline.insert(2, "Rachakru");

        System.out.println("All Stations : " + greenline.traversal());
        System.out.println("Total Station: " + greenline.length());
        System.out.println("First Station: " + greenline.get(0));

        greenline.set(0, "Mo-Chit (Central Ladprao)");

        System.out.println("All Stations : " + greenline.traversal());

        greenline.remove(2);

        System.out.println("All Stations : " + greenline.traversal());

        greenline.removeLastElement();

        System.out.println("All Stations : " + greenline.traversal());

        greenline.clear();

        System.out.println("Total Station: " + greenline.length());
        System.out.println("All Stations : " + greenline.traversal());
    }
}
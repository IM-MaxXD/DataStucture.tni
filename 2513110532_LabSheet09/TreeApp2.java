package labSheet08;

public class TreeApp2 {
	public static void main(String[] args) {
		System.out.print("-------------------------------");
		System.out.print("Create Tree 4");
		System.out.println("-------------------------------");
		BinaryTree tree = new BinaryTree();
		tree.createTree4();
		tree.printTree(tree.getRoot(), 0);
		
		System.out.print("-------------------------------");
		System.out.print("Create Tree 5");
		System.out.println("-------------------------------");
		BinaryTree tree2 = new BinaryTree();
		tree2.createTree5();
		tree2.printTree(tree2.getRoot(), 0);
		
		System.out.print("-------------------------------");
		System.out.print("Create Tree 6");
		System.out.println("-------------------------------");
		BinaryTree tree3 = new BinaryTree();
		tree3.createTree6();
		tree3.printTree(tree3.getRoot(), 0);

	}
	
	
}

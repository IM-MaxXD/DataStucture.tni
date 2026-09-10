package lab_sheet08;

public class TreeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("-------------------------------");
		System.out.print("Create Tree 1");
		System.out.println("-------------------------------");
		
		BinaryTree tree = new BinaryTree();
		tree.createTree1();
		tree.printTree(tree.getRoot(), 0);

		
		System.out.print("-------------------------------");
		System.out.print("Create Tree 2");
		System.out.println("-------------------------------");
		
		BinaryTree tree2 = new BinaryTree();
		tree2.createTree2();
		tree2.printTree(tree2.getRoot(), 0);
		
		System.out.print("-------------------------------");
		System.out.print("Create Tree 3");
		System.out.println("-------------------------------");
		
		BinaryTree tree3 = new BinaryTree();
		tree3.createTree3();
		tree3.printTree(tree3.getRoot(), 0);
	}

}

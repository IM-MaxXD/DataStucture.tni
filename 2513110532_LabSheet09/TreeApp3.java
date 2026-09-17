package labSheet08;

public class TreeApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.print("-------------------------------");
		System.out.print("Create Tree 4");
		System.out.println("-------------------------------");
		BinaryTree tree = new BinaryTree();
		tree.createTree4();
		tree.printTree(tree.getRoot(), 0);
		
		tree.searchDeleteNode(11);
		System.out.println();
		System.out.println("Delete Node = " + tree.getDeleteNode().data);
		System.out.println("Parent = " + tree.getParent().data);
		System.out.println();
		
		int target = 11;
		tree.delete(target);
		tree.printTree(tree.getRoot(), 0);
		System.out.println(); */
		
		//5
		System.out.println("-------------------------------");
		System.out.println("Create Tree 4");
		System.out.println("-------------------------------");
		BinaryTree tree = new BinaryTree();
		tree.createTree4();
		tree.printTree(tree.getRoot(), 0);
		
		tree.searchDeleteNode(14);
		System.out.println();
		System.out.println("Delete Node = " + tree.getDeleteNode().data);
		System.out.println("Parent = " + tree.getParent().data);
		System.out.println("-------------------------------");
		
		int target = 11;
		tree.delete(target);
		tree.printTree(tree.getRoot(), 0);
		System.out.println("----------------------------------");
		
		int target1 = 25;
		tree.searchDeleteNode(target1);
		tree.delete(target);
		tree.printTree(tree.getRoot(),0);
		System.out.println("----------------------------------");
		
		int target2 = 40;
		tree.searchDeleteNode(target2);
		tree.delete(target2);
		tree.printTree(tree.getRoot(),0);
		System.out.println("----------------------------------");
		
		int target3 = 30;
		tree.searchDeleteNode(target3);
		tree.delete(target3);
		tree.printTree(tree.getRoot(),0);
	}

}

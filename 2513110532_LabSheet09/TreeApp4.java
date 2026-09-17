package labSheet08;

import java.util.Scanner;
 
public class TreeApp4 {
	public static void main(String[] args) {
		System.out.println("-------------------------------");
		System.out.println("Create Tree 6");
		System.out.println("-------------------------------");
		BinaryTree tree6 = new BinaryTree();
		tree6.createTree6();		
		tree6.printTree(tree6.getRoot(), 0);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number for delete: ");
		int n = sc.nextInt();
		
		Node current = tree6.getRoot();
		
		while (current != null && current.data != n) {
			if (n < current.data) {
				current = current.left;
			}else {
				current = current.right;
			}
		}
		
		if(current == null)
			System.out.println("Cannot found Node(Data = " + n + ")");
		else {
			if(current.left == null)
				System.out.println("No Left Child");
			else
				System.out.println("Left Child = " + current.left.data);
			
			if(current.right == null)
				System.out.println("No Right Child");
			else
				System.out.println("Right Child = " + current.right.data);
			
			if(current.left == null && current.right == null)
				System.out.println(n + " is Leaf Node");
			else
				System.out.println(n + " is Not Leaf Node");
		}
	}
}
 
 
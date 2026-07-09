import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[5];
		for (int i=0; i<nums.length; i++) {
			System.out.print("Enter number index " + i + ": ");
			nums[i] = scan.nextInt();
		}
		
		NumberArrayController numbers = new NumberArrayController();
		numbers.setNums(nums);
		numbers.display("\nDisplay all number");

	}

}


public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberArrayController nums = new NumberArrayController();
		nums.display("Display an inital array: ");
		
		int[] new_nums = new int[nums.getNums().length-1];
		
		for (int i=0; i<new_nums.length; i++) {
			new_nums[i] = nums.getNums()[i];
		}
		
		nums.setNums(new_nums);
		nums.display("\nAfter deleted the last element:");

	}

}
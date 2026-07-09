
public class NumberArrayController {
	private int[] nums;
	
	public NumberArrayController() {
		this.nums = new int[] {23, 67, 8, 91, 45, 12, 78};
	}
	
	public void setNums (int[] nums) {
		this.nums = nums;
	}
	public int[] getNums() {
		return nums;
	}
	public void display(String message) {
		System.out.println(message);
		boolean first_num = true;
		for (int num : nums) {

			System.out.print((!first_num ?", " : "") + num);
			first_num = false;
			
		}
	}
	
}

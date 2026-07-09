
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {23, 67, 8, 91, 45, 12, 78};
		
		System.out.println("Length = " + num.length);
		System.out.println("first num = " + num[0]);
		System.out.println("Last num = " + num[num.length-1]);
		System.out.println("Middle num = " + num[num.length/2]);

		System.out.println("All num display");
		boolean first_num = true;
		for (int nums : num) {

			System.out.print((!first_num ?", " : "") + nums);
			first_num = false;
			
		}
	}

}

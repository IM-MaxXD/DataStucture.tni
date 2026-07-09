import java.util.ArrayList;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		System.out.println("Length =" + nums.size());
		
		nums.add(11);
		nums.add(12);
		nums.add(13);
		nums.add(14);
		nums.add(15);
		
		System.out.println("Length =" + nums.size());
		System.out.println("All element =" + nums);
		
		int index_update = 2;
		int element_update = 20;
		
		nums.set(index_update, element_update);
		System.out.println("All elements =" + nums);
		
		int index_detele = 2;
		
		nums.remove(2);
		System.out.println("All elements =" + nums);
		
		int element_delete = 15;
		
		nums.remove(Integer.valueOf(element_delete));
		System.out.println("All elements =" + nums);
		
		nums.clear();
		System.out.println("All elements =" + nums);
	}

}

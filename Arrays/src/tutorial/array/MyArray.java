package tutorial.array;

public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] newArr = new String[5];  // Define new array by defining type followed by bracket then array name then assigning value to it
		newArr[0] = "hello";   // the number inside the bracket refers to an index with is the position of the element within the array
		newArr[1] = "hi";
		newArr[2] = "serge";
		newArr[3] = "bembe";
		newArr[4] = "mia";
		
		int[] nums = {2,3,54,6,6}; // You define & populate the array by using curly brackets
		
		double[] nums2 = {2.0, 3.0};
		
		int x = nums [4];
		String y = newArr[3];
		double z = nums2 [1];
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}

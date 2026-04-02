package phase01;

public class ArrayInsert {

	public static void main(String[] args) {
		int[] nums = {10, 20, 30, 40, 50};
        int insertAt = 2;  // position to insert
        int newValue = 99; // value to insert

        // shift elements to the right
        for(int i = nums.length - 1; i > insertAt; i--) {
            nums[i] = nums[i - 1];
        }

        nums[insertAt] = newValue;

        // print result
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

	}

}

package phase01;

public class twopointer {
	
	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3, 4, 6};
	        int target = 6;
	        
	        int left = 0;
	        int right = nums.length - 1;
	        
	        while(left < right) {
	            int sum = nums[left] + nums[right];
	            
	            if(sum == target) {
	                System.out.println("Pair found: " + nums[left] + " and " + nums[right]);
	                break;
	            } else if(sum < target) {
	                left++;
	            } else {
	                right--;
	            }
	        }
	    }
	}


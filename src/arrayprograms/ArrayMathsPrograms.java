package arrayprograms;

import java.util.HashMap;
import java.util.Map;

public class ArrayMathsPrograms {
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> complementMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (complementMap.containsKey(complement)) {
                return new int[] { complementMap.get(complement), i };
            }
            complementMap.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No two sum solution found");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = findTwoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        System.out.println("Values: [" + nums[result[0]] + ", " + nums[result[1]] + "]");
    }
}

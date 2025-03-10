import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
        int[] result1 = twoSum(new int[]{3, 2, 4}, 6);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");
        int[] result2 = twoSum(new int[]{3, 3}, 6);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");
    }

    
   public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
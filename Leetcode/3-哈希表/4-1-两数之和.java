import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> record = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (record.containsKey(temp)) {
                return new int[] {record.get(temp), i};
            }
            record.put(nums[i], i);
        }
        return new int[0];
    }
}
/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0;i < nums.length ; i++) {
            if(nums[i] > 0 ) {
                return result;
            }
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            HashSet<Integer> set = new HashSet<>();
            for(int j  = i+1;j<nums.length;j++) {
                if(j > i +2 && nums[j] == nums[j-1] && nums[j - 1] == nums[j - 2]) {
                    continue;
                }
                int c = -nums[i] - nums[j];
                if(set.contains(c)) {
                    result.add(Arrays.asList(nums[i],nums[j],c));
                    set.remove(c);
                } else {
                    set.add(nums[j]);
                }
            }
        }
        return result;
    }
}
    
// @lc code=end

public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0;i < nums.length;i++) {
            if (nums[i] > 0) {
                return result;
            } 
            if (i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (right > left) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right --;
                }
                else if (sum < 0) {
                    left ++;
                }
                else {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(right > left && nums[right] == nums[right - 1]) right--;
                    while (right > left && nums[left] == nums[left + 1]) left++;
                    right --;
                    left ++;
                }
                
            }
        }
        return result;
}
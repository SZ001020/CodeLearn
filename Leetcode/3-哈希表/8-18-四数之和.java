/*
 * @lc app=leetcode.cn id=18 lang=java
 *
 * [18] 四数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int k = 0;k<nums.length;k++) {
            if(nums[k] > target && nums[k] >=0) {
                break;
            }
            if(k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            for(int i = k + 1;i <nums.length;i++) {
                if(nums[i] > target - nums[k] && nums[k] + nums[i] >= 0) {
                    break;
                }
                if(i > k + 1 && nums[i] == nums[i - 1] ) {
                    continue;
                }
                int right = nums.length - 1;
                int left = i + 1;
                long sum = (long)target - nums[i] - nums[k];
                while(right > left) {
                    if(nums[right] + nums[left] < sum) {
                        left++;
                    }
                    else if(nums[right] + nums[left] > sum) {
                        right--;
                    }
                    else {
                        result.add(Arrays.asList(nums[k],nums[i],nums[right],nums[left]));

                        while(right > left && nums[right]  == nums[right-1]) right--;
                        while(right > left && nums[left] == nums[left+1]) left++;
                        right--;
                        left++;
                    }
                }
            }
        }
        return result;
    }
}
// @lc code=end


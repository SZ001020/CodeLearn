class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int l = 0;
        int res = Integer.MAX_VALUE;
        for(int i = 1; i<=nums.length;i++ ) {
            
            for (int j = 0; j<i; j++ ) {
                sum += nums[j];
                
                if (sum>=target) {
                    l = j - i + 1;
                    if (l<res) {
                        res = l;
                        break;
                    }
                }

            }
        }
        return  res == Integer.MAX_VALUE ? 0 : res;
    }
}

class Solution2 {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length;right++) {
            sum += nums[right];
            while (sum >= target) {
                res = Math.min(res,right - left + 1);
                sum -= nums[left++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
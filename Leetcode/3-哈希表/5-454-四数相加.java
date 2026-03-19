class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        // 使用 Map 存储 nums1 + nums2 的所有二数之和及其出现次数
        Map<Integer, Integer> map = new HashMap<>();
        
        // 第一步：遍历 nums1 和 nums2，记录所有二数和
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                int sum = num1 + num2;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        
        int res = 0;
        
        // 第二步：遍历 nums3 和 nums4，查询补集
        for (int num3 : nums3) {
            for (int num4 : nums4) {
                int sum = num3 + num4;
                // 查询是否存在 -(num3 + num4) 的二数和
                if (map.containsKey(-sum)) {
                    res += map.get(-sum);
                }
            }
        }
        
        return res;
    }
}
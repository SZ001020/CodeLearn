class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int dif = 0;

        for (int i = 0; i< n ;i++) {
            if  (nums[i] == val) {
                for (int j = i ;j < n-1;j++){
                    nums[j] = nums[j+1];
                    
                }
                n--;
            }
            
        }
        return n;

    }
}

class Solution {
    public int removeElement(int[] nums, int val) {

        int fastIndex = 0 ;
        int slowIndex;
        for (slowIndex = 0;fastIndex < nums.length ;fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;

    }
}
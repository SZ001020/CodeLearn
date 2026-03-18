import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resSet = new HashSet<>();

        for(int i : nums1) {
            set1.add(i);
        }

        for (int i : nums2) {
            if(set1.contains(i)) {
                resSet.add(i);
            }
        }
        
        return res.stream().mapToInt(Integer :: intValue).toArray();
 

    }
}


class Solution2 {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] hash1 = new int[1002];
        int[] hash2 = new int[1002];
        
        for (int i : nums1) {
            hash1[i] ++;
        }

        for (int i : nums2) {
            hash2[i] ++;
        }

        List<Integer> resList = new ArrayList<>();
        for (int i = 0 ; i<1002;i++) {
            if(hash1[i] >0 && hash2[i] >0) {
                resList.add(i);
            }
        }

        int index = 0;
        int res[] = new int [resList.size()];
        for (int i : resList) {
            res[index++] = i;
        }

        return res;
        
    }
}
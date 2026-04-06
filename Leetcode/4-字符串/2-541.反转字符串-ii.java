/*
 * @lc app=leetcode.cn id=541 lang=java
 *
 * [541] 反转字符串 II
 */

// @lc code=start
class Solution {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        for (int i  = 0;i< ch.length; i += 2*k) {
            int start = i;
            int end = Math.min(ch.length -1 ,start + k - 1);
            while ( start < end ) {
                ch[start] ^= ch[end];
                ch[end] ^= ch[start];
                ch[start] ^= ch[end];
                start ++;
                end --;
            }
            
        }
        return new String(ch);
    }
}
// @lc code=end

class Solution {
    public String reverseStr(String s, int k) {
        StringBuffer res = new StringBuffer();
        int length = s.length();
        int start = 0;
        while (start < length) {
         
            StringBuffer temp = new StringBuffer();
            int firstK = (start + k > length) ? length : start + k;
            int secondK = (start + (2*k) > length ) ? length : start + (2*k);

            temp.append(s.substring(start,firstK));
            res.append(temp.reverse());

            if(firstK < secondK) res.append(s.substring(firstK,secondK));

            start += (2*k);
        
        }
        return res.toString();
        
    }
}
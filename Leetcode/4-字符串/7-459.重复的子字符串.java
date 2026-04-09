/*
 * @lc app=leetcode.cn id=459 lang=java
 *
 * [459] 重复的子字符串
 */

// @lc code=start
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if (s.equals(" ")) return false;
        int len = s.length();
        s = " " + s;
        char[] chars = s.toCharArray();
        int[] next = new int[len + 1];
        for (int i = 2 , j = 0; i <= len ;i++) {
            while(j>0 && chars[i] != chars[j + 1]) j = next[j];
            if(chars[i] == chars[j+1]) j++;
            next[i] = j;
        }

        if(next[len] > 0 && len % (len - next[len]) == 0) {
            return true;

        }
        return false;
    }
}
// @lc code=end

class Solution2 {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        int[] next = new int[n];
        int j = 0;
        next[0] = 0;
        for (int i = 1; i < n;i++) {
            while(j>0 && s.charAt(i) != s.charAt(j)) {
                j = next[j-1];
            }
            if(s.charAt(i) == s.charAt(j)) {
                j++;
            }
            next[i] = j;
        }

        if(next[n - 1] > 0 && n % (n - next[n - 1]) == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
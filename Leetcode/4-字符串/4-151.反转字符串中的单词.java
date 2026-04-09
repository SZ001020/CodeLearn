/*
 * @lc app=leetcode.cn id=151 lang=java
 *
 * [151] 反转字符串中的单词
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = removeSpace(s);
        reverseString(sb,0,sb.length() - 1);
        reverseEachWord(sb);
        return sb.toString();
    }

    private StringBuilder removeSpace(String s) {
        int start = 0;
        int end = s.length() -1;
        while (s.charAt(start) == ' ') start++;
        while (s.charAt(end) == ' ') end--;
        StringBuilder sb = new StringBuilder();
        while(start <= end) {
            char c = s.charAt(start);
            if(c != ' ' || sb.charAt(sb.length() - 1) != ' ') {
                sb.append(c);
            } 
            start++;
        }
        return sb;
    }

    private void reverseString(StringBuilder sb ,int start,int end) {
        while(start < end ) {
            char temp = sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,temp);
            start++;
            end--;
        }
    }

    private void reverseEachWord(StringBuilder sb) {
        int start = 0;
        int end = 1;
        int n = sb.length();
        while(start < n) {
            while (end < n && sb.charAt(end) != ' ') {
                end++;
            }
            reverseString(sb,start,end - 1);
            start = end + 1;
            end = start + 1;
        }
    }

}
// @lc code=end

class Solution2 {
    public String reverseWords(String s) {
        char[] ch = s.toCharArray();
        ch = removeSpace(ch);
        reverse(ch,0,ch.length - 1);
        reverseEachWord(ch);
        return new String(ch);
    }

    private void reverseEachWord(char[] s) {
        int start = 0;
        
        for (int end = 0;end <= s.length;end++) {
            if (end == s.length || s[end] == ' ') {
                reverse(s,start,end - 1);
                start = end + 1;
            }
        }
        
    }

    private void reverse(char[] s,int l,int r) {

        while (r > l) {
            s[l] ^= s[r];
            s[r] ^= s[l];
            s[l] ^= s[r];
            r--;
            l++;
        }
        
    }

    private char[] removeSpace(char[] s) {
        
        int slow = 0;
        
        for(int fast = 0;fast < s.length;fast++) {
            if(s[fast] != ' ') {
                if(slow != 0) {
                    s[slow++] = ' ';
                }

                while (fast < s.length && s[fast] != ' ') {
                        s[slow++] = s[fast++];
                }
            }

            
            } 
        char[] newChar = new char[slow];
        System.arraycopy(s,0,newChar,0,slow);
        return newChar;
    }
}


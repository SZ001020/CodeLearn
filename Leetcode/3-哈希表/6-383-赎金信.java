class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letter1 = new int[26];
        int[] letter2 = new int[26];
        for(int i = 0;i<ransomNote.length;i++) {
            letter1[ransomNote.charAt(i) - 'a']++;
        }

        for(int i = 0;i<magazine.length;i++) {
            letter2[magazine.charAt(i) - 'a']++;
        }
        int res = 0;
        for(int i = 0 ;i < 26 ; i++) {

            if(letter1[i] > 0 && letter1[i] - letter2[i] == 0) {
                res++;
            }
        }
        if(res - ransomNote.length() == 0) {
            return true;
        }
        else {
            return false;
        }

    }
}
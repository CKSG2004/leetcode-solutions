class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l = word1.length()>word2.length() ? word1.length() : word2.length();
        String s = "";
        for(int i=0;i<l;i++){
            if(i<word1.length()) s=s+word1.charAt(i);
            if(i<word2.length()) s=s+word2.charAt(i);
        }
        return s;
    }
}
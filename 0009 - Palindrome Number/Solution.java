class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int j = 0;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(s.length()-1-i)){
                j++;
            }
        } 

        return (j == s.length()-1) ? true : false;
    }
}
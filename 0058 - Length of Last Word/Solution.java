class Solution {
    public int lengthOfLastWord(String s) {
        int idx=0;
        s=s.strip();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                idx=i;
                break;
            }
            if(i==0){
                return s.length();
            }
        }
        return s.length()-1-idx;
    }
}
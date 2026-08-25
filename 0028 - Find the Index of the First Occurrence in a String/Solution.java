class Solution {
    public int strStr(String h, String n) {
        int t=n.length();
        for(int i=0;i<h.length()-t;i++){
            if(h.substring(i,i+t).equals(n)){
                return i;
            }
        }
        return -1;
    }
}
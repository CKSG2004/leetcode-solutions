class Solution {
    public int searchInsert(int[] n, int t) {
        if(n[0]>=t){
            return 0;
        }
        if(n[n.length-1]<t){
            return n.length;
        }
        for(int i=1;i<n.length;i++){
            if(n[i]>=t){
                return i;
            }
        }
        return -1;
    }
}
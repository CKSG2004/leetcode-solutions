class Solution {
    public int smallestIndex(int[] n) {
        if(n[0]==0) return 0;
        for(int i=0;i<n.length;i++){
            int t=n[i];
            int s=0;
            while(t>0){
                s+=t%10;
                t=t/10;
                if(s>i) break;
            }
            if(s==i){
                return i;
            }
        }
        return -1;
    }
}
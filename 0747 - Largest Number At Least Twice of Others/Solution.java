class Solution {
    public int dominantIndex(int[] n) {
        int h=0;
        int idx=0;
        int th=0;
        for(int i=0; i<n.length; i++){
            if(n[i]>h){
                if(h*2>th) th=h*2;
                h=n[i];
                idx=i;
            }else{
                if(n[i]*2>th) th=n[i]*2;
            }
        }
        if(th>h) return -1;
        else return idx;
    }
}
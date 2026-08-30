class Solution {
    public int minimumDeletions(int[] n) {
        if(n.length==1) return 1;
        if(n.length==2) return 2;
        int mn=Integer.MAX_VALUE;
        int mx=Integer.MIN_VALUE;
        int in=0;
        int ix=0;
        for(int i=0; i<n.length;i++){
            if(n[i]<mn){
                mn=n[i];
                in=i;
            }
            if(n[i]>mx){
                mx=n[i];
                ix=i;
            }
        }
        in++;ix++;
        int t=0;
        if(in>ix){
            t=in;
            if((n.length-ix+1)<t){
                t=n.length-ix+1;
            }
            if((ix+n.length-in+1)<t){
                t=ix+n.length-in+1;
            }
        }else{
            t=ix;
            if((n.length-in+1)<t){
                t=n.length-in+1;
            }
            if((in+n.length-ix+1)<t){
                t=in+n.length-ix+1;
            }
        }
        return t;
    }
}
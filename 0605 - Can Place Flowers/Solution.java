class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int ctr=0;
        if(f[0]==0&&f[1]==0){
            f[0]=1;ctr++;
        }
        for(int i=1;i<f.length-1;i++){
            if(f[i-1]==0 && f[i]==0 && f[i+1]==0){
                f[i]=1;ctr++;
            }
        }
        if(f[f.length-1]==0 && f[f.length-2]==0){
            f[f.length-1]=1;ctr++;
        }
        if(ctr>=n){
            return true;
        }else{
            return false;
        }
    }
}
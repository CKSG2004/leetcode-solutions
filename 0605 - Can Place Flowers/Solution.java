class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        if(n==0) return true;
        if(n==1&&f[0]==0&&f.length==1) return true;
        int ctr=0;
        for(int i=0;i<f.length;i++){
            if(i==0){
                if(f[i]!=1&&f[i+1]!=1){
                    f[i]=1;
                    ctr++;
                    if(iG(n, ctr)){
                        return true;
                    }
                }
            }else if(i==f.length-1){
                if(f[i]!=1&&f[i-1]!=1){
                    f[i]=1;
                    ctr++;
                    if(iG(n, ctr)){
                        return true;
                    }
                }
            }else{
                if(f[i-1]==0&&f[i]==0&&f[i+1]==0){
                    f[i]=1;
                    ctr++;
                    if(iG(n, ctr)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean iG(int n, int ctr){
        if(ctr>=n){
            return true;
        }
        return false;
    }
}
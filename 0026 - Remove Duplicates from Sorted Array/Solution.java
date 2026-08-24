class Solution {
    public int removeDuplicates(int[] n) {
        int k=0;
        for(int i=1;i<n.length;i++){
            if(n[i-1]==n[i]){
                int lv=i+1;
                while(n[lv]==n[i]){
                    lv++;
                }
                n[i]=n[lv];
                if(lv==n.length-1){
                    k=i;
                    break;
                }
            }
        }
        return k;
    }
}
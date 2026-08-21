class Solution {
    public void merge(int[] n1, int m, int[] n2, int n) {
        if(m==0){System.out.println(n2.toString()); return;}
        if(n==0){System.out.println(n1.toString()); return;}
        
        int[] n3=new int[n+m];
        int o=0;
        int t=0;
        int i=0;
        while(i<n3.length){
            if(n1[o]<=n2[t]&&n1[o]>0){
                n3[i]=n1[o];
                o++;
                i++;
            }else{
                n3[i]=n1[o];
                t++;
                i++;
            }
            if(i>m){
                break;
            }
        }
        System.out.println(n3.toString());
    }
}
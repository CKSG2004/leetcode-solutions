class Solution {
    public int removeElement(int[] a, int val) {
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=val){
                a[c] = a[i];
                c++;
            }
        }
        return c;
    }
}
class Solution {
    public int[][] mergeArrays(int[][] n1, int[][] n2) {
        List<int[]> r = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n1.length&&j<n2.length){
            if(n1[i][0]==n2[j][0]){
                r.add(new int[]{n1[i][0], n1[i][1]+n2[j][1]});
                i++;j++;
            }
            else if(n1[i][0]<n2[j][0]){
                r.add(n1[i]);
                i++;
            }else{
                r.add(n2[j]);
                j++;
            }           
        }
        while(i<n1.length) r.add(n1[i++]);
        while(j<n2.length) r.add(n2[j++]);
        
        return r.toArray(new int[r.size()][]);
    }
}
class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int e) {
        int h=0;
        List<Boolean> l = new ArrayList<>();
        for(int i=0;i<c.length;i++){
            if(c[i]>h){h=c[i];}
        }
        for(int i=0;i<c.length;i++){
            if((c[i]+e)>=h){l.add(true);}else{l.add(false);}
        }
        return l;
    }
}
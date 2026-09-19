class Solution {
    public List<Integer> findMissingElements(int[] n) {
        int mn=101;
        int mx=0;
        for(int i=0;i<n.length;i++){
            if(n[i]>mx) mx=n[i];
            if(n[i]<mn) mn=n[i];
        }
        ArrayList<Integer> op = new ArrayList<>();
        for(int i=mn+1;i<mx;i++){
            if(!isAvail(i, n)){
                op.add(i);
            }
        }
        return op;
    }
    boolean isAvail(int n,int[] nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==n){
                return true;
            }
        }
        return false;
    }
}
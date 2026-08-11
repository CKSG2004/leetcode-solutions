class Solution {
    public int findGCD(int[] nums) {
        int mx=nums[0];
        int mn=nums[0];
        int temp = 0;
        for(int i=1;i<nums.length;i++){
            if(mx<nums[i]){
                mx=nums[i];
            }
            if(mn>nums[i]){
                mn=nums[i];
            }
        }
        while(mn!=0){
            temp=mn;
            mn=mx%mn;
            mx=temp;
        }
        return mx;
    }
}
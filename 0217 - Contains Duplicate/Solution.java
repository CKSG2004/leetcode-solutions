import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> old=new HashSet<>();
        for(int num: nums){
            if(old.contains(num)){
                return true;
            }
            old.add(num);
        }
        return false;
    }
}
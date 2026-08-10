class Solution {
    public int[] twoSum(int[] n, int t) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n.length;i++){
            int c=t-n[i];
            if(map.containsKey(c)){
                return new int[]{map.get(c),i};
            }
            else{
                map.put(n[i], i);
            }
        }
        return null;
    }
}
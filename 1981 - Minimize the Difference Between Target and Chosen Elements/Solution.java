class Solution {
    public int minimizeTheDifference(int[][] mat, int target) {
        
        Set<Integer> sums= new HashSet<>();
        sums.add(0);

        for(int[] row:mat){
            Set<Integer> newSums = new HashSet<>();
            for(int sum:sums){
                for(int num:row){
                    newSums.add(sum+num);
                }
            }
            sums=newSums;
        }

        int minDiff=Integer.MAX_VALUE;
        for(int sum:sums){
            minDiff=Math.min(minDiff, Math.abs(sum-target));
        }
        return minDiff;

    }
}
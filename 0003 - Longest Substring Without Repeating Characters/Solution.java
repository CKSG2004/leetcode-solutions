class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1) return 1;
        int len=0;
        for(int i=0;i<s.length();i++){
            int r=i;
            int l=i;
            HashMap<Character, Integer> mp=new HashMap<>();
            while(true){
                if(r<s.length()&&!mp.containsKey(s.charAt(r))){
                    mp.put(s.charAt(r++),1);
                }else{
                    mp.clear();
                    if(len<(r-l)){
                        len=r-l;
                    }
                    break;
                }
            }
        }
        return len;
    }
}
class Solution {
    public String minWindow(String s, String t) {
        String result = "";
        if(s.length()<t.length()){
            return result;
        }
        int tCount[] = new int[128];

        for(char c : t.toCharArray()){
            tCount[c]++;
        }

        int left=0, right=0;
        int toFind = t.length();
        int found = 0;
        int mnwl = Integer.MAX_VALUE;
        char[] sChars = s.toCharArray();

        while(right<s.length()){
            char ch = s.charAt(right);
            tCount[ch]--;
            if(tCount[ch]>=0){
                found++;
            }
            while(found==toFind){
                if(mnwl > (right-left+1)){
                    mnwl=right-left+1;
                    result=s.substring(left, right+1);
                }
                tCount[sChars[left]]++;
                if(tCount[sChars[left]]>0){
                    found--;
                }
                left++;
            }
            right++;
        }
        return result;
    }
}
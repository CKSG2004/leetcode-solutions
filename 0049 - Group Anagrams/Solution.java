import java.util.Arrays;
class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        if(s==null||s.length==0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for(String s1: s){
            char[] c = s1.toCharArray();
            Arrays.sort(c);
            String s2 = new String(c);
            if(!map.containsKey(s2)){
                map.put(s2, new ArrayList<String>());
            }
            map.get(s2).add(s1);
        }
        return new ArrayList<>(map.values());
    }
}
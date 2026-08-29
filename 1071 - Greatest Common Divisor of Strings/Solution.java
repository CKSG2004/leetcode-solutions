class Solution {
    public String gcdOfStrings(String s1, String s2) {
        if(!(s1+s2).equals(s2+s1)){
            return "";
        }
        int o = gcd(s1.length(), s2.length());
        return s1.substring(0,o);
    }
    int gcd(int n1, int n2){
        if(n2==0) return n1;
        return gcd(n2, n1%n2);
    }
}
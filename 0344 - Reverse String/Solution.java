class Solution {
    public void reverseString(char[] s) {
        int n=s.length-1;
        for(int i=0;i<s.length/2;i++){
            char temp=s[i];
            s[i]=s[n];
            s[n--]=temp;
        }
        System.out.print("[");
        for(int i=0;i<s.length;i++){
            if(i<s.length-1) System.out.print("\""+s[i]+"\",");
            else System.out.print("\""+s[i]+"\"");
        }
        System.out.print("]");
    }
}
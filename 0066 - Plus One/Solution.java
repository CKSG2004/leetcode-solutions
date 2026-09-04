import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] d) {
        // 1. Convert the array to a String properly
        StringBuilder sb = new StringBuilder();
        for (int num : d) {
            sb.append(num);
        }
        String s = sb.toString();
        
        // 2. Use BigInteger to handle unlimited digits and add 1
        BigInteger b = new BigInteger(s);
        b = b.add(BigInteger.ONE);
        
        // 3. Convert back to String
        s = b.toString();
        
        // 4. Populate your result array using your exact char subtraction logic
        int[] n = new int[s.length()];
        for (int i = 0; i < n.length; i++) {
            n[i] = s.charAt(i) - '0';
        }
        
        return n;
    }
}

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        // Convert string to char array to iterate through it
        for (char c : s.toCharArray()) {
            // When we see an open bracket, push the corresponding closing bracket
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } 
            // If it's a closing bracket, check if it matches what we expect
            else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        
        // If the stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }
}
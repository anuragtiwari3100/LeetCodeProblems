import java.util.Stack;

class Solution {
    public int minAddToMakeValid(String s) {
        int imbalanceCount = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(') {
                stack.push(currentChar);
            } else {
                if (stack.isEmpty()) {
                    imbalanceCount++;
                } else {
                    stack.pop();
                }
            }
        }

        return imbalanceCount + stack.size();
    }
}
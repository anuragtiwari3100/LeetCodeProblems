class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> openStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                openStack.push(i);
            } else if (ch == '*') {
                starStack.push(i);
            } else if (ch == ')') {
                if (!openStack.isEmpty()) {
                    openStack.pop();
                } else if (!starStack.isEmpty()) {
                    starStack.pop();
                } else {
                    return false;
                }
            }
        }

        // Match any remaining '(' with '*' that comes later
        while (!openStack.isEmpty() && !starStack.isEmpty()) {
            if (openStack.peek() > starStack.peek()) {
                return false;
            }
            openStack.pop();
            starStack.pop();
        }

        return openStack.isEmpty();
    }
}

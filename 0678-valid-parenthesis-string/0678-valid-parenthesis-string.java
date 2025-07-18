class Solution {
    public boolean checkValidString(String s) {
        int minOpen = 0, maxOpen = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                minOpen++;
                maxOpen++;
            } else if (ch == ')') {
                minOpen--;
                maxOpen--;
            } else { // '*'
                minOpen--;    // assume * as ')'
                maxOpen++;    // or assume * as '('
            }

            // If at any point, too many ')'
            if (maxOpen < 0) return false;

            // minOpen can't be negative
            minOpen = Math.max(minOpen, 0);
        }

        return minOpen == 0;
    }
}

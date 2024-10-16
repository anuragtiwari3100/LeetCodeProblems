class Solution {
    public String longestDiverseString(int a, int b, int c, char A, char B, char C) {
        if (a < b) {
            return longestDiverseString(b, a, c, B, A, C);
        }
        if (b < c) {
            return longestDiverseString(a, c, b, A, C, B);
        }
        if (b == 0) {
            return new String(new char[Math.min(a, 2)]).replace('\0', A);
        }

        int useA = Math.min(a, 2);
        int useB = (a - useA >= b) ? 1 : 0;

        return new String(new char[useA]).replace('\0', A) +
               new String(new char[useB]).replace('\0', B) +
               longestDiverseString(a - useA, b - useB, c, A, B, C);
    }

    public String longestDiverseString(int a, int b, int c) {
        return longestDiverseString(a, b, c, 'a', 'b', 'c');
    }
}

class Solution {
    public long minimumSteps(String s) {
        int n = s.length();     
        long swap = 0;         
        int black = 0;        

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') { 
                swap += black;         
            } else {
                black++;             
            }
        }

        return swap;
}
}

class Solution {


    
    public boolean isPalindrome(String str,int left, int right){
        int n = str.length();
        while(left < right ){
            if(str.charAt(left) != str.charAt(right)){
        return false;
            }
        left ++;
        right --;
        }
    
            return true;

    }

    public boolean validPalindrome(String s) {
        int n = s.length();
        int left =0;
        int right =n-1;
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
              return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left ++;
            right --;
        }
        return true;
    }


}
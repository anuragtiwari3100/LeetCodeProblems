class Solution {
    public boolean isPalindrome(int n) {
    int duplicate =n;
    int revOfNum =  0;
    while( n > 0){
        int lastDigit = n% 10;
         revOfNum = (revOfNum * 10)+lastDigit;
         n = n/ 10;
    }
      return  revOfNum ==  duplicate;
    }
}
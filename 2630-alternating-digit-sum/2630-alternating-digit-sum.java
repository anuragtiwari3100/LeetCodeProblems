class Solution {
    public int alternateDigitSum(int n) {
           int res =0;
     String  str = Integer.toString(n);
     char[] ch = str.toCharArray();
     for(int i=0; i<ch.length; i++ ){
        int digit = Character.getNumericValue(ch[i]);
        if(i%2 ==0){
        res += digit;
        }
 else{
            res -= digit;       

 }
     }
    return  res;
    }
}
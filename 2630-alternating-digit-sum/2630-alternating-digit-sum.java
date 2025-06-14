class Solution {
    public int alternateDigitSum(int n) {
           int res =0;
     String  str = Integer.toString(n);
     char[] ch = str.toCharArray();
     for(int i=0; i<ch.length; i++ ){//3
        if(i%2 ==0){
        res =res+ Character.getNumericValue(ch[i]);
        } else{
             res =res - Character.getNumericValue(ch[i]);

        }       

     }
    return  res;
    }
}
class Solution {

  public  static int calculate(char ch){
        switch(ch){
            case 'I' :return 1;
            case 'V' :return 5;
            case 'X' :return 10;
            case 'L' :return 50;
            case 'C' :return 100;
            case 'D' :return 500;
            case 'M' :return 1000;
            default  :return 0;
        }
  }

    public int romanToInt(String s) {
       int n = s.length();
        int ans =0;
        int v1,v2;
        for(int i=0; i<n; i++){   //traversing over string
            v1=calculate(s.charAt(i));
            if(i<n-1){  //verifying for further value exist or  not 
                v2=calculate(s.charAt(i+1));
                if(v1<v2){
                    ans -=v1;
                }else{
                    ans +=v1;
                }
            }else{    //nothing is there to compare so  just add it
                ans +=v1;
            }
        }
        return ans;
    }
}


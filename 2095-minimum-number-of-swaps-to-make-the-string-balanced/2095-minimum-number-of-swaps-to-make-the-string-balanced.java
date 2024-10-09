class Solution {
    public int minSwaps(String s) {

         // int count =0;
        // for(int i=0; i<s.length(); i++){
        //       if(s.charAt(i) == '['){
        //         count++;
        //       }else if(count  >0){
        //         count --;
        //       }           
             
        // }
        //  return  ( count+1)/2;

        //->>>>>>>>>>>>>
        Stack<Character> st = new Stack<>();
        int count=0;
        for(int i=0; i<s.length(); i++){
            int curr = s.charAt(i);
            if(curr == '['){
                st.push('[');
            }else if(curr == ']'){
                if(!st.isEmpty() && st.peek()=='['){
                    st.pop();
                }else{
                    count++;
                }
            }
        }
      return (count+1)/2;
        
    }
}

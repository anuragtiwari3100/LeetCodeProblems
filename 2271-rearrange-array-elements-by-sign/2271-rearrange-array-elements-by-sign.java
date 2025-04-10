class Solution {
    public int[] rearrangeArray(int[] abhishek) {
       int n= abhishek.length;
        int pos[] = new int[n/2];
        int neg[] = new int[n/2];
        int p_Couter=0;
        int n_Counter=0;
        for(int i=0; i<abhishek.length;i++){
            if(abhishek[i]>0){
               pos[p_Couter] =abhishek[i] ;
               p_Couter++;
            }else{
               neg[n_Counter] =abhishek[i] ;
               n_Counter++;
            }
        }
        
        for(int i=0; i<abhishek.length/2; i++){
            abhishek[2*i] = pos[i];
            abhishek[2*i+1] = neg[i];
        }
        return abhishek;
    }
   
}
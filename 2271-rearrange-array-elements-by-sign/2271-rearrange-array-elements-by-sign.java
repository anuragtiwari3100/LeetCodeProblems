class Solution {
/*
    public int[] rearrangeArray(int[] arr) {
       int n= arr.length;
        int pos[] = new int[n/2];
        int neg[] = new int[n/2];
        int p_Couter=0;
        int n_Counter=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>0){
               pos[p_Couter] =arr[i] ;
               p_Couter++;
            }else{
               neg[n_Counter] =arr[i] ;
               n_Counter++;
            }
        }
        
        for(int i=0; i<arr.length/2; i++){
            arr[2*i] = pos[i];
            arr[2*i+1] = neg[i];
        }
        return arr;
    }
 */

 /*
 
       public static int[] arrange(int arr[]){
        ArrayList<Integer> pos= new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int resArr[] = new int[arr.length];
          for(int i=0; i<arr.length; i++){
              if(arr[i]>0){
                  pos.add(arr[i]);
              }else{
                  neg.add(arr[i]);
              }
          }
          for(int i=0; i<arr.length/2; i++){
              arr[2*i] = pos.get(i);
              arr[2*i+1] = neg.get(i);
          }
          return arr;
    }
  */
      public int[] rearrangeArray(int[] arr) {
        int n = arr.length;
         int pos_index =0;
         int neg_index =1;
         int resArr[] = new int[n];
         for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                if(pos_index < n){
                    resArr[pos_index]= arr[i];
                    pos_index +=2;
                }
            }else{
                if(neg_index < n){
                    resArr[neg_index] = arr[i];
                    neg_index += 2;
                }
            }
         }
            return resArr;
    }
   
}
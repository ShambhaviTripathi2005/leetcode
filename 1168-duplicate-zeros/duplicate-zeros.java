class Solution {
    public void duplicateZeros(int[] arr) {
        int []desa = new int[arr.length];
        int des=0;
        int so=0;

        while(so<arr.length){
            if(arr[so]==0){
                if(des<arr.length){
                    desa[des]=0;

                }
                
                des+=1;
                if(des<arr.length){
                    desa[des]=0;

                }
                
            }
            else{
                if(des<arr.length){
                    desa[des] = arr[so];
                }
                
            }
            des+=1;
            so+=1;
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = desa[i];
        }
    }
}
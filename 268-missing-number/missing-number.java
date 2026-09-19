class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n+1;i++){
            boolean flag=false;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    flag = true;
                }
            }
            if(flag==false){
                return i;
            }
        }
        
    return -1;
        }
}
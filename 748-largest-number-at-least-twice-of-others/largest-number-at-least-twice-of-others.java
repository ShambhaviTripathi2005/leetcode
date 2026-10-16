class Solution {
    public int dominantIndex(int[] nums) {
        int inx = -1, max1 = -1,max2=-1;
        // 3 6 1 0 
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max1){
                max2 = max1;
                max1 = nums[i];
                inx = i;
            }
            else if(nums[i]>max2){
                max2 = nums[i];
            }
        }
        return max1>=(2*max2) ? inx:-1;
        
    }
}
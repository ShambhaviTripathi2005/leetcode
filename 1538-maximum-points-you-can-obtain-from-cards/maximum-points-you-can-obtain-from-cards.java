class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int left =0,right=0,maxi=0;
        for(int i=0;i<k;i++){
            left+=cardPoints[i];
        }
        maxi = left;
        int r = n-1;
        for(int i=k-1;i>=0;i--){
            left = left - cardPoints[i];
            right = right+cardPoints[r];
            r--;
            maxi = Math.max(maxi,left+right);


        }
        return maxi;
        
    }
}
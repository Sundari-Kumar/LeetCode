class Solution {
    public double findMaxAverage(int[] nums, int k) {
    int n=nums.length;
    int windowSum=0;
    for(int i=0;i<k;i++){
        windowSum+=nums[i];
    } 
    double avg=(double)windowSum/k;
    for(int i=0;i<n-k;i++){
        windowSum-=nums[i];
        windowSum+=nums[k+i];
        avg=Math.max(avg,(double)windowSum/k);

    }
    return avg;
   
    }
}
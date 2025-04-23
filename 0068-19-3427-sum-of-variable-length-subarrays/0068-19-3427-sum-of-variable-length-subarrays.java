class Solution {
    public int subarraySum(int[] nums) {
    int n=nums.length;
    int[] prefixSum=new int[n+1];
    for(int i=0;i<n;i++){
        prefixSum[i+1]=prefixSum[i]+nums[i];
        

    } 
    int sum=0;
    for(int i=0;i<n;i++){
        int start=Math.max(0,i-nums[i]);
        sum+=prefixSum[i+1]-prefixSum[start];
    }
    return sum;
    }
}
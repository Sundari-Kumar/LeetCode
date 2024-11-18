class Solution {
    public int[] productExceptSelf(int[] nums) {
    int[] ans=new int[nums.length];
        int t=1;
    for(int i=0;i<nums.length;i++){
     ans[i]=t;
        t=t*nums[i];
    }
        t=1;
        for(int j=nums.length-1;j>=0;j--){
            ans[j]=ans[j]*t;
            t=t*nums[j];
        }
        return ans;
    }
}
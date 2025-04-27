class Solution {
    public int findMaxLength(int[] nums) {
    Map<Integer,Integer> prefixSum=new HashMap<>();
    int balance=0;
    int maxLength=0;
    prefixSum.put(0,-1);
    for(int i=0;i<nums.length;i++){
        if(nums[i]==0)
            balance-=1;
            else balance+=1;
    if(prefixSum.containsKey(balance)){
        int prevIndex=prefixSum.get(balance);
        maxLength=Math.max(maxLength,i-prevIndex);
    }
    else{
        prefixSum.put(balance,i);
    }
        
    } 
    return maxLength;   
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
    Map<Integer,Integer> stock=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int diff=target-nums[i];
        if(stock.containsKey(diff)){
            return new int[] {stock.get(diff),i};
        }
        stock.put(nums[i],i);
    }
    return new int[]{};
    }
}
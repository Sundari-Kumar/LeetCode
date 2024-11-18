class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int totalCost=0;
        int totalGas=0;
        int tank=0;
        int startindex=0;
        for(int i=0;i<gas.length;i++){
            totalCost+=cost[i];
            totalGas+=gas[i];
            tank+=gas[i]-cost[i];
            if(tank<0){
                startindex=i+1;
                tank=0;
            }
            
        }
        return totalGas>=totalCost? startindex:-1;
    }
}
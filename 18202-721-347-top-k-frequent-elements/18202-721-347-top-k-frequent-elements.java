class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer,Integer> freq=new HashMap<>();
      for(int num:nums){
        freq.put(num,freq.getOrDefault(num,0)+1);
      }
      PriorityQueue<Map.Entry<Integer,Integer>> minHeap=new PriorityQueue<>((a,b)-> a.getValue()- b.getValue());
      for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
        minHeap.add(entry);
        if(minHeap.size()>k){
            minHeap.poll();
        }

      }
        int[] result=new int[k];
        int i=0;
        while(!minHeap.isEmpty()){
            result[i++]=minHeap.poll().getKey();
        }
        return result;
    }
}
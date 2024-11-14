class RandomizedSet {
    private List<Integer> list;
    private Map<Integer,Integer> map;
    public RandomizedSet() {
        list=new ArrayList<>();
        map=new HashMap<>();
    }
    
    public boolean insert(int val) {
      if(map.containsKey(val))  {
          return false;
      } 
        list.add(val);
        map.put(val,list.size()-1);
            return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
            int pos=map.get(val);
        if(pos!=list.size()-1){
            int last=list.get(list.size()-1);
            list.set(pos,last);
            map.put(last,pos);
        
        }
        list.remove(list.size()-1);
        map.remove(val);
        return true;
            
        
    }
    
    public int getRandom() {
        Random rand=new Random();
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
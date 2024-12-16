class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    HashMap<Character,Integer> magset=new HashMap<>();
    for(char c:magazine.toCharArray()) {
       magset.put(c,magset.getOrDefault(c,0)+1);
    }
       for (char c:ransomNote.toCharArray()){
           if(!magset.containsKey(c)||magset.get(c)==0){
               return false;
           }
           magset.put(c,magset.get(c)-1);
       
    } 
        return true;
    }
}
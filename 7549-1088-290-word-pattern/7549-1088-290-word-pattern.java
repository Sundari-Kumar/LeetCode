class Solution {
    public boolean wordPattern(String pattern, String s) {
     String[] str=s.split(" ");
    if(pattern.length()!=str.length){
        return false;
    }
    HashMap<Character,String> hm=new HashMap<>();
    HashSet<String> words=new HashSet<>();
    for(int i=0;i<str.length;i++){
        char c=pattern.charAt(i);
        String word=str[i];
        if(hm.containsKey(c)){
            if(!hm.get(c).equals(word)) return false;
        }
            else {
                if(words.contains(word)) return false;
                hm.put(c,word);
                words.add(word);
            }
            
        

    }
        return true;

        
    }
}
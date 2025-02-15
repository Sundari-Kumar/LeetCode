class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
    HashMap<Character,Character> mapst=new HashMap<>();
    HashMap<Character,Character> mapts=new HashMap<>();
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        char d=t.charAt(i);
        if(mapst.containsKey(c)&&mapst.get(c)!=d){
            return false;
        }
        if(mapts.containsKey(d)&&mapts.get(d)!=c){
            return false;
        }
        mapst.put(c,d);
        mapts.put(d,c);
    }
    return true;
    }
}
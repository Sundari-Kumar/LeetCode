class Solution {
    public int lengthOfLongestSubstring(String s) {
     int i=0,maxlen=0;
     Set<Character> substring=new HashSet<>();
     for(int j=0;j<s.length();j++){
        while(substring.contains(s.charAt(j))){
            substring.remove(s.charAt(i++));
            
        }
        substring.add(s.charAt(j));
        maxlen=Math.max(maxlen,j-i+1);
     } 
     return maxlen;  
    }
}
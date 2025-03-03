class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length()) return false;
        int[] arr=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        } 
        for(char d:t.toCharArray()){
            arr[d-'a']--;
        }
        for(int count:arr){
            if(count!=0) return false;
        }
        return true;
    }
}
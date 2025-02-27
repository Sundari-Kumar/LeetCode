class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    int n=p.length();
    if (n > s.length()) return new ArrayList<>();
    int[] p_freq=new int[26];
    int[] s_freq=new int[26];
    List<Integer> result=new ArrayList<>();
    for(int i=0;i<n;i++){
        p_freq[p.charAt(i)-'a']++;
        s_freq[s.charAt(i)-'a']++;
    } 
    for(int i =0;i<=s.length()-n;i++){
        if(Arrays.equals(s_freq,p_freq)){
            result.add(i);
        }
        
        if(n+i<s.length()){
        s_freq[s.charAt(i)-'a']--;
        s_freq[s.charAt(n+i)-'a']++;
        }

    }
    return result;
    }
}
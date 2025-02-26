class Solution {
    public String reverseWords(String s) {
    StringBuilder sc=new StringBuilder();
    String[] word=s.trim().split("\\s+");
    for(int i=word.length-1;i>=0;i--){
        sc.append(word[i]);
        if(i>0){
            sc.append(" ");
        }
    }
    
    return sc.toString();    
    }
}
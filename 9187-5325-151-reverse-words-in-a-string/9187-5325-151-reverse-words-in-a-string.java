class Solution {
    public void reverse(int left,int right,char[] arr){
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        
    }
    public String reverseWords(String s) {
    s=s.trim().replaceAll("\\s+"," ");
    char[] word=s.toCharArray();
    
        
        reverse(0,word.length-1,word);
        int start=0;
        for(int end=0;end<=word.length;end++){
            if(end==word.length||word[end]==' '){
                reverse(start,end-1,word);
                start=end+1;
            }
        }
        return new String(word);
    }
}
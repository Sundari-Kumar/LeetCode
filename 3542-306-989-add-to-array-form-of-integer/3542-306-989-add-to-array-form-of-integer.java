class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result=new ArrayList<>();
    int i=num.length-1;
    while(k>0 || i>=0) {
        int digit=(i>=0)?num[i]:0 ;
        int sum=digit+k;
        result.add(sum%10);
        k=sum/10;
        i--;
    }
    Collections.reverse(result); 
    return result;
    }
}
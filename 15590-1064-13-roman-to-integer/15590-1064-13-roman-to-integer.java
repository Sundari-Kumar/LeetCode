class Solution {
    public int romanToInt(String s) {
    HashMap<Character,Integer> rt=new HashMap<>();
    rt.put('I',1);
    rt.put('V',5);
    rt.put('X',10);
    rt.put('L',50);
    rt.put('C',100);
    rt.put('D',500);
    rt.put('M',1000);
    int sum=0;
        int prev=0;
    for(int i=s.length()-1;i>=0;i--){
        int cur=rt.get(s.charAt(i));
        if(cur<prev){
            sum-=cur;
        }
        else sum+=cur; 
        prev=cur;
    }
        return sum;
    }
}
class Solution {
    public int myAtoi(String s) {
    s=s.trim();
    int n=s.length();
    if(n==0) return 0;
    int sum=0;
    int i=0;
    int sign=1;
        if(s.charAt(i)=='-'||s.charAt(i)=='+'){
            sign=(s.charAt(i)=='-')? -1:1;
            i++;
        }
        while(i<n&&Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            if(sum>(Integer.MAX_VALUE-digit)/10){
                return (sign==-1)? Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            sum=sum*10+digit;
        i++;

        }
         return sign*sum;
    }
   
    }

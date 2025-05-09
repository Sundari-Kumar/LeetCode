class Solution {
    public String multiply(String num1, String num2) {
    if(num1.equals("0")||num2.equals("0")) return "0";
    int m=num1.length();
    int n=num2.length(); 
    int[] result=new int[n+m];
    for(int i=m-1;i>=0;i--){
        int digit1=(i>=0)?num1.charAt(i)-'0':0;
        for(int j=n-1;j>=0;j--){
            int digit2=(j>=0)?num2.charAt(j)-'0':0;
            int mul=digit1*digit2;
            int p2=i+j+1;
            int p1=i+j;
            int sum=mul+result[p2];
            result[p2]=sum%10;
            result[p1]+=sum/10;

        }
    }  
    StringBuilder sb=new StringBuilder();
    for(int num:result){
        if(!(sb.length()==0&&num==0)){
            sb.append(num);
        }
    }
    return sb.toString();
    }
}
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> nhas=new HashSet<>();
          while(n!=1 && !nhas.contains(n)){
              nhas.add(n);
              int sum=0;
              while(n>0){
                  int r=n%10;
                  sum+=(r*r);
                  n=n/10;
              }
              n=sum;
          } 
        return n==1;
       
    }
}
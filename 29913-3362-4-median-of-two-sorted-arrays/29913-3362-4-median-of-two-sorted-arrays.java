class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m=nums1.length;
            int n=nums2.length;
            int len=m+n;
            if(m>n){
                int[] temp=nums1;
                nums1=nums2;
                nums2=temp;
                m=nums1.length;
                n=nums2.length;
            }
            int low=0;
            int high=m;
            while(low<=high){
            int i=(low+high)/2;
            int j=(len+1)/2-i;
            int maxLeftA=(i==0)? Integer.MIN_VALUE:nums1[i-1];
            int minRightA=(i==m)? Integer.MAX_VALUE:nums1[i];
            int maxLeftB=(j==0)? Integer.MIN_VALUE:nums2[j-1];
            int minRightB=(j==n)? Integer.MAX_VALUE: nums2[j];
            if(maxLeftA<=minRightB&&maxLeftB<=minRightA){
                if(len%2==0){
                    return (Math.max(maxLeftA,maxLeftB)+Math.min(minRightA,minRightB))/2.0;
                }
                else return Math.max(maxLeftA,maxLeftB);
            }
            else if(maxLeftA>minRightB){
                high=i-1;
            
            }
            else low=i+1;
            
            }
         return 0.0;   
    }
}
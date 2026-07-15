class Solution {
    public String reverseStr(String s, int k) {
        char[]a=s.toCharArray();

        for(int i=0;i<a.length;i+=2*k){
        int start=i;
        int end =Math.min(i+k-1,a.length-1);
        reverse(a,start,end);
        }
          return new String(a);
    }
          


private void reverse(char[] a, int left , int right){
    while(left<right){
        char temp =a[left];
        a[left]=a[right];
        a[right]=temp;
        left++;
        right--;
    }
}
}
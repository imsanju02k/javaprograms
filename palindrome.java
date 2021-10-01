class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev=0;
        for(int i=x;i!=0;i/=10){
            rev=rev*10+i%10;
        }
        return rev==x;
    }
}
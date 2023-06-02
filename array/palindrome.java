class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int R = x;
        
        while(x>0)
        {
            sum = sum *10 + x%10;
            x = x/10;
        }
        
        if(sum == R)
        {
            return true;
        }else
        {
            return false;
        }
    }
   
}
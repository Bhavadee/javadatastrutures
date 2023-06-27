class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        int i;
        int j = 0;
        
      
        for(i = 0;i < n;i++)
        {
            if(nums[i] == target)
            {
                j++;
                ans[0] = i;
                break;
            }
        }
        for(int x = n-1;x > 0;--x)
        {
            if(nums[x] == target)
            {
                 j++;
                ans[1] = x;
               return ans;
            }
        }
        if(j == 0 )
        {
             ans[0] = -1;
             ans[1] = -1;
        }
        return ans;
    }
}
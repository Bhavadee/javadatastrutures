class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        int[] answer = new int[2]; 
        for(int i = 0;i < n;i++)
        {
            int f = nums[i];
            for(int j = i+1;j <n;j++)
            {
                int s = nums[j];
                if(f+s == target)
                {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;
    }
}
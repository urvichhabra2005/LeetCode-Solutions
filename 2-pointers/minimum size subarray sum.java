class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0, right =0, sum=0, minlen = Integer.MAX_VALUE;
        while(right<nums.length)
        {
            sum+=nums[right];
            while(sum>=target)
            {
                minlen = Math.min(minlen,right-left+1);
                sum-=nums[left];
                left++;
            }
            right++;
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
        
            }
}

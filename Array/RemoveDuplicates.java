class Solution {
    public int removeDuplicates(int[] nums) {
       int k=1;
       for(int i=1;i<nums.length;i++)
       {
        if(nums[i]!=nums[k-1])
        {
            // k isused to remove duplicates by incrementing only when no match is found.
            nums[k]=nums[i];
            k++;
        }

       }
       return k;
    }
}

//Brute force
// TC-O(n^2)
// SC-O(N)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            for(int k =i+1;k<nums.length;k++)
            {
                if(nums[i]+nums[k]==target)
                {
                    return new int[]{i,k};
                }
            }
        }
        return new int[]{0};
    }
}

// Optimal
// TC-O(N)
// SC-O(N)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            // if temp is present return the index of the elements adding to the target in the array nums.
            int temp = target - nums[i];
            if(map.containsKey(temp))
            {
               return new int[]{map.get(temp),i}; 
            }
           // else add the element at index i to the hashmap.
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}

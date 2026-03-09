// find the majority element in the array
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
// space = O(N)
class Solution {
    public int majorityElement(int[] nums) {
      // using hashmap- hashmap takes the space O(N)
     HashMap<Integer, Integer> map = new HashMap<>();
     for(int i =0;i<nums.length;i++)
     {
        map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        if(map.get(nums[i])>nums.length/2)
            return nums[i];
     } 
     return 0;
    }
}

// Space=O(1)
class Solution {
    public int majorityElement(int[] nums) {
     int count =0, key=0;
      // two pointer approach -> count (count the occurrences) and key(store the elemenet having the majority)
     for(int n : nums)
     {
        if(count==0)
            key = n;
        if(n == key)
            count+=1;
        else
            count--;
     }
     return key;
    }
}

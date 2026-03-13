// TC - O(N)
class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int c=1;
        for(int i =1;i<=arr[arr.length-1]+k;i++)
        {
            boolean found = false;
            for(int j =0;j<arr.length;j++)
            {
                if(arr[j]==i)
                {
                    found = true;
                    break;
                }
            }
                if(!found)
                    map.put(c++,i);
        }
        return map.get(k);
        
    }
}

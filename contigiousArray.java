//Time Complexity: 0(N)
//Space Complexity: 0(N)

class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int rSum = 0; int max = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0) 
                rSum += -1;
            else
                rSum += 1;
            
            if(map.containsKey(rSum)) 
                max = Math.max(max, i - map.get(rSum));
            else
                map.put(rSum, i);
            
        }
        return max;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[] {};

        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int current = target - nums[i];
            if (map.containsKey(current) && map.get(current) != i) {
                var j = map.get(current);
                result = new int[] {j, i};
                break;
            }
        }
        
        return result;
    }
}

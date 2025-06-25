class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[] {};

        Map<Integer, List<Integer>> map = IntStream.range(0, nums.length).boxed().collect(Collectors.groupingBy(i -> nums[i], Collectors.toList()));

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) continue;
            int current = target - nums[i];
            if (map.containsKey(current) && map.get(current).get(0) != i) {
                var j = map.get(current).get(0);
                result = new int[] {j, i};
                break;
            }
        }
        
        return result;
    }
}

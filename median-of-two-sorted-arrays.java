class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] biggestArr = nums1.length > nums2.length ? nums1 : nums2;
        int[] smallestArr = nums1.length > nums2.length ? nums2 : nums1; 
        List<Integer> arr = new ArrayList();
    
        int i = 0;
        int j = 0;
        while (i != biggestArr.length || j != smallestArr.length) {
            if (j < smallestArr.length) {
                if (i == biggestArr.length) {
                    arr.add(smallestArr[j]);
                    j++;
                } else if (smallestArr[j] <= biggestArr[i]) {
                    arr.add(smallestArr[j]);
                    j++;
                } else {
                    arr.add(biggestArr[i]);
                    i++;
                }
            } else {
                arr.add(biggestArr[i]);
                i++;
            }
        }

        double result;
        if (arr.size() % 2 == 0) {
            int middle = arr.size() / 2;
            int lower = arr.get(middle - 1);
            int upper = arr.get(middle);
            result = (double) (lower + upper) / 2;
        } else {
            int middle = arr.size() / 2;
            result = arr.get(middle);
        }

        return result;
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<String> running = new ArrayList();
        List<String> arr = Arrays.stream(s.split("")).toList();
        int result = 0;

        if (s.length() != 0) {
            for (int i = 0; i < arr.size(); i++) {
                String current = arr.get(i);
                if (running.contains(current)) running = running.subList(running.indexOf(current) + 1, running.size());
                running.add(current);
                if (running.size() > result) result = running.size();
            }
        }

        return result;
    }
}

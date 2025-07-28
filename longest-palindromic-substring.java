class Solution {
    public String longestPalindrome(String s) {
        var window = s.length();
        System.out.println("window: " + window);
        String result = null;
        while(result == null && window != 0) {
            for (var i = 0; i <= s.length() - window; i++) {
                var current = s.substring(i, i + window);
                if (isPalindromic(current)) result = current;
            }
            window--;
        }

        return result;
    }

    private boolean isPalindromic(String s) {
        boolean result = true;
        int middle = s.length()/2;
        for (var i = 0; i < middle; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                result = false;
                break;
            }
        }

        return result;
    }
}

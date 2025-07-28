class Solution {
    public String convert(String s, int numRows) {
        if (s.length() == 1 || numRows == 1) return s;

        int column = 0;
        int row = 0;
        int count = 0;
        char[][] arr = new char[numRows][(int) Math.floor((s.length() / 2) + 1)];

        while (count < s.length()) {
            for (int j = 0; j < numRows && count < s.length(); j++, count++) {
                arr[j][column] = s.charAt(count);
            }
            column++;

            for (int j = numRows - 2; j > 0 && count < s.length(); j--, column++, count++) {
                arr[j][column] = s.charAt(count);
            }
        }

        count = 0;
        char[] result = new char[s.length()];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length && count < s.length(); j++) {
                if (arr[i][j] != 0) {
                    result[count] = arr[i][j];
                    count++;
                }
            }
        }

        return new String(result);
    }
}

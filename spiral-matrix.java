class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length; 
        int offset = 0;
        int i = 0;
        int j = 0;
        List<Integer> result = new ArrayList();

        while(m - offset > 0 || n - offset > 0) {
            for( ; i < n - offset && notFull(m, n, result); i++) {
                result.add(matrix[j][i]);
            }

            i--;
            j++;
            for( ; j < m - offset && notFull(m, n, result); j++) {
                result.add(matrix[j][i]);
            }

            j--;
            i--;
            for( ; i >= 0 + offset && notFull(m, n, result); i--) {
                result.add(matrix[j][i]);
            }

            offset++;

            i++;
            j--;
            for( ; j >= 0 + offset && notFull(m, n, result); j--) {
                result.add(matrix[j][i]);
            }

            j++;
            i++;
        }

        return result;
    }

    private boolean notFull(int m, int n, List<Integer> list) {
        return list.size() !=  m * n;
    }
}

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length; 
        
        System.out.println("m: " + m);
        System.out.println("n: " + n);

        int offset = 0;
        int i = 0;
        int j = 0;
        while(m > 0 || n > 0) {
            System.out.println("---while---");
            while (i < m - offset) {
                System.out.println("j: " + j + " i: " + i);
                if (i != m - offset - 1) i++;
                else break;
            }

            System.out.println("------");
            System.out.println("j: " + j + " i: " + i);
        }

        return null;
    }
}

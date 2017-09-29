class Solution {
    public void rotate(int[][] matrix) 
    {
        int n = matrix.length;
        for(int i=0;i<n/2;i++)
        {
            for(int j=0;j<Math.ceil((float)n/2.0);j++)
            {
                int temp = matrix[j][n-1-i];
                matrix[j][n-1-i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}
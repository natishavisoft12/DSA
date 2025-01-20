import java.util.Arrays;

public class Spiral {
    
    public int[] spiralorder(int[][] matrix) {
       
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m * n];
        int index = 0;
        int top = 0;
        int left = 0;
        int bottom = m - 1;
        int right = n - 1;
        
        while (top <= bottom && left <= right) {
           
            for (int i = top; i <= bottom; i++) {
                result[index++] = matrix[i][left];
            }
            left++;
            
         
            if (top <= bottom) {
                for (int i = left; i <= right; i++) {
                    result[index++] = matrix[bottom][i];
                }
                bottom--;
            }
            
            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[index++] = matrix[i][right];
                }
                right--;
            }
            
          
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[index++] = matrix[top][i];
                }
                top++;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Spiral spiral = new Spiral();
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[] result = spiral.spiralorder(matrix);
        System.out.println(Arrays.toString(result)); 
    }
}

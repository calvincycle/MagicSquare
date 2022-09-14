
public class Runner
{

    public static void main(String[] args)
    {
        //these are magic squares
        int[][] matrix = new int[][]{{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        int[][] matrix1 = new int[][]{{8, 11, 14, 1}, {13, 2, 7, 12}, {3, 16, 9, 6}, {10, 5, 4, 15}};
        int[][] matrix2 = new int[][]{{17, 24, 1, 8, 15}, {23, 5, 7, 14, 16}, {4, 6, 13, 20, 22}, {10, 12, 19, 21, 3}, {11, 18, 25, 2, 9}};
        //these are not magic squares
        int[][] matrix3 = new int[][]{{8, 11, 5, 1}, {8, 11, 14, 11}, {8, 1, 14, 1}, {9, 11, 14, 1}};
        int[][] matrix4 = new int[][]{{20, 24, 1, 8, 15}, {30, 5, 7, 14, 16}, {4, 6, 13, 20, 22}, {10, 12, 19, 21, 9}, {11, 18, 55, 2, 9}};
        
        System.out.println("Test case 0 is " + isMagicSquare(matrix));
        System.out.println("Test case 1 is " + isMagicSquare(matrix1));
        System.out.println("Test case 2 is " + isMagicSquare(matrix2));
        
        System.out.println("Test case 3 is " + isMagicSquare(matrix3));
        System.out.println("Test case 4 is " + isMagicSquare(matrix4));

    }
    
    private static boolean isMagicSquare(int[][] matrix) {
        int dimension = matrix.length;
        int sum = 0;
        
        //first diagonal sum
        for(int x = 0; x < dimension; x++){
            int y = x;
            sum = sum + matrix[x][y];
        }
        
        int tempSum = 0;
        //second diagonal sum
        for(int x = 0; x < dimension; x++){
            int y = (dimension - 1) - x;
            tempSum = tempSum + matrix[x][y];
        } 
        
        //check if diagonal sums are equal, continue if they are
        if(sum != tempSum)
            return false;
        
        //check row sums
        for(int x = 0; x < dimension; x++){
            tempSum = 0;
            for(int y = 0; y < dimension; y++){
                tempSum = tempSum + matrix[x][y];
            }
            if(sum != tempSum)
                return false;
        }
        
        //check column sums
        for(int y = 0; y < dimension; y++){
            tempSum = 0;
            for(int x = 0; x < dimension; x++){
                tempSum = tempSum + matrix[x][y];
            }
            if(sum != tempSum)
                return false;
        }
        
        //if all conditions are satisfied, it is a magic square
        return true;
    }

}

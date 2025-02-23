public class Matrix_Addition {

	public static void main(String[] args) {
		        int[][] matrix1 = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };

		        int[][] matrix2 = {
		            {9, 8, 7},
		            {6, 5, 4},
		            {3, 2, 1}
		        };

		        int[][] result = {
		        		{0,0,0},
		        		{0,0,0},
		        		{0,0,0}
		        };

		        for (int i = 0; i < matrix1.length; i++) {
		            for (int j = 0; j < matrix1[i].length; j++) {
		                result[i][j] = matrix1[i][j] + matrix2[i][j];
		            }
		        }

		        System.out.println("Result of Matrix Addition:");
		        for (int i = 0; i < matrix1.length; i++) {
		            for (int j = 0; j < matrix1[i].length ; j++) {
		                System.out.print(result[i][j] + " ");
		            }
		            System.out.println();
		        }
	}

}

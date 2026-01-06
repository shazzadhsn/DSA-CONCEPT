public class Diagonal_Sum {
    public static void diagonalSum(int matrix[][]) {
        int pdSum = 0;
        int sdSum = 0;

        for(int i=0; i<matrix.length; i++) {
            pdSum += matrix[i][i];

            // overlaping handled on odd matrix size case
            if(i != matrix.length-i-1)
                sdSum += matrix[i][matrix.length-i-1];
        }

        System.out.println(pdSum+sdSum);
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        diagonalSum(matrix);
    }
}

package practiceProjects;

import java.util.Arrays;

public class NxMMatrix {
private int [][] matrix = null;
    public void createMatrix(int row, int column) {
       matrix = new int[row][column];
        for (int[] ints : matrix) {
            Arrays.fill(ints, -999);
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }


    public void setMatrix(int input) {
//        System.out.println(input);
        for(int i =0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.println(input);

                if(matrix[i][j] == -999){
                matrix[i][j] = input;
//                    System.out.println(input);

                    break;

                }

            }
        }
    }
}

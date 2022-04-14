package practiceProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;

import static tictactoeGame.XAndO.O;

public class NxMMatrix {
private int [][] matrix ;
private final ArrayList<Integer> checker = new ArrayList<>();
private int row;
private int column;
    int i =0;
    int j =0;


public void createMatrix(int row, int column) {
    this.row = row;
    this.column = column;
       matrix = new int[row][column];
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }


    public void setMatrix(int input) {
    matrix[i][j]= input;
    updateRowColumn();
    }

    private void updateRowColumn() {
            j++;
        if (j > column-1){
            i++;
            j = 0;
        }

}

    public int matrixDiagonalCheck() {
        int count = 0;
        for ( int i = 0; i < row -1; i++){
        count = count + 1;
        for (int j = 0; j < column -1; j++){

        if (matrix[i][j] == matrix[i + 1][j + 1]) {
            checker.add(1);
        }
        else{
        checker.add(0);}
        }
        }
        if (checker.contains(0)){
            System.out.println(0);
            return 0;
        }
        return 1;
    }

    public void matrixPrint(){
        for(int i =0; i < row; i++){
            for(int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

}

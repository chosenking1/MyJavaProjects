package practiceProjects;

import java.util.Scanner;

public class NxMMatrixDriver {
    public static void main(String[] args) {
        NxMMatrix matrix = new NxMMatrix();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" input the row and column");
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        matrix.createMatrix(row,column);

        for(int i =0; i < row; i++){
            for(int j = 0; j < column; j++){
                matrix.setMatrix(scanner.nextInt());
            }}

        System.out.println(matrix.matrixDiagonalCheck());
        matrix.matrixPrint();

    }
}

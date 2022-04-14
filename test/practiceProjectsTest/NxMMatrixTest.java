package practiceProjectsTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practiceProjects.NxMMatrix;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NxMMatrixTest {
    NxMMatrix matrix;
    @BeforeEach
    void setUp(){
        matrix = new NxMMatrix();
    }

    @Test
    void multidimensionalMatrixCanBeCreated(){
            matrix.createMatrix(2,3);
            assertEquals(2, matrix.getMatrix().length);

    }

    @Test
    void matrixCanBePopulated(){
    matrix.createMatrix(2,3);
    matrix.setMatrix(7);
    matrix.setMatrix(9);
    matrix.setMatrix(1);
    matrix.setMatrix(0);
    matrix.setMatrix(7);
    matrix.setMatrix(9);

    assertEquals(1, matrix.getMatrix()[0][2]);
    assertEquals(9, matrix.getMatrix()[1][2]);
    }

    @Test
    void matrixCanBePopulated2(){
        matrix.createMatrix(2,3);
        matrix.setMatrix(new int[][]{{7, 9, 1},{0, 7, 9}});

        assertEquals(1, matrix.getMatrix()[0][2]);
        assertEquals(9, matrix.getMatrix()[1][2]);
    }

    @Test
    void matrixCanBePopulatedWithOneDimensionalArray(){
        matrix.createMatrix(1,2);
        matrix.setMatrix(new int[][]{{1,7}});

        assertEquals(7, matrix.getMatrix()[0][1]);
    }

    public void matrixTestCases(){
        matrix.createMatrix(2,3);
        matrix.setMatrix(new int[][]{{7, 9, 1},{0, 7, 9}});
    }

    public void matrixTestCases1(){
        matrix.createMatrix(2,3);
        matrix.setMatrix(new int[][]{{7, 0, 7,},{0, 7, 9}});
    }

    public void matrixTestCases2(){
        matrix.createMatrix(3,3);
        matrix.setMatrix(new int[][]{{1, 2, 3},{2, 3, 1},{3, 1, 2}});
    }

    @Test
    void diagonalOfMatrixCanBeChecked(){
        matrixTestCases();
        assertEquals(1, matrix.matrixDiagonalCheck());
    }

    @Test
    void unequalDiagonalOfMatrixCanBeChecked(){
        matrixTestCases1();
        assertEquals(0, matrix.matrixDiagonalCheck());
    }

    @Test
    void diagonalOfMatrixWithDifferentSizeCanBeChecked(){
        matrixTestCases2();
        assertEquals(0, matrix.matrixDiagonalCheck());
    }

    @Test
    void diagonalOfMatrixWithOneDimensionCanBeChecked(){
        matrix.createMatrix(1,2);
        matrix.setMatrix(new int[][]{{1,7}});
        assertEquals(1, matrix.matrixDiagonalCheck());
    }
}

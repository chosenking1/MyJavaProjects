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

    assertEquals(1, matrix.getMatrix()[1][2]);
    assertEquals(9, matrix.getMatrix()[1][2]);
    }
}

package interviewQuestionsSolutionsTest;

import interviewQuestionsSolutions.ArrayFiller;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

//Fill a three-dimensional array with numbers between 10 and 50
public class ArrayFillerTest {
    ArrayFiller arrayFiller;

    @BeforeEach
    void setUp(){
        arrayFiller = new ArrayFiller();
    }

    @Test
    void arrayCanBeFilledTest(){
        arrayFiller.setArray();
        assertNotNull(arrayFiller.getMultiDimensionalArray());
    }

    @Test
    void arrayIsBetween10And50Test(){

    }
}

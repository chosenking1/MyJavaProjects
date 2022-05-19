package interviewQuestionsSolutionsTest;

import interviewQuestionsSolutions.ReverseWord;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

//1 Reverse this string of words “cohort_nine”
//3 Write a Java Program to reverse a string without using String inbuilt function reverse()
public class ReverseWordTest {

    ReverseWord reverseWordOne;
    @BeforeEach
    void setUp(){
        reverseWordOne = new ReverseWord("cohort_nine");
    }
    @Test
    void wordCanBeReversed(){
        assertEquals("enin_trohoc", reverseWordOne.getReversedWord());
    }

    @Test
    void wordCanBeReversedWithoutReverseMethod(){
        reverseWordOne.reverseWithLoop("Otedola");
        assertEquals("alodetO", reverseWordOne.getReversedWord());
    }

}

package interviewQuestionsSolutionsTest;

import interviewQuestionsSolutions.UsingEnhancedFourLoop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

//Iterate through an arraylist using enhanced for loop
public class UsingEnhancedFourLoopTest {
    UsingEnhancedFourLoop usingEnhancedFourLoop;

    ArrayList<String> arrayList = new ArrayList<>();
    @BeforeEach
    void setUp(){

        arrayList.add("Hope" );
        arrayList.add("Makanjuola");
        arrayList.add("Joyful");
        arrayList.add("Happy");

        usingEnhancedFourLoop = new UsingEnhancedFourLoop(arrayList);
    }

    @Test
    void enhancedForLoopTest(){
    assertNotNull(usingEnhancedFourLoop.looping(arrayList));
    }


}

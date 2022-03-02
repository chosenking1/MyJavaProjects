package myerBriggsTest;

import myerBriggsQuestionnaire.MyerBriggs;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyerBriggsTest {
    MyerBriggs question ;

    @BeforeEach
    public void objectCreation(){
        question = new MyerBriggs();
    }
    @Test
    public void appCanAskOneQuestion(){
     //   question.questions();
        assertEquals("a. Expend energy, enjoy groups /n b. Conserve energy, enjoy one on one", question.questions());
    }

    @Test
    public void appCanGetResponse(){
           question.answers("a");
         assertArrayEquals(new String[]{"a", null, null, null, null}, question.getAnswers());
    }

    @Test
    public void appCanDisplayResponse(){
        question.answers("a");
        assertArrayEquals(new String[]{"a", null, null, null, null}, question.getAnswers());
    }

    @Test
    public void appCanCollectAnswers(){
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        assertArrayEquals(new String[]{"a", "b", "a", "b", "a" }, question.getAnswers());
    }
    @Test
    public void userCanBeAnIntrovert(){
        question.answers("b");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("b");
        assertEquals("I", question.introvertExtrovert());
    }

    @Test
    public void userCanBeAnExtrovert(){
        question.answers("a");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("b");
        assertEquals("E", question.introvertExtrovert());
    }

    @Test
    public void userCanBeIntuitive(){
        question.answers("b");
        question.answers("a");

        question.answers("b");
        question.answers("a");
        question.answers("b");

        assertEquals("N", question.sensitiveIntuition());
    }

    @Test
    public void userCanBeSensitive(){
        question.answers("a");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("b");
        assertEquals("S", question.sensitiveIntuition());

    }
    @Test
    public void userCanBeAFeeler(){
        question.answers("b");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("b");

        assertEquals("F", question.thinkerFeeler());
    }

    @Test
    public void userCanBeAThinker(){
        question.answers("a");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("b");
        assertEquals("T", question.thinkerFeeler());

    }

    @Test
    public void userCanBePerceptive(){
        question.answers("b");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("b");

        assertEquals("P", question.judgementPerception());
    }

    @Test
    public void userCanBeJudgemental(){
        question.answers("a");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("b");
        assertEquals("J", question.judgementPerception());
    }

@Test
    public void userCanBeIntrovertAndJudgemental(){
    question.answers("a");
    question.answers("a");
    question.answers("b");
    question.answers("a");
    question.answers("b");
    question.answers("a");
    question.answers("a");
    question.answers("b");
    question.answers("a");
    question.answers("b");
    question.setResponse();
    assertArrayEquals(new String[]{"E", "J"}, question.getResponse());
}
@Test
    public void userCannotInputWrongInput(){

}

@Test
    public void userCanBeIntrovertJudgementalAndSensitive(){
        question.answers("a");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("b");
        question.setResponse();
        assertArrayEquals(new String[]{"E", "S", "J"}, question.getResponse());
    }

    @Test
    public void userCanBeIntrovertJudgementalSensitiveAndThinker(){
        question.answers("a");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("b");
        question.setResponse();
        assertArrayEquals(new String[]{"E", "S", "T","J"}, question.getResponse());
    }
    @Test
    public void multipleQuestionsCanBeAnswered(){
        question.questions();
        question.answers("a");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("a");
        question.answers("b");
        question.answers("a");
        question.answers("b");
        question.setResponse();
        assertArrayEquals(new String[]{"E", "S", "T","J"}, question.getResponse());
      //  assertSame();
    }


}



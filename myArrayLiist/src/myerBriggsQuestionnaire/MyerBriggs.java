package myerBriggsQuestionnaire;

import java.util.Objects;

public class MyerBriggs {
public String [] input = new String[20];
public String [] response = new String[4];

    public String questions() {
        String questions1 = "a. Expend energy, enjoy groups /n b. Conserve energy, enjoy one on one";
        getAnswers();
        String questions2 = "a. interpret literally or b. look for meaning and possibilities";
        getAnswers();
        String questions3 = "a. logical, thinking, questioning or b. empathetic, feeling, accommodating";
        getAnswers();
        String questions4 = "a. organized, orderly or b. flexible, adaptable";
        getAnswers();
        String questions5 = "a. more outgoing, think out loud or b. more reserved, think to yourself";
        getAnswers();
        String questions6 = "a. practical, realistic, experiential or b. imaginative, innovative, theoretical";
        getAnswers();
        String questions7 = "a. candid, straight forward, frank or b. tactful, kind, encouraging";
        getAnswers();
        String questions8 = "plan, schedule or b. unplanned, spontaneous";
        getAnswers();
        String questions9 = "a. seek many tasks, public activities, interaction with others b. seek private, solitary activities with quiet to concentrate";
        getAnswers();
        String questions10 = "a. standard, usual, conventional or b. different, novel, unique";
        getAnswers();
        String questions11 = "a. firm, tend to criticize, hold the line or b. gentle, tend to appreciate, conciliate";
        getAnswers();
        String questions12 = "a. regulated, structured or b. easygoing, “live” and “let live”";
        getAnswers();
        String questions13 = "a. external, communicative, express yourself or b. internal, reticent, keep to yourself";
        getAnswers();
        String questions14 = "a. focus on here-and-now or b. look to the future, global perspective, “big picture”";
        getAnswers();
        String questions15 = "a. tough-minded, just or b. tender-hearted, merciful";
        getAnswers();
        String questions16 = "a. preparation, plan ahead or b. go with the flow, adapt as you go";
        getAnswers();
        String questions17 = "a. active, initiate or b. reflective, deliberate";
        getAnswers();
        String questions18 = "a. facts, things, “what is” or b. ideas, dreams, “what could be,” philosophical";
        getAnswers();
        String questions19 = "a. matter of fact, issue-oriented or b. sensitive, people-oriented, compassionate";
        getAnswers();
        String questions20 = "a. control, govern or b. latitude, freedom";
        getAnswers();

        return questions1;
    }

    public void answers(String reply) {
        for(int i = 0; i < input.length; i++ ){
            if(input[i] == null){
            input[i] = reply;
                break; }

        }

    }

    public String[] getAnswers() {
        return input;
    }

    public String introvertExtrovert() {
        int countA = 0;
        int countB = 0;

        for (int i = 0; i < input.length; i+=4) {
            if (Objects.equals(input[i], "a")) {
                 countA++;
            }
            else  {
                countB++;
            }
        }
        if (countA > countB) {
            return "E";

        }
        {
            return "I";
        }

    }

    public String sensitiveIntuition() {
        int countA = 0;
        int countB = 0;

        for (int i = 1; i < input.length; i+=4) {
            if (Objects.equals(input[i], "a")) {
                countA++;
            }
            else  {
                countB++;
            }
        }
        if (countA > countB) {
            return "S";
        }
        {
            return "N";
        }
    }

    public String thinkerFeeler() {

        int countA = 0;
        int countB = 0;

        for (int i = 2; i < input.length; i+=4) {
            if (Objects.equals(input[i], "a")) {
                countA++;
            }
            else  {
                countB++;
            }
        }
        if (countA > countB) {
            return "T";
        }
        {
            return "F";
        }
    }

    public String judgementPerception() {
        int countA = 0;
        int countB = 0;

        for (int i = 3; i < input.length; i+=4) {
            if (Objects.equals(input[i], "a")) {
                countA++;
            }
            else  {
                countB++;
            }
        }
        if (countA > countB) {
            return "J";
        }
        {
            return "P";
        }
    }

    public void setResponse() {
        this.response[0] = introvertExtrovert();
        this.response[1] = sensitiveIntuition();
        this.response[2] = thinkerFeeler();
        this.response[3] = judgementPerception();
    }

    public String[] getResponse() {
        return response;
    }

}

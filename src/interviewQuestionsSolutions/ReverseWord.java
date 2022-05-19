package interviewQuestionsSolutions;

public class ReverseWord {
    private String reversedWord;
    public ReverseWord(String word) {
        StringBuilder process = new StringBuilder();
        process.append(word);
        reversedWord = String.valueOf(process.reverse());
    }

    public String getReversedWord() {
        return reversedWord;
    }

    public void reverseWithLoop(String word) {
        char word2 = 0;
        String word1 = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            word2 = word.charAt(i);
            word1 += word2;
        }
        reversedWord = word1;
    }
}

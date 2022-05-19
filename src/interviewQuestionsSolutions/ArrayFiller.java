package interviewQuestionsSolutions;

import java.security.SecureRandom;

public class ArrayFiller {
   int [][][] multiArray = new int[5][6][7];
    public void setArray() {

        SecureRandom secureRandom = new SecureRandom();
       int number = secureRandom.nextInt(10) + 50;
       for(int i = 0; i < multiArray.length; i++){
           for (int j = 0; j < multiArray[i].length; j++)
               for(int k = 0; k < multiArray[i][j].length; k++){
                   multiArray[i][j][k] = number;
               }
       }


//        for (int[][] array2D: test) {
//        for (int[] array1D: array2D) {
//            for(int item: array1D) {
//                System.out.println(item);
//            }
//        }
//    }
    }

    public Object getMultiDimensionalArray() {

        return multiArray;
    }
}

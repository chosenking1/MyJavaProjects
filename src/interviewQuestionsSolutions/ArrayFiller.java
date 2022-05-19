package interviewQuestionsSolutions;

import java.security.SecureRandom;
import java.util.Arrays;

public class ArrayFiller {
   int [][][] multiArray = new int[2][2][2];
    public void setArray() {

        SecureRandom secureRandom = new SecureRandom();
//       int number = secureRandom.nextInt(50) + 90;
       for(int i = 0; i < multiArray.length; i++){
           for (int j = 0; j < multiArray[i].length; j++)
               for(int k = 0; k < multiArray[i][j].length; k++){
                   multiArray[i][j][k] = secureRandom.nextInt(10);
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

    public boolean numberBetweenRange() {
        for (int[][] array2D: multiArray) {
        for (int[] array1D: array2D) {
            for(int item: array1D) {
                System.out.println(item);


                }
            }
        }




        return true;
    }
}

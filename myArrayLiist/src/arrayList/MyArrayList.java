package arrayList;
import java.util.Objects;

public class MyArrayList {

    private String[] myArray = new String[2];
    String[] largerArray = new String[myArray.length];


    public void addString(String bolanle) {
        increaseMethod();
      for(int i = 0; i < myArray.length; i++){
          if (myArray[i]==null) {
              myArray[i] = bolanle;
              break;
          }
      }
//        Arrays.fill(myArray, bolanle);
    }

    public String [] getMyArray() {
       // return new String[]{myArray[1]};
        return myArray;
    }

    public void increaseMethod() {
        if (size() == myArray.length){
            largerArray = myArray;
            myArray =new String[(int) Math.pow(myArray.length, 2)];
            System.arraycopy(largerArray,0,myArray,0,largerArray.length);
        }
    }

    public int size() {
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i]!=(null)) {
                count++;
            }
        }
        return count;
    }

    public int arrayLength() {
       int count = 0;
        for(int i = 0; i < myArray.length; i++){
            count ++;
        }
        return count;
    }

    public void remove(int index) {
            for (int j = index; j < myArray.length -1; j++){
            myArray[j] = myArray[j+1];}
            myArray[size()-1] = null;
        }

    public void remove(String ebi) {
        for(int i = 0; i < myArray.length -1; i++){
            if(Objects.equals(myArray[i],ebi)){
                for (int j = i; j < myArray.length -1; j++){
                myArray[j] = myArray[j+1];
            }
            }
        }
        myArray[size()-1] = null;
    }

    public String locator(int i) {
        String joy = "";
        for(int p = 0; p < myArray.length -1; p++){
            if(p == i){
            joy = myArray[p];}
        }
        return joy;
    }

    public void addString(String moyo, int index) {
        increaseMethod();
        for(int i = index; i < myArray.length -1; i++) {
                myArray[1 + i] = myArray[i];
        }
                myArray[index] = moyo;
}
}

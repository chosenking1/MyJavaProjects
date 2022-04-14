package tictactoeGame;

import java.util.Arrays;

import static tictactoeGame.XAndO.EMPTY;

public class Ticktacktoe {
    private XAndO [][] myArray = new XAndO [3][3];;
    public Ticktacktoe(){
        for (XAndO[] xAndOS : myArray) {
            Arrays.fill(xAndOS, EMPTY);
        }
    }
    public void setMyArray(XAndO[][] sentArray) {
        myArray = sentArray;
    }
    public XAndO[][] getMyArray() {

        return myArray;
    }

    public void player1() {
        
    }

    public void player2() {
    }
}

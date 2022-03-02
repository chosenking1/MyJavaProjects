package tictactoeGame;

import java.util.Arrays;

import static tictactoeGame.XAndO.*;

public class TicktacktoeGame {

        private XAndO [][] myArray = new XAndO [3][3];;
        public TicktacktoeGame(){
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

        public void player1(int xPosition) {
            if(!thereIsAWinner()){
//Scanner
        int count = 0;
        int i;
        int j;
        for(i = 0; i < myArray.length; i++){
            for(j = 0; j < myArray[i].length; j++){
            count++;
            if(count == xPosition){
                myArray[i][j] = X;

            }
            }
        }
        }}

        public void player2(int oPosition) {
            if (!thereIsAWinner()) {
                int count = 0;
                int i;
                int j;
                for (i = 0; i < myArray.length; i++) {
                    for (j = 0; j < myArray[i].length; j++) {
                        count++;
                        if (count == oPosition) {
                            myArray[i][j] = O;
                        }
                    }
                }
            }
        }

    public Boolean thereIsAWinner() {
        int i;
        int j;
        int count = 3;
        for(i = 0; i < myArray.length; i++) {
            for (j = 0; j < myArray[i].length; j++) {
                if (myArray[i][j] != EMPTY) {
                    if (i == 0) {
                        if (myArray[i][i] == myArray[i + 1][i + 1]) {
                            if (myArray[i][i] == myArray[i + 2][i + 2]) {
                                return true;
                            }
                        }
                    }
                    if (i == 1) {
                        if (myArray[i][i] == myArray[i + 1][i - 1])
                            if (myArray[i][i] == myArray[i - 1][i + 1])
                                return true;
                    }
                    if (j == 0) {
                        if (myArray[i][j] == myArray[i][j + 1]) {
                            if (myArray[i][j] == myArray[i][j + 1]) {
                                return true;
                            }
                        }
                    }

                    if (i == 0) {
                        if (myArray[i][j] == myArray[i + 1][j]) {
                            if (myArray[i][j] == myArray[i + 2][j]) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
}

    public String gameIsOver() {
        thereIsAWinner();
        return "The Game is over";
    }

    private void gameBoard(XAndO representation,int position) {

        int count = 0;
        int i;
        int j;

        for(i = 0; i < myArray.length; i++){
            for(j = 0; j < myArray[i].length; j++){
                count++;
                if(count == 2){
                    myArray[i][j] = O;
                }
            }
        }
    }
}

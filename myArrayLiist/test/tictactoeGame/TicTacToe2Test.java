package tictactoeGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static tictactoeGame.XAndO.*;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToe2Test {
    TicktacktoeGame mavenGame1;

    @BeforeEach
    public void objectCreation(){
        System.out.println("i am working");
     mavenGame1  = new TicktacktoeGame();
    }

    @BeforeEach
    public void setUp(){
        System.out.println("Try now");
    }


    @Test
    public void myXAndOHasEnumEmpty(){
        XAndO content = EMPTY;
        assertEquals("EMPTY", EMPTY.toString());
    }

    @Test
    public void myXAndOHasEnumX(){
        XAndO content = XAndO.X;
        assertEquals("X", XAndO.X.toString());
    }

    @Test
    public void myXAndOHasEnumO(){
        XAndO content = XAndO.O;
        assertEquals("O", XAndO.O.toString());
    }

    @Test
    public void ticTacToeHasArray(){
        XAndO[][] content = {{EMPTY,EMPTY,EMPTY},{EMPTY,EMPTY,EMPTY},{EMPTY,EMPTY,EMPTY}};
        assertArrayEquals(content, mavenGame1.getMyArray());

    }

    @Test
    public void ticTacToeHaveTwoPlayers(){
        mavenGame1.player1(1);
        mavenGame1.player2(3);
    }

    @Test
    public void playersCanMarkTheBoard(){
        mavenGame1.player1(1);
        mavenGame1.player2(9);
        XAndO[][] content = {{X,EMPTY,EMPTY},{EMPTY,EMPTY,EMPTY},{EMPTY,EMPTY,O}};
        assertArrayEquals(content, mavenGame1.getMyArray() );
    }

    @Test
    public void player1canWin(){
        mavenGame1.player1(4);
        mavenGame1.player2(5);
        mavenGame1.player1(1);
        mavenGame1.player2(9);
        mavenGame1.player1(7);
        mavenGame1.player2(6);
        XAndO[][] content = {{X,EMPTY,EMPTY},{X,O,O},{X,EMPTY,O}};
        assertEquals(true, mavenGame1.thereIsAWinner());

    }



    @Test
    public void playerCanWinFromASide(){
        mavenGame1.player1(4);
        mavenGame1.player2(7);
        mavenGame1.player1(1);
        mavenGame1.player2(9);
        mavenGame1.player1(6);
        mavenGame1.player2(8);
        XAndO[][] content = {{X,EMPTY,EMPTY},{X,EMPTY,X},{O,O,O}};
        assertEquals(true, mavenGame1.thereIsAWinner());
    }
    @Test
    public void gameStopsWhenAPlayerWins(){
        mavenGame1.player1(4);
        mavenGame1.player2(7);
        mavenGame1.player1(1);
        mavenGame1.player2(9);
        mavenGame1.player1(6);
        mavenGame1.player2(8);

        XAndO[][] content = {{X,EMPTY,EMPTY},{X,EMPTY,X},{O,O,O}};
        assertEquals("The Game is over", mavenGame1.gameIsOver());
    }

    @Test
    public void playerCanWinFromCentre1(){
        mavenGame1.player1(4);
        mavenGame1.player2(8);
        mavenGame1.player1(6);
        mavenGame1.player2(9);
        mavenGame1.player1(5);
        mavenGame1.player2(3);
        XAndO[][] content = {{EMPTY,EMPTY,O},{X,X,X},{EMPTY,O,O}};
        assertEquals(true, mavenGame1.thereIsAWinner());
    }

    @Test
    public void playerCanWinFromCentre2(){
        mavenGame1.player1(8);
        mavenGame1.player2(9);
        mavenGame1.player1(5);
        mavenGame1.player2(1);
        mavenGame1.player1(2);
        mavenGame1.player2(3);
        XAndO[][] content = {{O,X,O},{EMPTY,X,EMPTY},{EMPTY,X,O}};
        assertEquals(true, mavenGame1.thereIsAWinner());
    }

    @Test
    public void playerCanWinFromSide3(){
        mavenGame1.player1(4);
        mavenGame1.player2(3);
        mavenGame1.player1(8);
        mavenGame1.player2(1);
        mavenGame1.player1(6);
        mavenGame1.player2(2);
        XAndO[][] content = {{O,O,O},{X,EMPTY,X},{EMPTY,X,EMPTY}};
        assertEquals(true, mavenGame1.thereIsAWinner());
    }

    @Test
    public void playerCanWinFromSide4(){
        mavenGame1.player1(4);
        mavenGame1.player2(6);
        mavenGame1.player1(5);
        mavenGame1.player2(9);
        mavenGame1.player1(7);
        mavenGame1.player2(3);
        XAndO[][] content = {{EMPTY,EMPTY,O},{X,X,O},{X,EMPTY,O}};
        assertEquals(true, mavenGame1.thereIsAWinner());
    }

    @Test
    public void playerCanWinFromDiagonal1(){
        mavenGame1.player1(5);
        mavenGame1.player2(7);
        mavenGame1.player1(1);
        mavenGame1.player2(4);
        mavenGame1.player1(9);
        mavenGame1.player2(8);
        XAndO[][] content = {{X,EMPTY,EMPTY},{O,X,EMPTY},{O,O,X}};
        assertEquals(true, mavenGame1.thereIsAWinner());
    }

    @Test
    public void playerCanWinFromDiagonal2(){
        mavenGame1.player1(6);
        mavenGame1.player2(7);
        mavenGame1.player1(1);
        mavenGame1.player2(3);
        mavenGame1.player1(4);
        mavenGame1.player2(5);
       // XAndO[][] content = {{X,EMPTY,O},{X,O,X},{O,EMPTY,EMPTY}};
        assertEquals(true, mavenGame1.thereIsAWinner());
    }
    @Test
    public void playerCantPlayWhenThereIsAWinner(){
        mavenGame1.player1(4);
        mavenGame1.player2(6);
        mavenGame1.player1(5);
        mavenGame1.player2(9);
        mavenGame1.player1(7);
        mavenGame1.player2(3);
        mavenGame1.player1(1);

        XAndO[][] content = {{EMPTY,EMPTY,O},{X,X,O},{X,EMPTY,O}};
        assertEquals(true, mavenGame1.thereIsAWinner());
    }



}



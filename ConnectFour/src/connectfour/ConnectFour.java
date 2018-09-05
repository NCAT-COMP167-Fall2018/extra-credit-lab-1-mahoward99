/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

/**
 *
 * @author mirac
 */
public class ConnectFour {
    private static char[][] gameBoard;
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        gameBoard = createBoard('b');
        gameBoard = createBoard('y');
        gameBoard = createBoard('r');
        printBoard();
    }
    private static char[][] createBoard(char starChar){
       char[][] gameboardArr = new char[6][7];
       
       for(int i =0; i<gameboardArr.length ;i++){
           for(int j = 0; j < gameboardArr[i].length;j++){
           gameboardArr[i][j] = starChar;
           }
    }
       return gameboardArr;
    }
    private static void printBoard(){
         for(int i =0; i<gameBoard.length ;i++){
           for(int j = 0; j < gameBoard[i].length;j++){
           System.out.print(gameBoard[i][j]);
           }
        System.out.println();
       }
    }
}

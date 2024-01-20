import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedReader;

class Main {

    public static void main(String[] args) {

        int[][] board = readInBoard();
        System.out.println(board.length);
        System.out.println(board[0].length);


    }

    public static int[][] readInBoard() {

        try{
            FileReader board = new FileReader("board.txt");
            //Scanner fileReader = new Scanner(board);
            BufferedReader fileReader = new BufferedReader(board);
            int[][] boardVaraiable = new int[5][5];
            fileReader.close();
            return boardVaraiable;
        }// catch (FileNotFoundException e) {
        //    System.out.println("An error occurred.");
        //    e.printStackTrace();
        //}

        return new int[0][0];

    }

}
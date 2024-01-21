import java.io.*;
class Main {

    public static void main(String[] args) {

        int[][] board = readInBoard();
        System.out.println(board.length);
        System.out.println(board[0].length);


    }

    public static int[][] readInBoard() {

        int width = 1;
        int hight = 1;
        
        try{
    
            BufferedReader baordReader = new BufferedReader(new FileReader("board.txt"));
            
            //baordReader.read();
            //baordReader.mark(0);

            int lines = 0;
            while (baordReader.readLine() != null) lines++;

            hight = lines;

            //baordReader.reset();
            //System.out.println(new String(baordReader.readLine()));

            int[][] boardVaraiable = new int[width][hight];

            baordReader.close();

            return boardVaraiable;

        } catch (Exception e) {

            System.out.println("An error occurred.");
            e.printStackTrace();

        }

        return new int[0][0];

    }

}
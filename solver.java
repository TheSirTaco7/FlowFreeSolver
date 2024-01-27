import java.io.*;
class Main {

    public static void main(String[] args) {

        int[][] board = readInBoard();
        System.out.println(board.length);
        System.out.println(board[0].length);

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] readInBoard() {

        int width = 1;
        int hight = 1;

        
        try{
    
            BufferedReader baordReader = new BufferedReader(new FileReader("board.txt"));

            //Get hight
            int lines = 0;
            while (baordReader.readLine() != null) lines++;
            hight = lines;

            //Get width
            baordReader.close();
            baordReader = new BufferedReader(new FileReader("board.txt"));
            width = (new String(baordReader.readLine()).length() + 1) / 2;

            int[][] boardVaraiable = new int[width][hight];

            baordReader.close();
            baordReader = new BufferedReader(new FileReader("board.txt"));

            for(int i = 0; i < width; i++){
                for(int j = 0; j < hight; j++){
                    boardVaraiable[i][j] = baordReader.read();
                    baordReader.read();
                }
            }

            return boardVaraiable;

        } catch (Exception e) {}

        return new int[0][0];

    }

}
import java.io.*;
class Main {

    public static void main(String[] args) {

        int[][] board = readInBoard();
        System.out.println(totalPaths(board));

    }

    public static int[][] readInBoard() {

        int width = 1;
        int height = 1;

        
        try{
    
            BufferedReader boardReader = new BufferedReader(new FileReader("board.txt"));

            //Get height
            int lines = 0;
            while (boardReader.readLine() != null) lines++;
            height = lines;

            //Get width
            boardReader.close();
            boardReader = new BufferedReader(new FileReader("board.txt"));
            //width = (new String(boardReader.readLine()).length() + 1) / 2;
            width = boardReader.readLine().split(" ").length;

            int[][] boardVariable = new int[width][height];

            boardReader.close();
            boardReader = new BufferedReader(new FileReader("board.txt"));

            for (int i = 0; i < height; i++) {
                String[] values = boardReader.readLine().split(" ");
                for (int j = 0; j < width; j++) {
                    boardVariable[i][j] = Integer.parseInt(values[j]);
                }
            }

            return boardVariable;

        } catch (Exception e) {}

        return new int[0][0];

    }

    public static int totalPaths(int[][] board){

        int max = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] > max){
                    max = board[i][j];
                }
            }
        }

        return max;

    }

}
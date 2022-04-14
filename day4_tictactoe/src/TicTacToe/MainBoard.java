package TicTacToe;

public class MainBoard {
    private String[][] matrix;


    public MainBoard() {
        matrix = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = " _ ";
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.print("\n");
        }
    }

    public boolean hasSpace() {
        int totalGrid = 9;
        int spaceTaken = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] != " _ ") {
                    spaceTaken++;
                }
            }
        }
        return spaceTaken != totalGrid;
    }

    public String getCharAtIndex(int row, int column) {
        return matrix[row][column];
    }

    public void setCharAtIndex(int row, int column, String chars) {
        matrix[row][column] = chars;
    }

}

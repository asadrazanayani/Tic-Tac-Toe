package TicTacToe;

public class Main {
    public static void main(String[] args) {

        GameImplementation.askForPlayerNames();
        GameImplementation.displayPlayerNames();
        GameImplementation.generateBoard();

        while (!GameImplementation.gameOver) {
            if (!GameImplementation.aBoard.hasSpace()) {
                System.out.println("No more space left on the board. Game Over");
                return;
            }
            GameImplementation.displayBoard();
            GameImplementation.takingTurn(" X ");
            GameImplementation.displayBoard();
            GameImplementation.isGameOver(" X ");
            if (GameImplementation.gameOver) {
                System.out.println(GameImplementation.getPlayer1() +  " is the winner");
                return;
            }
            GameImplementation.takingTurn(" O ");
            GameImplementation.displayBoard();
            GameImplementation.isGameOver(" O ");
            if (GameImplementation.gameOver) {
                System.out.println(GameImplementation.getPlayer2() +  " is the winner");
                return;
            }
            GameImplementation.isGameOver(" O ");
        }

    }


}

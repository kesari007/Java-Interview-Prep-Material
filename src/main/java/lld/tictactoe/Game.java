package lld.tictactoe;

public class Game {
    Board board ;
    Player[] player ;
    boolean isOver;

    public Game(){
        board = new Board(3,3);
        player = new Player[]{new Player(PieceType.X), new Player(PieceType.O)};
        isOver = false;
    }

    public void start(){
        Player currentPlayer = player[0];
        while(!isOver){
            if(currentPlayer == player[1]){
                currentPlayer = player[0];
            } else {
                currentPlayer = player[1];
            }
            System.out.println("Player " + currentPlayer.type + " turn");
            currentPlayer.makeMove(board);

            //check for winner
            Player player = board.findWinner();
            if(player != null){
                System.out.println("Player " + player.type + " is the winner");
                isOver=true;
            }
        }
    }
}

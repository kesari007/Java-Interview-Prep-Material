package lld.tictactoe;

public class Player {
    PieceType type;
    public Player(PieceType type){
        this.type = type;
    }

    public void makeMove(Board board){
        board.makeMove(type);
    }
}

package lld.tictactoe;

public class Cell {
    int x ;
    int y;
    PieceType piece;

    public Cell(int x, int y, PieceType piece) {
        this.x = x;
        this.y = y;
        this.piece = piece;
    }

    public PieceType getPiece() {
        return piece;
    }

    public void setPiece(PieceType piece) {
        this.piece = piece;
    }
}

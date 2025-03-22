package lld.chess.Piece;

import lld.chess.Color;
import lld.chess.PieceType;

public class Rook extends Piece{
    public Rook(int currX, int currY, Color color){
        super(currX, currY, PieceType.ROOK, color);
    }

    public boolean canMove(int destX, int destY){
        return true ;
    }
}

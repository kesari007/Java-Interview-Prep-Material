package lld.chess.Piece;

import lld.chess.Color;
import lld.chess.PieceType;

public class Pawn extends Piece{
    public Pawn(int currX, int currY, Color color){
        super(currX, currY, PieceType.PAWN, color);
    }

    @Override
    public boolean canMove(int destX,int destY){
        return true ;
    }
}

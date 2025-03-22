package lld.chess.Piece;

import lld.chess.Color;
import lld.chess.PieceType;

public class Bishop extends Piece{

    public Bishop(int currX, int currY, Color color){
        super(currX, currY, PieceType.BISHOP, color);
    }

    @Override
    public boolean canMove(int destX,int destY){
        return true ;
    }
}

package lld.chess.Piece;

import lld.chess.Color;
import lld.chess.PieceType;

public class Queen extends Piece{
    public Queen(int currX, int currY, Color color){
        super(currX, currY, PieceType.QUEEN, color);
    }
    @Override
    public boolean canMove(int destX, int destY){
        return true ;
    }
}

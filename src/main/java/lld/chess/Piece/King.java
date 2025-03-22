package lld.chess.Piece;

import lld.chess.Color;
import lld.chess.PieceType;

public class King extends Piece{

    public King(int currX, int currY, Color color){
        super(currX, currY, PieceType.KING, color);
    }

    @Override
    public boolean canMove(int destX, int destY){
        return true ;
    }
}

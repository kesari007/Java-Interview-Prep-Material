package lld.chess.Piece;

import lld.chess.Color;
import lld.chess.PieceType;

public class Knight extends Piece{

    public Knight(int currX, int currY, Color color) {
        super(currX, currY, PieceType.KNIGHT, color);
    }

    @Override
    public boolean canMove(int destX, int destY) {
        //update logic
        return true;
    }
}

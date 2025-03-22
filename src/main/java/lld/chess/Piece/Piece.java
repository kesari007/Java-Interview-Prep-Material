package lld.chess.Piece;

import lld.chess.Color;
import lld.chess.PieceType;

public abstract class Piece {
    int currX ;
    int currY ;
    Color color;
    PieceType type;
    public Piece(int currX, int currY, PieceType type, Color color) {
        this.currX = currX;
        this.currY = currY;
        this.type = type;
        this.color = color;
    }
    public abstract boolean canMove(int destX, int destY);

    public int getCurrX() {
        return currX;
    }

    public void setCurrX(int currX) {
        this.currX = currX;
    }

    public int getCurrY() {
        return currY;
    }

    public void setCurrY(int currY) {
        this.currY = currY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public PieceType getType() {
        return type;
    }

    public void setType(PieceType type) {
        this.type = type;
    }
}

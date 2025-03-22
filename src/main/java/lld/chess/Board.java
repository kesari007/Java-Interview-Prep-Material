package lld.chess;

import lld.chess.Piece.*;

public class Board {

    Piece[][] board ;
    public Board() {
        this.board = new Piece[8][8];
        initializeBoard();
    }

    private void initializeBoard(){

        board[0][0] = new Rook(0,0, Color.BLACK);
        board[0][1] = new Knight(0,1, Color.BLACK);
        board[0][2] = new Bishop(0,2, Color.BLACK);
        board[0][3] = new Queen(0,3, Color.BLACK);
        board[0][4] = new King(0,4, Color.BLACK);
        board[0][5] = new Bishop(0,5, Color.BLACK);
        board[0][6] = new Knight(0,6, Color.BLACK);
        board[0][7] = new Rook(0,7, Color.BLACK);

        board[7][0] = new Rook(7,0, Color.WHITE);
        board[7][1] = new Knight(7,1, Color.WHITE);
        board[7][2] = new Bishop(7,2, Color.WHITE);
        board[7][3] = new Queen(7,3, Color.WHITE);
        board[7][4] = new King(7,4, Color.WHITE);
        board[7][5] = new Bishop(7,5, Color.WHITE);
        board[7][6] = new Knight(7,6, Color.WHITE);
        board[7][7] = new Rook(7,7, Color.WHITE);


        for(int i=0;i<8;i++){
            if(i == 1 || i == 6){
                for(int j=0;j<8;j++){
                    if(i == 1){
                        board[i][j] = new Pawn(i,j, Color.BLACK);
                    } else {
                        board[i][j] = new Pawn(i,j, Color.WHITE);
                    }

                }
            }
        }
    }

    public Piece getPiece(int row, int col){
        return board[row][col];
    }

    public void setPiece(int row, int col, Piece piece){
        board[row][col] = piece;
    }

    public void makeMove(Piece currentPiece, int destX, int destY){
        setPiece(currentPiece.getCurrX(), currentPiece.getCurrY(), null);
        setPiece(destX,destY, currentPiece);
    }

    public boolean isGameOver(){
        return false;
    }

    public void displayBoard(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] != null? board[i][j].getType() + " " : board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

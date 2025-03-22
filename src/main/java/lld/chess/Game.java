package lld.chess;

import lld.chess.Piece.Piece;

import java.util.Scanner;

public class Game {

    Board board;
    Player[] players;
    Player currentPlayer ;
    boolean isGameOver ;

    public Game(){
        board = new Board();
        players = new Player[]{new Player("White", Color.WHITE), new Player("Black", Color.BLACK)};
        currentPlayer = players[0];
    }
    public void startGame(){
        while(!isGameOver){
            currentPlayer = currentPlayer == players[0] ?  players[1] : players[0] ;
            System.out.println("It's " + currentPlayer.name + "'s turn");

            // make move
            makeMove(board, currentPlayer);
            board.displayBoard();
            // check if game is over
            isGameOver = board.isGameOver();
        }
    }

    private void makeMove(Board board, Player player){
        System.out.println("Enter the co-ordinates of the piece you want to move");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number");
        int currX = sc.nextInt();
        System.out.println("Enter column number");
        int currY = sc.nextInt();
        System.out.println("Enter the destination co-ordinates of the piece");
        System.out.println("Enter row number - ");
        int destX = sc.nextInt();
        System.out.println("Enter column number - ");
        int destY = sc.nextInt();


        Piece currentPiece = board.getPiece(currX, currY);
        if(currentPiece != null && validMove(destX,destY,player.color, currentPiece)){
            board.makeMove(currentPiece, destX, destY);
        } else {
            System.out.println("Not a valid move, please try again!");
            makeMove(board, player);
        }
    }

    private boolean validMove(int x, int y, Color color, Piece currentPiece) {
        return x >= 0 && y >= 0 && x < 8 && y < 8 && color == currentPiece.getColor() && currentPiece.canMove(x, y);
    }
}

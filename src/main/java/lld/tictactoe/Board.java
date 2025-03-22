package lld.tictactoe;

import java.util.Scanner;

public class Board {
    Cell[][] cells ;
    public Board(int x, int y){
        cells = new Cell[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                cells[i][j] = new Cell(i,j,null);
            }
        }
    }

    private boolean validMove(int x, int y, PieceType type){
        if(x<0 || y<0 || x> cells.length || y > cells[0].length || cells[x][y].getPiece() != null || cells[x][y].getPiece() == type){
            return false ;
        }
        return true ;
    }
    public void makeMove(PieceType type){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinates below");
        System.out.println("Enter the row number");
        int x = sc.nextInt();
        System.out.println("Enter the column number");
        int y = sc.nextInt();

        if(validMove(x,y,type)){
            cells[x][y].setPiece(type);
        } else {
            System.out.println("Enter a valid move");
            makeMove(type);
        }
    }

    public Player findWinner(){
        //check rows
        for(int i=0;i< cells.length;i++){
            int count = 0;
            for(int j=0;j<cells[0].length;j++){
                if(cells[i][j].piece != null && cells[i][j].piece == cells[i][0].piece){
                    count++;
                }
            }
            if(count == cells[0].length){
                return new Player(cells[i][0].piece);
            }
        }

        //check columns
        for(int i=0;i< cells.length;i++){
            int count = 0;
            for(int j=0;j<cells[0].length;j++){
                if(cells[j][i].piece != null && cells[j][i].piece == cells[0][i].piece){
                    count++;
                }
            }
            if(count == cells[0].length){
                return new Player(cells[0][i].piece);
            }
        }
        // check diagonals
        for(int i=0;i<cells.length;i++){
            int count = 0;
            for(int j=0;j<cells[0].length;j++){
                if(i == j && cells[i][j] != null && cells[i][j].piece == cells[0][0].piece){
                    count++;
                }
            }
            if(count == cells.length) {
                return new Player(cells[0][0].piece);
            }
        }
        //check reverse diagonals
        for(int i=0;i<cells.length;i++){
            int count = 0;
            for(int j=0;j<cells[0].length;j++){
                if(i+j == cells.length-1 && cells[i][j] != null && cells[i][j].piece == cells[0][cells.length-1].piece){
                    count++;
                }
            }
            if(count == cells.length) {
                return new Player(cells[0][cells.length-1].piece);
            }
        }

        return null;
    }
}

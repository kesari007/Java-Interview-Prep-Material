package lld.chess;

public class Player {
    String name ;
    public final Color color ;

    public Player(String name,  Color color){
        this.name = name;
        this.color = color;
    }

    public String getName(){
        return name;
    }
}

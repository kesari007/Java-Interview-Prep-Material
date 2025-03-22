package test;

import java.util.HashSet;

public class NewDataStructure {

    HashSet<Integer> hs ;
    public NewDataStructure (){
        this.hs = new HashSet<>();
    }

    public void add(int x){
        hs.add(x);
    }

    public void remove(int x){
        if(hs.contains(x)){
            hs.remove(x);
        }
    }

    public int search(int x){
        if(hs.contains(x)){
            return x;
        }
        return 0;
    }

    public int getRandom(){
        int size = hs.size();
        int random = (int) (Math.random() * size);
        return (int)hs.toArray()[random];
    }

}

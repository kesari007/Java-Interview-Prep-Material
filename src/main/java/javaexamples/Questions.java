package javaexamples;

public class Questions {
    public int add(int x, int y){
        return x+y;
    }

    @Override
    public String toString() {
        return "Hello";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

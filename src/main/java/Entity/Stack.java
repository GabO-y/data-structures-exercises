package Entity;

public class Stack<T> extends List<T>{

    public Element<T> top(){
        return getLast();
    }

}

package Entity;

import java.awt.desktop.QuitResponse;

public class Stack<T> extends List<T>{

    public Element<T> top(){
        return getLast();
    }

    public Queue<T> toQueue(){

        if(isEmpty()) return null;

        var current = element;
        Queue<T> queue = new Queue<>();

        while(current != null){
            queue.push(current.getValue());
            current = current.getNext();
        }

        return queue;
    }

}

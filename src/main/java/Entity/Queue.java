package Entity;

public class Queue<T> extends List<T> {

    public Queue(Element<T> element){
        super(element);
    }

    public Queue(){}

    public Element<T> push(T value){
        return add(value);
    }

    public Element<T> pop(){
        element = element.getNext();
        return element;
    }

}

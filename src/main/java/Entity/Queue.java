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
        return removeFirst();
    }

    public Stack<T> toStack(){

        if(isEmpty()) return null;

        var current = element;
        Stack<T> stack = new Stack<>();

        while(current != null){
            stack.add(current.getValue());
            current = current.getNext();
        }

        return stack;
    }

}

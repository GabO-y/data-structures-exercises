public class Queue<T> {

    Element<T> element;

    public Element<T> push(T value){

        if(element == null){
            element = new Element<>(value);
            return element;
        }

        var current = element;

        while(current.getNext() != null){
            current = current.getNext();
        }

        current.setNext(new Element<>(value));

        return current.getNext();

    }

    public Element<T> pop(){
        if(element == null) return null;
        element = element.getNext();
        return element;
    }

    public Element<T> top(){
        return element;
    }


    @Override
    public String toString(){

        if(element == null) return "empty";

        StringBuilder sb = new StringBuilder();

        var current = element;

        while(current.getNext() != null){
            sb.append(current.getValue() + " ");
            sb.append("-> ");
            current = current.getNext();
        }

        sb.append(current.getValue());

        return sb.toString();

    }

}

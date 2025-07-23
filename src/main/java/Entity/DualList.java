package Entity;

public class DualList<T> extends List<T>{

    @Override
    public Element<T> addFirst(T value) {

        if (isEmpty()) {
            element = new Element<>(value);
            return element;
        }

        var first = element;
        var newFirst = new Element<>(value);

        newFirst.setNext(first);
        first.setPre(newFirst);

        element = newFirst;

        return element;

    }

    @Override
    public Element<T> addLast(T value){

        if(isEmpty()){
            element = new Element<>(value);
            return element;
        }

        var lastNew = new Element<>(value);
        var last = getLast();

        last.setNext(lastNew);
        lastNew.setPre(last);

        return lastNew;
    }

    @Override
    public Element<T> addElementByPosition(int index, T value){

        if(isEmpty()){
            element = new Element<>(value);
            return element;
        }

        if(index <= 1) return this.addFirst(value);
        if(index > size()) return this.addLast(value);

        var pre = get(index - 1);
        var next = get(index);

        var newElement = new Element<>(value);

        pre.setNext(newElement);
        next.setPre(newElement);

        newElement.setNext(next);
        newElement.setPre(pre);

        return newElement;
    }

    @Override
    public DualList<T> invert(){

        if(isEmpty()) return null;

        var current = getLast();

        DualList<T> list = new DualList<>();

        while (current != null){
            list.add(current.getValue());
            current = current.getPre();
        }

        return list;

    }

    @Override
    public Element<T> removeFirst(){

        if(isEmpty()) return null;

        element = element.getNext();
        element.setPre(null);

        return element;

    }

    @Override
    public String toString() {

        if(isEmpty()) return "Empty";

        StringBuilder string = new StringBuilder("null <-> ");

        var current = element;

        while (current != null){
            string.append(current.getValue()).append(" <-> ");
            current = current.getNext();
        }

        string.append("null");

        return string.toString();

    }
}

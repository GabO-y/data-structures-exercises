package Entity;

public class ArrayList<T> extends List<T>{

    T[] elements;

    @Override
    public Element<T> add(T value){
        return this.addLast(value);
    }

    @Override
    public Element<T> addLast(T value){

        if(isEmpty()){
            elements = (T[]) new Object[]{value};
            return new Element<>(elements[0]);
        }

        var news = (T[]) new Object[elements.length + 1];

        for(int i = 0; i < elements.length; i++){
            news[i] = elements[i];
        }

        news[news.length - 1] = value;

        elements = news;

        return new Element<>(value);
    }

    @Override
    public Element<T> addFirst(T value){

        if(isEmpty()){
            elements = (T[]) new Object[]{value};
            return new Element<>(elements[0]);
        }

        var news = (T[]) new Object[elements.length + 1];

        news[0] = value;

        for(int i = 0; i < elements.length; i++){
            news[i + 1] = elements[i];
        }

        elements = news;

        return new Element<>(value);
    }

    @Override
    public Element<T> addElementByPosition(int index, T value) {

        if(isEmpty()){
            elements = (T[]) new Object[]{value};
            return new Element<>(elements[0]);
        }

        if(index <= 1) return addFirst(value);
        if(index > size()) return addLast(value);

        var news = (T[]) new Object[elements.length + 1];

        for(int i = 0, l = 0; i < news.length; i++){

            if(i == (index - 1)){
                news[i] = value;
                l++;
                continue;
            }

            news[i] = elements[i - l];
        }

        elements = news;

        return new Element<>(value);
    }

    @Override
    public Element<T> removeFirst(){

        if(isEmpty()) return null;

        var news = (T[]) new Object[elements.length - 1];

        for(int i = 0; i < news.length; i++){
            news[i] = elements[i + 1];
        }

        T first = elements[0];
        elements = news;

        return new Element<>(first);
    }

    @Override
    public Element<T> removeLast(){

        if(isEmpty()) return null;

        var news = (T[]) new Object[elements.length - 1];

        for(int i = 0; i < news.length; i++){
            news[i] = elements[i];
        }

        T last = elements[elements.length - 1];
        elements = news;

        return new Element<>(last);
    }

    @Override
    public boolean isEmpty(){
        return elements == null;
    }

    @Override
    public Element<T> get(int index){
        return new Element<>(elements[index - 1]);
    }

    @Override
    public Element<T> getLast(){
        return new Element<>(elements[elements.length - 1]);
    }

    @Override
    public Element<T> getFirst(){
        return new Element<>(elements[0]);
    }

    @Override
    public long size(){
        return elements.length;
    }

    @Override
    public ArrayList<T> invert(){

        if(isEmpty()) return null;

        ArrayList<T> array = new ArrayList<>();

        for(int i = elements.length - 1; i >= 0; i--){
            array.add(elements[i]);
        }

        return array;
    }

    @Override
    public String toString() {

        if(isEmpty()) return "Empty";

        StringBuilder result = new StringBuilder();

        for(T t : elements){
            result.append(t).append(" -> ");
        }

        result.append("null");

        return result.toString();
    }

}

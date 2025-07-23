package Entity;

public class Element<T> {

    private T value;
    private Element<T> next;
    private Element<T> pre;


    public Element(){}

    public Element(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Element<T> getNext() {
        return next;
    }

    public void setNext(Element<T> next) {
        this.next = next;
    }

    public Element<T> getPre() {
        return pre;
    }

    public void setPre(Element<T> pre) {
        this.pre = pre;
    }

    @Override
    public String toString() {
        return "(" + value + ")";
    }

    public String test(){
        return (pre != null ? pre.value : "null") + " <- " + value + " -> " + (next != null ? next.value : "null");
    }

}

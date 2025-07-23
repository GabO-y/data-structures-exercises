package Entity;

public class List<T> {

        protected Element<T> element;

        public List(Element<T> element) {
            this.element = element;
        }

        public List(){}

        public Element<T> add(T value){

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

        public Element<T> removeLast(){

            if(element == null){
                return null;
            }

            var current = element;

            while (current.getNext().getNext() != null){
                current = current.getNext();
            }

            Element<T> last = new Element<>(current.getNext().getValue());

            current.setNext(null);

            return last;

        }

        public Element<T> removeFirst(){

            if(element == null){
                return null;
            }

            var first = element;
            element = element.getNext();
            return first;
        }

        public long size(){

            if(element == null) return 0;

            var current = element;
            long size = 0;

            while (current != null){
                size++;
                current = current.getNext();
            }

            return size;

        }

        public String toString(){

            if(element == null) return "empty";

            return element.toString();
        }

    }


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

        public Element<T> get(int index){

            if(index < 1 || index > size()){
                throw new IndexOutOfBoundsException("index: " + index + " is out of the bounds");
            }

            if(index == 1){
                return getFirst();
            }

            if(index == size()){
                return getLast();
            }

            if(isEmpty()) return null;

            var current = element;

            for(int i = 0; i < (index - 1); i++){
                current = current.getNext();
            }

            return current;
        }

        public Element<T> getFirst(){
            return element;
        }

        public Element<T> getLast(){
            if(element == null) return null;

            var current = element;

            while(current.getNext() != null){
                current = current.getNext();
            }

            return current;
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

            if(isEmpty()) return "empty";

            StringBuilder string = new StringBuilder();

            var current = element;

            while (current != null){
                string.append(current).append(" -> ");
                current = current.getNext();
            }

            string.append("null");

            return string.toString();

        }

        public boolean isEmpty(){
            return element == null;
        }

    }


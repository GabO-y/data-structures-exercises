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

        public String toString(){

            if(element == null) return "empty";

            StringBuilder string = new StringBuilder();

            var current = element;

            while(current.getNext() != null){
                string.append(current.getValue());
                string.append(" -> ");
                current = current.getNext();
            }

            string.append(current.getValue());

            return string.toString();
        }

    }


public class Tests {

    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>(){{
            push(1);
            push(2);
            push(3);
            push(4);
            pop();
            push(1);
            pop();
        }};


        System.out.println(queue);

    }

}

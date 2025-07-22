package Main;

import Entity.Queue;

public class Main {

    public static void main(String[] args) {

    Queue<Integer> q = new Queue<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            pop();
        }};

        System.out.println(q);

    }

}

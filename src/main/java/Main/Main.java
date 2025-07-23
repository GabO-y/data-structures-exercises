package Main;

import Entity.Queue;
import Entity.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> l = new Stack<>(){{

            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);

        }};

        Queue<Integer> queue = l.toQueue();
        l = queue.toStack();

        System.out.println(queue);
        System.out.println(l);

    }

}

package Main;

import Entity.Element;
import Entity.List;
import Entity.Queue;

public class Main {

    public static void main(String[] args) {

        List<Integer> l = new List<>(){{

            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);

        }};

        System.out.println(l.get(7));

    }

}

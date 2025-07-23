package Main;

import Entity.ArrayList;
import Entity.DualList;
import Entity.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>(){{

            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);
            add(9);
            add(10);
            add(12);
            add(13);
        }};

        System.out.println(l);
        System.out.println(l.invert());



    }

}

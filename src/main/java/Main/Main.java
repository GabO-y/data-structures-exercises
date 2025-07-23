package Main;

import Entity.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> l = new List<>(){{

            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(7);
            addElementByPosition(898, 6);


        }};

        System.out.println(l);
        System.out.println(l.size());


    }

}

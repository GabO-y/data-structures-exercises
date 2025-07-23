package Main;

import Entity.DualList;
import Entity.List;

public class Main {

    public static void main(String[] args) {

        DualList<Integer> l = new DualList<>(){{

            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(7);
            add(8);


            removeFirst();
            removeFirst();

            removeLast();
            removeLast();

        }};

        System.out.println(l + "\n");

        for(int i = 0; i < l.size(); i++){
            System.out.println(l.get(i + 1).test());
        }


    }

}

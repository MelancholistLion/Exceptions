package uaslp.objetos.list;

import uaslp.objetos.list.ArrayList.*;
import uaslp.objetos.list.LinkedList.*;

public class Main {
    public static void main(String[] args) {

        List datos = new ArrayList();

        datos.addAtTail("uno");
        datos.addAtTail("dos");
        datos.addAtTail("tres");
        datos.addAtFront("u");
        datos.addAtFront("d");
        datos.addAtFront("t");

        Iterator iterator = datos.getIterator();

        while(iterator.hasNext()) {
            String value = iterator.next();

            System.out.println(value);
        }

        List datos1 = new LinkedList();

        datos1.addAtFront("uno");
        datos1.addAtFront("dos");
        datos1.addAtFront("tres");

        datos1.addAtTail("u");
        datos1.addAtTail("d");
        datos1.addAtTail("t");

        Iterator iterator1 = datos1.getIterator();

        while(iterator1.hasNext()) {
            String value = iterator1.next();

            System.out.println(value);
        }
    }
}
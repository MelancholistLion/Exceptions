package uaslp.objetos.list.LinkedList.test;
import uaslp.objetos.list.LinkedList.LinkedList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class LinkedListTest {
    @Test
    public void getIteratorTest() {
        LinkedList test = new LinkedList();

        test.addAtTail("1");
        test.addAtTail("2");
        test.addAtTail("3");

        LinkedList.LinkedListIterator testIterator = test.getIterator();

        int i = 0;
        while(testIterator.hasNext()) {
            Assertions.assertEquals(test.getAt(i), testIterator.next());
            i++;
        }
    }
    @Test
    public void addAtTailTest() {
        LinkedList test = new LinkedList();

        test.addAtTail("1");
        test.addAtTail("2");
        test.addAtTail("3");

        Assertions.assertEquals("1", test.getAt(0));
        Assertions.assertEquals("2", test.getAt(1));
        Assertions.assertEquals("3", test.getAt(2));
    }

    @Test
    public void addAtFrontTest() {
        LinkedList test = new LinkedList();

        test.addAtFront("1");
        test.addAtFront("2");
        test.addAtFront("3");

        Assertions.assertEquals("3", test.getAt(0));
        Assertions.assertEquals("2", test.getAt(1));
        Assertions.assertEquals("1", test.getAt(2));
    }

    @Test
    public void removeTest() {
        LinkedList test = new LinkedList();

        test.addAtTail("1");
        test.addAtTail("2");
        test.addAtTail("3");

        test.remove(1);

        Assertions.assertEquals("1", test.getAt(0));
        Assertions.assertEquals("3", test.getAt(1));

        test.remove(1);

        Assertions.assertEquals("1", test.getAt(0));

        test.remove(0);

        Assertions.assertNull(test.getAt(0));
    }

    @Test
    public void setAtTest() {
        LinkedList test = new LinkedList();

        test.addAtTail("1");
        test.addAtTail("2");
        test.addAtTail("3");

        test.setAt(0, "4");
        test.setAt(1, "5");
        test.setAt(2, "6");


        Assertions.assertEquals("4", test.getAt(0));
        Assertions.assertEquals("5", test.getAt(1));
        Assertions.assertEquals("6", test.getAt(2));
    }

    @Test
    public void getSizeTest() {
        LinkedList test = new LinkedList();

        test.addAtTail("1");
        test.addAtTail("2");
        test.addAtTail("3");

        Assertions.assertEquals(3, test.getSize());
    }

    @Test
    public void getAtTest() {
        LinkedList test = new LinkedList();

        test.addAtTail("1");
        test.addAtTail("2");
        test.addAtTail("Trolling");

        Assertions.assertEquals("1", test.getAt(0));
        Assertions.assertEquals("2", test.getAt(1));
        Assertions.assertEquals("Trolling", test.getAt(2));


    }

    @Test
    public void removeAllWithValueTest() {
        LinkedList test = new LinkedList();

        test.addAtTail("1");
        test.addAtTail("2");
        test.addAtTail("3");
        test.addAtTail("3");
        test.addAtTail("3");

        test.removeAllWithValue("4");

        Assertions.assertEquals(5, test.getSize());
        Assertions.assertEquals("1", test.getAt(0));
        Assertions.assertEquals("2", test.getAt(1));
    }
    @Test
    public void removeAllTest() {
        LinkedList test = new LinkedList();

        test.addAtTail("1");
        test.addAtTail("2");
        test.addAtTail("3");

        Assertions.assertEquals("1", test.getAt(0));
        Assertions.assertEquals("2", test.getAt(1));
        Assertions.assertEquals("3", test.getAt(2));

        test.removeAll();

        Assertions.assertEquals(0, test.getSize());
    }
}

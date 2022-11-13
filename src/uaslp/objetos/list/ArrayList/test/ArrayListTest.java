package uaslp.objetos.list.ArrayList.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import uaslp.objetos.list.ArrayList.ArrayList;
import uaslp.objetos.list.Iterator;


public class ArrayListTest {
    @Test
    public void addAtTailTest() {
        ArrayList test = new ArrayList();

        test.addAtTail("1");
        test.addAtTail("2");
        test.addAtTail("3");

        Assertions.assertEquals("1", test.getAt(0));
        Assertions.assertEquals("2", test.getAt(1));
        Assertions.assertEquals("3", test.getAt(2));
    }

    @Test
    public void addAtFrontTest() {
        ArrayList test = new ArrayList();

        test.addAtFront("3");
        test.addAtFront("2");
        test.addAtFront("1");

        Assertions.assertEquals("1", test.getAt(0));
        Assertions.assertEquals("2", test.getAt(1));
        Assertions.assertEquals("3", test.getAt(2));
    }

    @Test
    public void removeTest() {
        ArrayList test = new ArrayList();

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
    public void removeAll() {
        ArrayList test = new ArrayList();

        test.addAtTail("1");
        test.addAtTail("2");
        test.addAtTail("3");

        Assertions.assertEquals("1", test.getAt(0));
        Assertions.assertEquals("2", test.getAt(1));
        Assertions.assertEquals("3", test.getAt(2));

        test.removeAll();

        Assertions.assertEquals(0, test.getSize());
    }

    @Test
    public void setAtTest() {
        ArrayList test = new ArrayList();

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
    public void getAtTest() {
        ArrayList test = new ArrayList();

        test.addAtTail("1");
        test.addAtTail("2");
        test.addAtTail("Trolling");

        Assertions.assertEquals("1", test.getAt(0));
        Assertions.assertEquals("2", test.getAt(1));
        Assertions.assertEquals("Trolling", test.getAt(2));


    }

    @Test
    public void removeAllWithValueTest() {
        ArrayList test = new ArrayList();

        test.addAtTail("1");
        test.addAtTail("2");
        test.addAtTail("3");
        test.addAtTail("3");
        test.addAtTail("3");

        test.removeAllWithValue("3");

        Assertions.assertEquals(2, test.getSize());
        Assertions.assertEquals("1", test.getAt(0));
        Assertions.assertEquals("2", test.getAt(1));
    }

    @Test
    public void getSizeTest() {
        ArrayList test = new ArrayList();

        test.addAtTail("1");
        test.addAtTail("2");
        test.addAtTail("3");

        Assertions.assertEquals(3, test.getSize());
    }

    @Test
    public void getIteratorTest() {
        ArrayList test = new ArrayList();

        test.addAtTail("1");
        test.addAtTail("2");
        test.addAtTail("3");

        Iterator testIterator = test.getIterator();

        int i = 0;
        while(testIterator.hasNext()) {
            Assertions.assertEquals(test.getAt(i), testIterator.next());
            i++;
        }
    }
}

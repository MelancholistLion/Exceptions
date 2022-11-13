package uaslp.objetos.list.ArrayList;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;
import uaslp.objetos.list.exceptions.NullNotAllowedException;
import uaslp.objetos.list.exceptions.WrongIndexException;

public class ArrayList implements List {
    private String[] data;
    private int size;
    public ArrayList() {
        data = new String[2];
    }

    public void addAtTail(String data) throws NullNotAllowedException {

        if(size == this.data.length) {
            increaseArraySize();
        }
        this.data[size] = data;
        size++;
    }

    private void increaseArraySize() {
        String []newArray = new String[this.data.length * 2];

        for(int i = 0; i < data.length; i++) {
            newArray[i] = data[i];
        }
        data = newArray;
    }

    public void addAtFront(String data) throws NullNotAllowedException {
        if(size == this.data.length) {
            increaseArraySize();
        }

        for(int i = size; i > 0; i--) {
            this.data[i] = this.data[i - 1];
        }
        this.data[0] = data;
        this.size++;
    }

    public void remove(int indexToRemove) throws WrongIndexException{
        if(indexToRemove < 0 || indexToRemove >= size) {
            throw new WrongIndexException();
        }
        for(int i = indexToRemove; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        data[size] = null;
    }

    public void removeAll() {
        for(int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public void setAt(int index, String data) {
        if(index < 0 || index >= size) {
            throw new WrongIndexException();
        }

        this.data[index] = data;
    }

    public String getAt(int index) {
        if(index < 0 || index >= size) {
            return null;
        }

        return this.data[index];
    }

    public void removeAllWithValue(String value) {
        String []newArray = new String[data.length];
        int count = 0;
        for(int i = 0; i < size; i++) {
            if(!data[i].equals(value)) {
                newArray[count] = data[i];
                count++;
            }
        }
        this.data = newArray;
        size = count;
    }

    public int getSize() {
        return size;
    }

    public class ArrayListIterator implements Iterator {
        private ArrayList arrayList;
        private int currentIndex = 0;

        public ArrayListIterator(ArrayList arrayList) {
            this.arrayList = arrayList;
        }


        public boolean hasNext() {
            return currentIndex < arrayList.getSize();
        }
        public String next() {
            return arrayList.getAt(currentIndex++);
        }
    }

    public Iterator getIterator() {
        return new Iterator() {
            private int currentIndex = 0;
            public boolean hasNext() {
                return currentIndex < size;
            }

            public String next() {
                return data[currentIndex++];
            }
        };
    }

}






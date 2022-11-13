package uaslp.objetos.list;

import uaslp.objetos.list.exceptions.NullNotAllowedException;
import uaslp.objetos.list.exceptions.WrongIndexException;

public interface List {

    /**
     * No acepta nulos
     *
     * @param data
     */
    void addAtTail(String data) throws NullNotAllowedException;

    void addAtFront(String data) throws NullNotAllowedException;

    void remove(int index) throws WrongIndexException;

    void removeAll();

    /**
     * Permite colocar un elemento en un índice específico de la lista.
     *
     * @param index Indice del elemento a insertar
     * @param data  Dato a colocar en la lista
     * @return true si el indice era válido, false de lo contrario
     */
    void setAt(int index, String data) throws WrongIndexException, NullNotAllowedException;

    String getAt(int index) throws WrongIndexException;

    void removeAllWithValue(String data);

    int getSize();

    Iterator getIterator();
}

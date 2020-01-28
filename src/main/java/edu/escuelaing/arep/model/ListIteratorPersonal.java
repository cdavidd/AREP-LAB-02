package edu.escuelaing.arep.model;

import java.util.Iterator;

class ListIteratorPersonal<E> implements Iterator<E> {
    Node<E> current;

    /**
     * Crea el iterador personal
     * 
     * @param actual
     */
    public ListIteratorPersonal(Node<E> actual) {
        current = actual;
    }

    /**
     * Compara si tiene un siguiente el nodo actual
     * 
     * @return boolean
     */
    public boolean hasNext() {
        return current != null;
    }

    /**
     * Retorna el valor del nodo actual
     * 
     * @return E
     */
    public E next() {
        E data = current.getData();
        current = current.getNext();
        return data;
    }

}
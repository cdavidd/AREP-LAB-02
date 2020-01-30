package edu.escuelaing.arep.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<E> implements List<E> {
    private int size = 0;
    private Node<E> head = new Node<E>();
    // private Node<E> actual = null;

    /**
     *
     */
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        return false;
    }

    /**
     * Iterador para moverse entre los elementes de la linkedList
     * 
     * @return ListIteratorPersonal
     */
    public Iterator<E> iterator() {
        return new ListIteratorPersonal<E>(head.getPrior());
    }

    public Object[] toArray() {
        return null;
    }

    public <T> T[] toArray(T[] a) {
        return null;
    }

    /**
     * Añade a la linkedList el dato ingresado
     * 
     * @param e dato a agregar en la LinkedList
     * @return boolean
     */
    public boolean add(E e) {
        Node<E> nuevo = new Node<E>(e);
        if (size == 0) {
            head.setPrior(nuevo);
            head.setNext(nuevo);
            // this.actual = nuevo;
        } else {
            head.getNext().setNext(nuevo);
            head.setNext(nuevo);
        }
        size++;
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public void clear() {

    }

    /**
     * Retorna el elemento del indice especificado
     * 
     * @param index del elemento
     * @return dato del nodo
     */
    public E get(int index) {
        if (index < 0 || index < size) {
            int pos = 0;
            Iterator<E> iterador = iterator();
            while (pos != index) {
                iterador.next();
                pos++;
            }
            return iterador.next();
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public E set(int index, E element) {
        return null;
    }

    public void add(int index, E element) {

    }

    public E remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator<E> listIterator() {
        return null;
    }

    public ListIterator<E> listIterator(int index) {
        return null;
    }

    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

}
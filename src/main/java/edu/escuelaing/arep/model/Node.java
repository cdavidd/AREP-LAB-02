package edu.escuelaing.arep.model;
class Node<E> {
    private E data;
    private Node<E> next = null;
    private Node<E> prior = null;

    public Node() {
    }

    /**
     * Contruye un Nodo
     */
    public Node(E dato) {
        this.data = dato;
    }

    /**
     * 
     * @return retorna la informacion guardada en el nodo
     */
    public E getData() {
        return data;
    }

    /**
     * Cambia el balor guardado en el nodo
     * 
     * @param data
     */
    public void setData(E data) {
        this.data = data;
    }

    /**
     * Retorna el siguiente nodo apuntado
     * 
     * @return Nodo
     */
    public Node<E> getNext() {
        return next;
    }

    /**
     * Cambia el el Nodo al que apunta
     * 
     * @param next
     */
    public void setNext(Node<E> next) {
        this.next = next;
    }

    /**
     * Obtiene el nodo anterior
     * 
     * @return
     */
    public Node<E> getPrior() {
        return prior;
    }

    /**
     * Cambia el nodo apuntado anterior
     * 
     * @param prior
     */
    public void setPrior(Node<E> prior) {
        this.prior = prior;
    }

}
class Nodo<T> {
    private T elem;
    private T prox;
    public Nodo(){}; 
    public Nodo(T val) { // construtor do nó da lista
        elem = val;
        prox = null;
    }

    public void setNodo(T prox, T elem) {
        this.prox = prox;
        this.elem = elem;
    }

    public T getElem() {
        return this.elem;
    }

    public T getProx() {
        return this.prox;
    }

}

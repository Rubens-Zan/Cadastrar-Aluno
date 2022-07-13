public class ListaEncadeada<T> {
    private Nodo<T> inicio;
    
    public ListaEncadeada(T inicio) { // construtor da lista
        inicio = null;
    }
    // inserir no inicio da lista
    public void insere(T elemento) {
        Nodo<T> novo = new Nodo<T>(elemento);
        novo.setNodo(inicio.getElem(), elemento);
    }

    public int tamanho() {
        int tam = 0;
        if (inicio.getElem() != null) {
            tam++;
            while (inicio.getProx() != null) {
                tam++;
            }
        }
        return tam;
    }

    public boolean vazia() {
        return this.inicio.getElem() != null ? false : true;
    }
}

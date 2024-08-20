package aula_04;


// FilaCircular.java
@SuppressWarnings("unchecked")
public class FilaCircular<T> {
    private T[] array;
    private int capacidade;
    private int inicio;
    private int fim;
    private int tamanho;

    public FilaCircular(int capacidade) {
        this.capacidade = capacidade;
        this.array = (T[]) new Object[capacidade];
        this.inicio = 0;
        this.fim = 0;
        this.tamanho = 0;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public boolean isFull() {
        return tamanho == capacidade;
    }

    public void enqueue(T elemento) {
        if (isFull()) {
            throw new IllegalStateException("A fila está cheia");
        }
        array[fim] = elemento;
        fim = (fim + 1) % capacidade;
        tamanho++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia");
        }
        T elemento = array[inicio];
        array[inicio] = null; // Para evitar vazamento de memória
        inicio = (inicio + 1) % capacidade;
        tamanho--;
        return elemento;
    }

}

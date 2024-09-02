package aula_04;

@SuppressWarnings("unchecked")
public class CircularQueue<T> {
    private T[] array;
    private int capacidade;
    private int inicio;
    private int fim;
    private int tamanho;

    public CircularQueue(int capacidade) {
        this.capacidade = capacidade;
        this.array = (T[]) new Object[capacidade];
        this.inicio = -1; 
        this.fim = 0;
        this.tamanho = 0;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public boolean isFull() {
        return tamanho == capacidade;
    }

    public void print(){
        for (int i = 0; i < capacidade; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void add(T elemento) {
        if (isFull()) {
            throw new IllegalStateException("A fila está cheia");
        }
        if (isEmpty()) {
            inicio = 0; 
        }
        array[fim] = elemento;
        fim = move(fim);
        tamanho++;
    }

    public T remove() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia");
        }
        T elemento = array[inicio];
        array[inicio] = null; 
        if (tamanho == 1) {
            inicio = -1; 
        } else {
            inicio = move(inicio);
        }
        tamanho--;
        return elemento;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia");
        }
        return array[inicio];
    }

    public int size() {
        return tamanho;
    }

    public void clear() {
        for (int i = 0; i < capacidade; i++) {
            array[i] = null; 
        }
        inicio = -1; 
        fim = 0; 
        tamanho = 0; 
    }

    private int move(int position) {
        return (position + 1) % capacidade;
    }
}

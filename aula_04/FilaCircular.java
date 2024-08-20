package aula_04;

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
        this.inicio = -1; // Inicializa inicio com -1
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

    public void enqueue(T elemento) {
        if (isFull()) {
            throw new IllegalStateException("A fila está cheia");
        }
        if (isEmpty()) {
            inicio = 0; // Ajusta inicio quando o primeiro elemento é adicionado
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
        if (tamanho == 1) {
            inicio = -1; // Ajusta inicio quando a fila fica vazia
        } else {
            inicio = (inicio + 1) % capacidade;
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

    // Método para limpar a fila
    public void clear() {
        for (int i = 0; i < capacidade; i++) {
            array[i] = null; // Limpa todos os elementos
        }
        inicio = -1; // Reseta inicio
        fim = 0; // Reseta fim
        tamanho = 0; // Reseta tamanho
    }
}

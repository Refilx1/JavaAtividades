package Aula_03;

class Pilha {

    private int[] array;
    private int topo;
    private int capacidade;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.array = new int[capacidade];
        this.topo = -1;
    }

    public void push(int elemento) {
        if (isFull()) {
            throw new StackOverflowError("Pilha cheia");
        }
        array[++topo] = elemento;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia");
        }
        return array[topo--];
    }

    public void clear() {
        topo = -1;
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == capacidade - 1;
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        pilha.push(0);
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
    }
}

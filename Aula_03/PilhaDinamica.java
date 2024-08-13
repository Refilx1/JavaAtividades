package Aula_03;

import java.util.ArrayList;

public class PilhaDinamica {
     private ArrayList<Integer> array;
    private int topo;

    public PilhaDinamica() {
        this.array = new ArrayList<>();
        this.topo = -1;
    }

    public void push(int elemento) {
        array.add(++topo, elemento);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia");
        }
        return array.remove(topo--);
    }

    public void clear() {
        array.clear();
        topo = -1;
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public static void main(String[] args) {
        PilhaDinamica pilha = new PilhaDinamica();
    
        pilha.push(0);
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
    }
    
}

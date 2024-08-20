package aula_04;

public class Main {
    public static void main(String[] args) {
        // Criação da fila com tipo String
        FilaCircular<String> fila = new FilaCircular<>(5);

        // Adicionando elementos do tipo String
        fila.enqueue("A");
        fila.enqueue("B");
        fila.enqueue("C");
        fila.enqueue("D");
        fila.enqueue("E");

        // Tentativa de adicionar um elemento em uma fila cheia
        try {
            fila.enqueue("F"); // Deve lançar uma exceção: A fila está cheia
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        // Remover elementos da fila
        System.out.println("Dequeue: " + fila.dequeue()); // Deve mostrar: Dequeue: A

        fila.enqueue("F"); // Adicionar um novo elemento após remover
        System.out.println("Dequeue: " + fila.dequeue()); // Deve mostrar: Dequeue: B

        fila.enqueue("G"); // Adicionar mais um elemento
        System.out.println("Elemento no início: " + fila.peek()); // Deve mostrar: Elemento no início: C
        System.out.println("Tamanho da fila: " + fila.size()); // Deve mostrar: Tamanho da fila: 5
    }
}

package aula_04;

public class Main {
    public static void main(String[] args) {
        // Criação da fila com tipo String
        CircularQueue<String> fila = new CircularQueue<>(5);

        // Adicionando elementos do tipo String
        fila.add("A");
        fila.add("B");
        fila.add("C");
        fila.add("D");
        fila.add("E");

        // Tentativa de adicionar um elemento em uma fila cheia
        try {
            fila.add("F"); // Deve lançar uma exceção: A fila está cheia
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
        
        fila.print(); // Deve mostrar: A B C D E 

        // Remover elementos da fila
        System.out.println("Remove: " + fila.remove()); // Deve mostrar: Remove: A

        fila.add("F"); // Adicionar um novo elemento após remover
        System.out.println("Remove: " + fila.remove()); // Deve mostrar: Remove: B

        fila.add("G"); // Adicionar mais um elemento
        System.out.println("Elemento no início: " + fila.peek()); // Deve mostrar: Elemento no início: C
        System.out.println("Tamanho da fila: " + fila.size()); // Deve mostrar: Tamanho da fila: 5

        fila.clear();
        System.out.println("Tamanho da fila após limpar: " + fila.size()); // Deve mostrar: Tamanho da fila após limpar: 0
    }
}

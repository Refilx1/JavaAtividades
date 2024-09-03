package listaduplamente;
public class Main {
    public static void main(String[] args) {
        listaduplamente<Integer> lista = new listaduplamente<>();


        lista.add(10);  
        lista.add(20); 
        lista.add(30); 
        System.out.println("Lista após adicionar 10, 20, 30: ");
        imprimirLista(lista);


        lista.add(1, 15);
        System.out.println("Lista após adicionar 15 na posição 1: ");
        imprimirLista(lista);

        lista.remove(2);
        System.out.println("Lista após remover o elemento na posição 2 (20): ");
        imprimirLista(lista);


        System.out.println("Elemento na posição 0: " + lista.get(0)); 
        System.out.println("Elemento na posição 1: " + lista.get(1)); 
        System.out.println("Elemento na posição 2: " + lista.get(2)); 


        System.out.println("Tamanho da lista: " + lista.getSize()); 

        int posicao = lista.find(15);
        System.out.println("Posição do elemento 15: " + posicao); 

        lista.set(1, 25);
        System.out.println("Novo valor na posição 1: " + lista.get(1)); 

        System.out.println("A lista está vazia? " + lista.isEmpty());

        lista.remove(0);
        System.out.println("Lista após remover o primeiro elemento: ");
        imprimirLista(lista);

        lista.remove(0);
        lista.remove(0);
        System.out.println("A lista está vazia agora? " + lista.isEmpty());
    }

    private static void imprimirLista(listaduplamente<Integer> lista) {
        for (int i = 0; i < lista.getSize(); i++) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
    }
}
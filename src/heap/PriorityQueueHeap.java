package Heap;
import java.util.ArrayList;

public class PriorityQueueHeap {

    private ArrayList<Paciente> heap;

    public PriorityQueueHeap() {
        heap = new ArrayList<>();
    }

    /**
     * ENQUEUE usando SOBE HEAP
     */
    public void enqueue(Paciente paciente) {

        heap.add(paciente);

        int index = heap.size() - 1;

        sobeHeap(index);
    }

    /**
     * DEQUEUE usando DESCE HEAP
     */
    public Paciente dequeue() {

        if (heap.isEmpty()) {
            return null;
        }

        Paciente raiz = heap.get(0);

        Paciente ultimo = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {
            heap.set(0, ultimo);
            desceHeap(0);
        }

        return raiz;
    }

    private void sobeHeap(int index) {

        while (index > 0) {

            int pai = (index - 1) / 2;

            if (heap.get(index).temMaiorPrioridade(heap.get(pai))) {

                trocar(index, pai);

                index = pai;

            } else {
                break;
            }
        }
    }

    private void desceHeap(int index) {

        int tamanho = heap.size();

        while (true) {

            int esquerda = 2 * index + 1;
            int direita = 2 * index + 2;

            int maior = index;

            if (esquerda < tamanho &&
                    heap.get(esquerda).temMaiorPrioridade(heap.get(maior))) {

                maior = esquerda;
            }

            if (direita < tamanho &&
                    heap.get(direita).temMaiorPrioridade(heap.get(maior))) {

                maior = direita;
            }

            if (maior != index) {

                trocar(index, maior);

                index = maior;

            } else {
                break;
            }
        }
    }

    private void trocar(int i, int j) {

        Paciente temp = heap.get(i);

        heap.set(i, heap.get(j));

        heap.set(j, temp);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public void printHeap() {

        System.out.println("Estado atual do Heap:");

        for (Paciente paciente : heap) {
            System.out.println(paciente);
        }

        System.out.println("----------------------------------");
    }
}
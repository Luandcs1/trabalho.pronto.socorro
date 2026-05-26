import java.util.PriorityQueue;
import java.util.Queue;

import Heap.PriorityQueueHeap;
import entidades.Paciente;

public class Main {

    public static void main(String[] args) {

        PriorityQueueHeap fila = new PriorityQueueHeap();

        Paciente p1 = new Paciente("Carlos", 2, 45, false);
        Paciente p2 = new Paciente("Maria", 5, 5, false);
        Paciente p3 = new Paciente("João", 3, 20, false);
        Paciente p4 = new Paciente("Beatriz", 3, 35, true);
        Paciente p5 = new Paciente("Pedro", 5, 2, false);
        Paciente p6 = new Paciente("Helena", 2, 45, true);

        System.out.println("Inserindo pacientes...\n");

        fila.enqueue(p1);
        fila.printHeap();

        fila.enqueue(p2);
        fila.printHeap();

        fila.enqueue(p3);
        fila.printHeap();

        fila.enqueue(p4);
        fila.printHeap();

        fila.enqueue(p5);
        fila.printHeap();

        fila.enqueue(p6);
        fila.printHeap();

        System.out.println("\nORDEM DE ATENDIMENTO:\n");

        while (!fila.isEmpty()) {

            Paciente atendido = fila.dequeue();

            System.out.println(atendido);
        }
    }
}
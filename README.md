# Fila de Prioridade Heap

## Compilar

javac -d src/entidades/Paciente.java src/heap/PriorityQueueHeap.java src/Main.java

## Executar

```bash
java -cp out Main
```

## Gerar Javadoc

javadoc -d docs -sourcepath src entidades heap Main.java

Abrir a documentação: `doc/index.html`

## Descrição

Projeto desenvolvido para a disciplina de Estrutura de Dados da UNIVALI.

O sistema simula uma fila de prioridade hospitalar utilizando Heap Binário, onde pacientes são atendidos conforme:

1. Nível de urgência
2. Tempo de espera
3. Grupo vulnerável

## Tecnologias

- Java
- Heap Binário
- Priority Queue

## Requisitos

- Java 17+

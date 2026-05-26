# Fila de Prioridade Heap

## Compilar

```bash
javac -d out src/entidades/Pessoa.java src/estatica/FilaEstatica.java src/estatica/FilaComPrioridade.java src/heap/FilaComPrioridadeHeap.java src/Main.java
```

## Executar

```bash
java -cp out Main
```

## Gerar Javadoc

```bash
javadoc -d doc -sourcepath src -subpackages estatica:heap:entidades
```

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
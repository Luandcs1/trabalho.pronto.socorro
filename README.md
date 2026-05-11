# Fila de Prioridade

Implementações de fila com prioridade em Java, evoluindo de **array ordenado** para **heap binário**.

| Estrutura | `enfileirar` | `desenfileirar` |
|---|---|---|
| Array ordenado (`estatica/`) | O(n) | O(1) |
| Heap binário (`heap/`) | O(log n) | O(log n) |

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

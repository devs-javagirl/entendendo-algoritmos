## Capítulo 3 - Recursão

### Perguntas e Respostas

**3.1**  
Quais informações você pode retirar baseando-se apenas na pilha de chamada?

**Resposta:**
- A função `sauda` é chamada primeiro, com `nome = maggie`.
- A função `sauda` chama `sauda2`, também com `nome = maggie`.
- A função `greet` ainda está incompleta (suspensa).
- A função atualmente em execução é `sauda2`.
- Após `sauda2` terminar, a execução da função `sauda` será retomada.

**3.2**  
O que acontece se uma função recursiva entra em loop infinito?

**Resposta:**  
A pilha de chamadas vai crescendo indefinidamente. Cada programa tem um limite de memória na pilha. Se esse limite for ultrapassado, ocorre um erro chamado "stack overflow" (estouro de pilha), finalizando o programa com falha.

---

### Resumo

Este capítulo explica o conceito de **recursão**, que é quando uma função chama a si mesma para resolver um problema menor. É comum em algoritmos como cálculo de fatorial, Fibonacci e busca em árvores.

## Capítulo 2 - Listas Encadeadas, Arrays e Estrutura Híbrida

### Perguntas e Respostas

**2.1**  
Você tem um monte de inserções e poucas leituras.  
**Resposta:** Neste caso, uma **lista encadeada** é mais eficiente. Inserções são rápidas e, como a leitura ocorre apenas no final do mês, a performance de leitura é aceitável. A lista encadeada também oferece uma boa velocidade de leitura ao percorrer toda a lista.

**2.2**  
Seu app recebe pedidos dos garçons e os chefs retiram pela ordem.  
**Resposta:** **Lista encadeada**, pois há muitas inserções no final e remoções no início. Arrays não são eficientes nesse caso.

**2.3**  
O Facebook usa busca binária em uma lista de nomes ordenados.  
**Resposta:** Um **array ordenado**, pois oferece acesso aleatório eficiente, necessário para a busca binária.

**2.4**  
Inserções em um array usado com busca binária.  
**Resposta:** Inserções são **lentas**, pois é necessário manter o array ordenado. A cada nova inserção, o array deve ser reordenado ou posicionado corretamente, o que exige deslocamento dos elementos.

**2.5**  
Estrutura híbrida: array com listas encadeadas.  
**Resposta:** Para **buscas**, é mais rápido que listas e mais lento que arrays. Para **inserções**, é mais rápido que ambos. Essa estrutura equilibra desempenho para diferentes operações
# Capítulo 01 - Introdução a Algoritmos

Neste capítulo, aprendemos o que é um algoritmo e implementamos a **pesquisa binária**, um algoritmo muito mais rápido que a busca simples quando a lista está ordenada.

---

## Pesquisa Binária em Java

Veja o código no arquivo [`PesquisaBinaria.java`](./PesquisaBinaria.java)

---

## Perguntas do Capítulo 1

**1.1** Suponha que você tenha uma lista com 128 nomes e esteja fazendo uma pesquisa binária. Qual é o número máximo de etapas pelas quais você passaria para encontrar o nome desejado?  
**Resposta:** 7

**1.2** Suponha que você duplique o tamanho da lista. Qual é o número máximo de etapas agora?  
**Resposta:** 8

**1.3** Você tem um nome e deseja encontrar o número de telefone para esse nome em uma agenda telefônica.  
**Resposta:** O(log n)

**1.4** Você tem um número de telefone e deseja encontrar o dono dele em uma agenda telefônica. (Dica: você tem de procurar pela agenda inteira!)  
**Resposta:** O(n)

**1.5** Você deseja ler o número de cada pessoa da agenda telefônica.  
**Resposta:** O(n)

**1.6** Você deseja ler os números apenas dos nomes que começam com A.  
**Resposta:** O(n). Você pode pensar: “Só estou fazendo isso para 1 dentre 26 caracteres, portanto o tempo de execução deve ser O(n/26).” Uma regra simples é a de ignorar números que são somados, subtraídos, multiplicados ou divididos. O(n + 26), O(n - 26), O(n * 26), O(n / 26) → são todos O(n).

---

## Recapitulando

- A pesquisa binária é muito mais rápida do que a pesquisa simples.
- O(log n) é mais rápido do que O(n), e O(log n) fica ainda mais rápido conforme os elementos da lista aumentam.
- A rapidez de um algoritmo **não é medida em segundos**.
- O tempo de execução de um algoritmo é medido por meio de seu **crescimento**.
- O tempo de execução dos algoritmos é expresso na **notação Big O**.

---

## Como rodar o código

Abra o terminal dentro da pasta `capitulo01/` e digite:

```bash
javac PesquisaBinaria.java
java PesquisaBinaria

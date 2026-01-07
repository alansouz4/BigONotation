# BigONotation
Exemplificando complexidade de espaço e tempo de cada notação conforme sua entrada..

## Constante 
- Acessa diretamente um elemento específico da lista.
Resumo: operações de acesso direto em listas/arrays são constantes, pois não dependem do tamanho da lista.

Complexidade:
- Tempo: O(n)

## Linear
- Percorre todos os elementos da lista e imprime cada um.
- No segundo exemplo, concatena uma string para cada elemento e adiciona em uma nova lista.
Resumo: cada elemento precisa ser visitado uma vez -> cresce proporcionalmente ao tamanho da lista.

Complexidade:
- Tempo: O(n)
- Espaço: O(n) (porque cria uma nova lista com os elementos transformados)

## Quadrática
- Procura dois números em um array que somados resultem em um alvo (target).
- Usa dois loops aninhados: o primeiro percorre todos os elementos, e o segundo compara cada par.
Resumo: cada elemento é comparado com todos os outros → número de operações cresce quadraticamente.

Complexidade:
- Tempo: O(n²)

## Binária
- O array precisa estar ordenado.
- A cada passo, o algoritmo divide o espaço de busca pela metade.
- Se o elemento do meio não for o alvo, descarta metade da lista.
- Isso reduz drasticamente o número de comparações.

Complexidade:
- Tempo: O(log n) → porque a cada iteração o espaço de busca é dividido por 2.
- Espaço: O(1) → não cria estruturas adicionais


### * Tecnologias
- Java 25

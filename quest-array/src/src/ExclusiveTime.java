package src;

import java.util.*;

public class ExclusiveTime {
    public int[] exclusiveTime(int n, List<String> logs) {
//
//         "0:start:0","1:start:2","1:end:5","0:end:6"
//        "0:start:0","0:start:2","0:end:5","0:start:6","0:end:6","0:end:7"
//        2 - 0 = 2 [0, 2]
//        5 - 2 = 3 [1, 3]
//      Macho, **o `else if` que você adicionou na linha 21 nunca é executado**. Rodei e continua `[2, 1]`.
//
//        Sua estrutura ficou assim:
//
//```
//        if (tiposDiferentes) {
//    ...
//        } else if (idsDiferentes) {
//    ...
//        } else if (idsDiferentes && tiposDiferentes) {
//    ...
//        }
//```
//
//        Para chegar ao terceiro bloco, os dois primeiros precisam ser falsos. Mas o terceiro exige justamente que as duas condições sejam verdadeiras. **Ele nunca tem oportunidade de entrar.**
//
//                No último log, `"0:end:6"`:
//
//        1. O anterior é `"1:end:5"`.
//        2. Os tipos são iguais: `"end"` e `"end"`. Pula o primeiro bloco.
//        3. A condição da linha 19 é verdadeira. Entra no segundo.
//        4. A linha 20 faz `result[1] = 6 - 5`, substituindo o `4` por `1`.
//        5. Nenhum outro `else if` é avaliado.
//
//        Adicionar outra condição no final não muda esse caminho.
//
//**O próximo ajuste é substituir essa comparação com o log anterior por dois blocos baseados no evento atual:**
//
//```
//        if (Objects.equals(i.split(":")[1], "start")) {
//            // Contabilizar o intervalo de quem estava no topo.
//            // Empilhar a função que começou.
//        } else {
//            // Contabilizar o intervalo da função que terminou.
//            // Retirar essa função da pilha.
//        }
//```
//
//        Faça primeiro essa estrutura, sem tentar encaixar mais um `else if`. A pilha precisa representar as chamadas ainda abertas; por isso, o `push()` da linha 25 também precisa ficar dentro do bloco `"start"`.

        Deque<String> idFila = new ArrayDeque<>();
        int[] result = new int[n];
        String anterior = logs.getFirst();

        for (String i : logs){
            if (!Objects.equals(i.split(":")[1], anterior.split(":")[1])){
                result[Integer.parseInt(anterior.split(":")[0])] = (Integer.parseInt(i.split(":")[2]) - Integer.parseInt(idFila.pop().split(":")[2])) + 1;
            } else if (i.split(":")[0] != anterior.split(":")[0]){
                result[Integer.parseInt(i.split(":")[0])] += Integer.parseInt(i.split(":")[2]) - Integer.parseInt(anterior.split(":")[2]);
            }

            idFila.push(i);
            anterior = i;
        }

        System.out.println(Arrays.toString(result));
        return new int[]{1,2};
    }
}

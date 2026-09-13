import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        // Indices do array -> A = 0 | B= 1 | N = 2 | K = 3
        int num;
        int seedA = scanner.nextInt();
        int seedB = scanner.nextInt();
        int quantidadeN = scanner.nextInt();
        int limiteK = scanner.nextInt();
        int menorMaximoGlobal = Integer.MAX_VALUE;
        int melhorSeed = seedA;

        for (int seedAtual = seedA; seedAtual <= seedB; seedAtual++ ){
            Random random = new Random(seedAtual);

            int maiorDaSeed = -1;
            for (int j = 0; j < quantidadeN; j++){
                num = random.nextInt(limiteK);
                if (num > maiorDaSeed){
                    maiorDaSeed = num;
                }
            }
            if (maiorDaSeed < menorMaximoGlobal){
                menorMaximoGlobal = maiorDaSeed;
                melhorSeed = seedAtual;
            }
        }
        System.out.println(melhorSeed);
        System.out.println(menorMaximoGlobal);
    }
}
 /*
        Achar a seed entre A e B que produz uma quantidade N de numeros pseudorandom from 0(inclusivo) até K (exclusivo)
        0 é o minimo K é o maximo dos valores
        Serão gerados números baseados na quantidade de numeros gerados pedido N
        As seeds serão um número entre A e B ambos inclusivos
         */
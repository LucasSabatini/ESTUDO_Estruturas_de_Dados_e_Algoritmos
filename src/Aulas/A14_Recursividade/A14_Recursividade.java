package Aulas.A14_Recursividade;

import java.util.Arrays;

public class A14_Recursividade {
    public static void main(String[] args) {

        int[] vetor = new int[5];

        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        System.out.println("Vetor: " + Arrays.toString(vetor));

        System.out.println(somar(0, 0, vetor));

    }

    private static int somar(int soma, int posicao, int[] vetor) {
        if(posicao < vetor.length) {
            soma = soma + vetor[posicao];
            return somar(soma, posicao + 1, vetor);
        } else {
            return soma;
        }
    }

}

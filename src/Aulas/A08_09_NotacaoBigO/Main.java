package Aulas.A08_09_NotacaoBigO;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[8];

        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 10);
        }

        System.out.println(Arrays.toString(vetor));

        System.out.println("Qual número será buscado?:");
        Scanner sc = new Scanner(System.in);
        int buscado = sc.nextInt();

        boolean achou = false;

        //Complexidade = O(n) -> 1n está para 1 passo a ser executado
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] == buscado) {
                achou = true;
                break;
            }
        }
        if(achou) {
            System.out.println("Achou");
        } else {
            System.out.println("Não achou");
        }

    }
}

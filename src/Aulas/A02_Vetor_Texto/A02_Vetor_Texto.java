package Aulas.A02_Vetor_Texto;

import java.util.Scanner;

public class A02_Vetor_Texto {

    public static void main(String[] args) {
        String[] estados = new String[10];
        estados[0] = "AC";
        estados[1] = "BA";
        estados[2] = "CE";
        estados[3] = "DF";
        estados[4] = "AM";
        estados[5] = "AP";
        estados[6] = "PB";
        estados[7] = "RN";
        estados[8] = "MS";
        estados[9] = "SP";

        for(int i = 0; i < estados.length; i++) {
            System.out.printf("Estado %s, posição %d\n", estados[i], i);
        }

        //Busca Linear
        boolean encontrou = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual estado?: ");
        String busca = sc.nextLine();

        for(int i = 0; i < estados.length;i++) {
            if (busca.equalsIgnoreCase(estados[i])) {
                encontrou = true;
                break;
            }
        }

        if(encontrou) {
            System.out.println("Encontrado!");
        } else {
            System.out.println("Não encontrado!");
        }

    }
}

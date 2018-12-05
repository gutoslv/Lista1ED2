package com.exercicios;

/* Feito por

Augusto Cesar da Silva - Prontuário: 1620011
Victor Moraes Cardoso - Prontuário: 1620436

*/

import java.util.Scanner;

public class Numero1 extends SortsBasicos {
  public static void main(String[] args) {
    int i;
    int[] salarios = new int[5];
    String[] nomes = new String[5];

    Scanner scan = new Scanner(System.in);

    for (i = 0; i < salarios.length; i++) {
      System.out.println("Informe o nome do funcionario: ");
      nomes[i] = scan.next();
      System.out.println("Infome o salario do funcionario: ");
      salarios[i] = scan.nextInt();
    }

    bubbleCresc(nomes, salarios);
    System.out.println("\n\n\n");
    bubbleDesc(nomes, salarios);
    System.out.println("\n\n\n");
    bubbleAlf(nomes, salarios);
  }
}

package com.exercicios;

/* Feito por

Augusto Cesar da Silva - Prontuário: 1620011
Victor Moraes Cardoso - Prontuário: 1620436

*/

import java.util.Scanner;

public class Numero2 extends SortsBasicos {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i;
    int[] numeros = new int[10];

    for (i = 0; i < numeros.length; i++) {
      System.out.println("Informe o valor da posicao " + i);
      numeros[i] = scan.nextInt();
    }

    contMaiorMenor(numeros);
  }

}

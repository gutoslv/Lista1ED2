package com.exercicios;

import java.util.Scanner;

class SortsBasicos {
  static void bubbleCresc(String[] nomes, int[] salarios) {
    int i =0 , j, aux;
    boolean troca = true;
    String temp;

    while (i < nomes.length && troca) {
      troca = false;
      for (j = 0; j < (nomes.length - 1); j++) {
        if (salarios[j] > salarios[j + 1]) {
          troca = true;
          aux = salarios[j];
          salarios[j] = salarios[j + 1];
          salarios[j + 1] = aux;

          temp = nomes[j];
          nomes[j] = nomes[j + 1];
          nomes[j + 1] = temp;
        }
      }
      i++;
    }

    System.out.println("Crescente: ");
    for (i = 0; i < nomes.length; i++) {
      System.out.println("Func: " + nomes[i]);
      System.out.println("Salario: " + salarios[i]);
    }
  }

  static void bubbleDesc(String[] nomes, int[] salarios) {
    int i = 0, j, aux;
    boolean troca = true;
    String temp;

    while (i < nomes.length && troca) {
      troca = false;

      for (j = 0; j < (nomes.length - 1); j++) {
        if (salarios[j] < salarios[j + 1]) {
          troca = true;
          aux = salarios[j];
          salarios[j] = salarios[j + 1];
          salarios[j + 1] = aux;

          temp = nomes[j];
          nomes[j] = nomes[j + 1];
          nomes[j + 1] = temp;
        }
      }
      i++;
    }

    System.out.println("Decrescente: ");
    for (i = 0; i < nomes.length; i++) {
      System.out.println("Func: " + nomes[i]);
      System.out.println("Salario: " + salarios[i]);
    }
  }

  static void bubbleAlf(String[] nomes, int[] salarios) {
    int i = 0, j, aux;
    boolean troca = true;
    String temp; //Holds the  actual name(nomes[j) during the position change (same use as aux, but for name position)

    while (i < nomes.length && troca) {
      troca = false;

      for (j = 0; j < (nomes.length - 1); j++) {
        int comparacao = nomes[j].compareTo(nomes[j + 1]);

        if (comparacao > 0) {
          troca = true;

          temp = nomes[j];
          nomes[j] = nomes[j + 1];
          nomes[j + 1] = temp;

          aux = salarios[j];
          salarios[j] = salarios[j + 1];
          salarios[j + 1] = aux;
        }
        i++;
      }
    }

    System.out.println("Alfabestica");
    for (i = 0; i < nomes.length; i++) {
      System.out.println("Func: " + nomes[i]);
      System.out.println("Salario: " + salarios[i]);
    }
  }
}

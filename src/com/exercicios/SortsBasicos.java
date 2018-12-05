package com.exercicios;

import java.util.Scanner;

class SortsBasicos {
  //Inicio Numero 1
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
  }//fim Numero 1

  //inicio Numero 2
  static void contMaiorMenor(int[] numeros) {
    int i, posmaior, posmenor, quantmaior = 0, quantmenor = 0;

    int maior = numeros[1], menor = numeros[1], eleito = numeros[0];

    for (i = 2; i < (numeros.length - 1); i++) {
      if (numeros[i] > maior) {
        maior = numeros[i];
        posmaior = i;
      }

      if (numeros[i] < menor) {
        menor = numeros[i];
        posmenor = i;
      }
    }

    if (eleito > maior) {
      maior = eleito;
    }

    if (eleito < menor) {
      menor = eleito;
    }

    for (i = 0; i < numeros.length; i++) {
      if (numeros[i] == maior) {
        quantmaior++;
      }
      if (numeros[i] == menor){
        quantmenor++;
      }
    }

    System.out.println("Maior numero: " + maior + ", que aparece " + quantmaior + " vezes");
    System.out.println("Menor numero: " + menor + ", que aparece " + quantmenor + " vezes");
  }//fim do Numero 2

  //inicio do numero 3
  static void ordenarTudo(int[] codigo, String[] descricao, float[] preco) {
    int i = 0, j, k, auxcod;
    boolean troca = true;
    String auxdesc;
    float auxpreco;

    while (i < codigo.length && troca) {
      troca = false;

      for (j = 0; j < (codigo.length - 1); j++) {
        if (codigo[j] > codigo[j + 1]) {
          troca = true;
          auxcod = codigo[j];
          codigo[j] = codigo[j + 1];
          codigo[j + 1] = auxcod;

          auxdesc = descricao[j];
          descricao[j] = descricao[j + 1];
          descricao[j + 1] = auxdesc;

          auxpreco = preco[j];
          preco[j] = preco[j + 1];
          preco[j + 1] = auxpreco;
        }
      }
      i++;
    }
    System.out.println("Ordenado por codigo: ");
    for (k = 0; k < codigo.length; k++) {
      System.out.println(" " + codigo[k] + " " + descricao[k] + " " + preco [k]);
    }
  }

  static void buscaBin(int codigoprod, int[] codigo, String[] descricao, float[] preco) {
    int meio, posencontrado = -1, inicio = 0, fim = (codigo.length - 1), cont = 0;
    while (inicio <= fim) {
      meio = (inicio + fim) / 2;
      if (codigoprod == codigo[meio]) {
        posencontrado = meio;
      }
      if (codigoprod < codigo[meio]) {
        fim = meio - 1;
      } else {
        inicio = meio + 1;
      }
      cont++;
    }

    if (posencontrado > -1) {
      System.out.println("Busca Binaria encontrou o codigo com as informacoes: " + codigo[posencontrado] + " "  + descricao[posencontrado] + " " + preco[posencontrado]);
      System.out.println("Busca Binaria foi executada: " + cont + " vezes");
    } else {
      System.out.println("Codigo nao encontrado");
    }

  }

  static void buscaSeq(int codigoprod, int[] codigo, String[] descricao, float[] preco) {
    int indice = -1, cont = 0;
    for (int i = 0; i < codigo.length; i++) {
      if (codigo[i] == codigoprod) {
        cont++;
        indice = i;
        break;
      }
    }
    if (indice < 0) {
      System.out.println("Codigo nao encontrado");
    } else {
      System.out.println("Busca Sequencial encontrou o codigo com as informacoes: " + codigo[indice] + descricao[indice] + preco[indice]);
      System.out.println("Busca sequencial foi executada " + cont + "vezes ");
    }
  } // fim exercicio 3
}

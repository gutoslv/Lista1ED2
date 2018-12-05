package com.exercicios;

import java.util.Scanner;

class SortsBasicos {
  //Inicio Numero 1
  static void bubbleCresc(String[] nomes, int[] salarios) {
    int i = 0, j, aux;
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
      if (numeros[i] == menor) {
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
      System.out.println(" " + codigo[k] + " " + descricao[k] + " " + preco[k]);
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
      System.out.println("Busca Binaria encontrou o codigo com as informacoes: " + codigo[posencontrado] + " " + descricao[posencontrado] + " " + preco[posencontrado]);
      System.out.println("Busca Binaria foi executada: " + cont + " vezes");
    } else {
      System.out.println("Codigo nao encontrado");
    }

  }

  static void buscaSeq(int codigoprod, int[] codigo, String[] descricao, float[] preco) {
    int index = -1, cont = 0;
    for (int i = 0; i < codigo.length; i++) {
      if (codigo[i] == codigoprod) {
        cont++;
        index = i;
        break;
      }
    }
    if (index < 0) {
      System.out.println("Codigo nao encontrado");
    } else {
      System.out.println("Busca Sequencial encontrou o codigo com as informacoes: " + codigo[index] + descricao[index] + preco[index]);
      System.out.println("Busca sequencial foi executada " + cont + "vezes ");
    }
  } // fim exercicio 3

  //inicio Exercicio 4
  static void ordenaMedia(float[] media, String[] nome) {
    int i = 0, j;
    boolean troca = true;
    String auxnome;
    float auxmed;

    while (i < media.length && troca) {
      troca = false;

      for (j = 0; j < (media.length - 1); j++) {
        if (media[j] > media[j + 1]) {
          troca = true;
          auxmed = media[j];
          media[j] = media[j + 1];
          media[j + 1] = auxmed;

          auxnome = nome[j];
          nome[j] = nome[j + 1];
          nome[j + 1] = auxnome;
        }
      }
      i++;
    }
    System.out.println("Ordenado por media:");
    for (i = 0; i < media.length; i++) {
      System.out.println("Nome: " + nome[i] + " Media: " + media[i]);
    }
  }

  static void ordernaNota1(float[] nota1, String[] nome) {
    int i = 0, j;
    boolean troca = true;
    String auxnome;
    float auxnota;

    while (i < nota1.length && troca) {
      troca = false;

      for (j = 0; j < (nota1.length - 1); j++) {
        if (nota1[j] > nota1[j + 1]) {
          troca = true;
          auxnota = nota1[j];
          nota1[j] = nota1[j + 1];
          nota1[j + 1] = auxnota;

          auxnome = nome[j];
          nome[j] = nome[j + 1];
          nome[j + 1] = auxnome;
        }
      }
      i++;
    }

    System.out.println("Ordenado por Nota 1: ");
    for (i = 0; i < nota1.length; i++) {
      System.out.println("Nome: " + nome[i] + " Nota: " + nota1[i]);
    }
  }

  static void reprovadoAlfabetica(String[] nome) {
    int i = 0, j;
    boolean troca = true;
    String auxnome;

    while (i < nome.length && troca) {
      for (j = 0; j < 3 - 1; j++) {
        int compara = nome[j].compareTo(nome[j + 1]);

        if (compara > 0) {
          troca = false;

          auxnome = nome[j];
          nome[j] = nome[j + 1];
          nome[j + 1] = auxnome;
        }
      }
      i++;
    }
    System.out.println("Ordem alfabetica: ");
    for (i = 0; i < nome.length; i++) {
      System.out.println("Aluno: " + nome[i]);
    }
  }
  // fim exercicio 4

  //inicio exercicio 5

  static void ordernaFinalmente(int[] nums) {
    int i = 0, j, aux;
    boolean troca = true;

    while (i < nums.length && troca) {
      troca = false;

      for (j = 0; j < (nums.length - 1); j++) {
        if (nums[j] > nums[j + 1]) {
          troca = true;
          aux = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = aux;
        }
      }
      i++;
    }
    System.out.println("Ordenado:");
    for (i = 0; i < nums.length; i++) {
      System.out.println(" " + nums[i]);
    }
  }

  static void binaria5(int numdesejado, int[] nums) {
    int inicio = 0, fim = (nums.length - 1), meio, posencontrado = -1;
    String par = "par";

    while (inicio <= fim) {
      meio = (inicio + fim) / 2;
      if (posencontrado == nums[meio]) {
        posencontrado = meio;
      }
      if (posencontrado < nums[meio]) {
        fim = meio - 1;
      } else {
        inicio = meio + 1;
      }
    }
    if (posencontrado % 2 != 0) {
      par = "impar";
    }

    if (posencontrado < 0) {
      System.out.println("Numero nao esta na lista");
    } else {
      System.out.println("Busca binaria encotrou o numero na posicao: " + posencontrado + " e o numero e': " + par);
    }
  }

  static void sequencial5(int numdesejado, int[] nums) {
    int index = -1;
    String par = "par";

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == numdesejado) {
        index = i;
      }
    }
    if (index % 2 != 0) {
      par = "impar";

      if (index == -1) {
        System.out.println("Numero nao esta na lista");
      } else {
        System.out.println("Busca sequencial encontro o numero na posicao: " + index + " e o numero e' " + par);
      }
    }
  }// fim do exercicio 5
}
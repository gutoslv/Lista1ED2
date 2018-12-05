package com.exercicios;

/* Feito por

Augusto Cesar da Silva - Prontuário: 1620011
Victor Moraes Cardoso - Prontuário: 1620436

*/

import java.util.Scanner;

public class Numero4 extends SortsBasicos {
  public static void main(String[] args) {


    String[] nome = new String[8], reprovado = new String[8];
    float[] nota1 = new float[8], nota2 = new float[8], media = new float[8];

    Scanner scan = new Scanner(System.in);

    for (int i = 0; i < nome.length; i++) {
      System.out.println("Informe o nome da posicao " + i);
      nome[i] = scan.next();

      System.out.println("Informe a nota 1 da posicao " + i);
      nota1[i] = scan.nextFloat();

      System.out.println("Informe a nota 2 da posicao " + i);
      nota2[i] = scan.nextFloat();

      media[i] = ((nota1[i]*2) + (nota2[i]*3))/2;
    }

    for (int j = 0; j < reprovado.length - 1; j++) {
      if (media[j] < 7) {
        reprovado[j] = nome[j];
      }
    }
    ordenaMedia(media, nome);
    ordernaNota1(nota1, nome);
    reprovadoAlfabetica(nome);
  }
}
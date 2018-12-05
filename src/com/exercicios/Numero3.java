package com.exercicios;

import java.util.Scanner;

public class Numero3 extends SortsBasicos {
  public static void main(String[] args) {
    int i, codigoprod;
    int[] codigo = new int[12];
    String[] descricao = new String[12];
    float[] preco = new float[12];

    Scanner scan = new Scanner(System.in);

    for (i = 0; i < codigo.length; i++) {
      System.out.println("Informe o codigo da posicao " + i);
      codigo[i] = scan.nextInt();
      System.out.println("Informe a descricao da posicao " + i);
      descricao[i] = scan.next();
      System.out.println("Informe o preco da posicao " + i);
      preco[i] = scan.nextFloat();
    }

    ordenarTudo(codigo, descricao, preco);

    System.out.println("Informe o codigo do produto a ser procurado: ");
    codigoprod = scan.nextInt();

    buscaSeq(codigoprod, codigo, descricao, preco);
    buscaBin(codigoprod, codigo, descricao, preco);
  }
}

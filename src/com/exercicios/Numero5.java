package com.exercicios;

import java.util.Scanner;

public class Numero5 extends SortsBasicos {
  public static void main(String[] args) {
    int[] nums = new int[15];
    int numdesejado;

    Scanner scan = new Scanner(System.in);

    for (int i = 0; i < nums.length; i++) {
      System.out.println("Insira o numero da posicao " + i);
      nums[i] = scan.nextInt();
    }
    ordernaFinalmente(nums);

    System.out.println("Digite o numero desejado");
    numdesejado = scan.nextInt();
    binaria5(numdesejado, nums);
    sequencial5(numdesejado, nums);
  }
}

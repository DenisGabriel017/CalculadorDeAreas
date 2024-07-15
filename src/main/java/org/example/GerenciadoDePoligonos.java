package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GerenciadoDePoligonos {
    private ArrayList<Poligono> poligonos = new ArrayList<>();

    public void executar() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Informe o número de lados do polígono (3 para triângulo, 4 para quadrado, 0 para calcular áreas): ");
                int lados = scanner.nextInt();
                if (lados == 0) {
                    break;
                }
                if (lados != 3 && lados != 4) {
                    System.out.println("Número de lados inválido. Apenas triângulos (3 lados) e quadrados (4 lados) são suportados.");
                    continue;
                }

                System.out.print("Informe o tamanho do lado do polígono (em cm): ");
                double tamanhoLado = scanner.nextDouble();
                if (tamanhoLado <= 0) {
                    System.out.println("Tamanho do lado inválido. Deve ser maior que zero.");
                    continue;
                }

                poligonos.add(new Poligono(lados, tamanhoLado));
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // Limpa a entrada inválida
            }
        }

        calcularEExibirAreas();
    }

    private void calcularEExibirAreas() {
        double areaTotal = 0;
        for (Poligono poligono : poligonos) {
            System.out.println(poligono);
            areaTotal += poligono.calcularArea();
        }

        System.out.println("\nÁrea total " + String.format("%.2f", areaTotal) + " cm²");
    }
}

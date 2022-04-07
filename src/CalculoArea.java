/*Exercícios para treino, dados no curso "Entendendo Métodos Java" na plataforma DIO (Digital Innovation One).
Crie uma aplicação que calcula a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio.
OBS: use sobrecarga. */

//area quadrado: lado x lado ou lado^2
//area retangulo: base x altura
//area trapezio: (soma das bases x altura)/2

import java.util.Scanner;

public class CalculoArea {


    public static void Calculo() {
        Scanner ler = new Scanner(System.in);
        int opcao;
        double area;

        System.out.println("Selecione qual quadrilátero deseja calcular a Área: " +
                "\n1 - Quadrado" +
                "\n2 - Retângulo" +
                "\n3 - Trapézio");
        opcao = ler.nextInt();

        for (int i = 0; i != 1; ) {
            if (opcao == 1) {
                System.out.println("Quadrilátero escolhido: Quadrado");
                i = 1;
            } else if (opcao == 2) {
                System.out.println("Quadrilátero escolhido: Retângulo");
                i = 1;
            } else if (opcao == 3) {
                System.out.println("Quadrilátero escolhido: Trapézio");
                i = 1;
            } else {
                System.out.println("Opção inválida. Escolha entre 1 a 3");
                opcao = ler.nextInt();
            }
        }

        if (opcao == 1) {
            double lado;
            System.out.println("Digite o tamanho do lado");
            lado = ler.nextDouble();
            area = Area(lado);
            System.out.println("Área do Quadrado: " + area);
        }
        if (opcao == 2) {
            double base;
            double altura;
            System.out.println("Digite o tamanho da base");
            base = ler.nextDouble();
            System.out.println("Digite a altura");
            altura = ler.nextDouble();
            area = Area(base, altura);
            System.out.println("Área do Retângulo: " + area);
        }
        if (opcao == 3) {
            double baseMaior;
            double baseMenor;
            double altura;
            System.out.println("Digite o tamanho da base maior");
            baseMaior = ler.nextDouble();
            System.out.println("Digite o tamanho da base menor");
            baseMenor = ler.nextDouble();
            System.out.println("Digite a altura");
            altura = ler.nextDouble();
            area = Area(baseMaior, baseMenor, altura);
            System.out.println("Área do Trapézio: " + area);
        }

    }

    public static double Area(double lado){
        //Area Quadrado
        double area;
        area = lado * lado;
        return area;
    }
    public static double Area(double base, double altura){
        //Area Retângulo
        double area;
        area = base * altura;
        return area;
    }
    public static double Area(double baseMaior, double baseMenor, double altura){
        //Area Trapézio
        double area;
        area = ((baseMaior + baseMenor) * altura)/2;
        return area;
    }

}

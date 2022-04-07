/*Exercícios para treino, dados no curso "Entendendo Métodos Java" na plataforma DIO (Digital Innovation One).
Calcule as quatro operações básicas: soma, subtração, multiplicação e divisão. Sempre dois valores devem ser passados;
*/

import java.util.Scanner;

public class Calculadora {
    public static void Calcular() {
        Scanner ler = new Scanner(System.in);
        int opcao;
        double valor1;
        double valor2;
        double resultado;

        System.out.println("Escolha a operação que deseja realizar:" +
                "\n1 - Soma" +
                "\n2 - Subtração" +
                "\n3 - Multiplicação" +
                "\n4 - Divisão");
        opcao = ler.nextInt();

        for (int i = 0; i != 1; ) {
            if (opcao == 1) {
                System.out.println("Operação escolhida: SOMA");
                i = 1;
            } else if (opcao == 2) {
                System.out.println("Operação escolhida: SUBTRAÇÃO");
                i = 1;
            } else if (opcao == 3) {
                System.out.println("Operação escolhida: MULTIPLICAÇÃO");
                i = 1;
            } else if (opcao == 4) {
                System.out.println("Operação escolhida: DIVISÃO");
                i = 1;
            } else {
                System.out.println("Opção inválida. Escolha entre 1 a 4");
                opcao = ler.nextInt();
            }
        }

        System.out.println("Digite o primeiro número. Observação: para números decimais, use vírgula ao invés de ponto");
        valor1 = ler.nextDouble();
        System.out.println("O primeiro valor digitado foi: " + valor1);
        System.out.println("Digite o segundo número. Observação: para números decimais, use vírgula ao invés de ponto");
        valor2 = ler.nextDouble();
        System.out.println("O segundo valor digitado foi: " + valor2);

        if (opcao == 1) {
            resultado = Soma(valor1, valor2);
            System.out.println("Resultado da Soma: " + resultado);
        }
        if (opcao == 2) {
            resultado = Subtracao(valor1, valor2);
            System.out.println("Resultado da Subtração: " + resultado);
        }
        if (opcao == 3) {
            resultado = Multiplicacao(valor1, valor2);
            System.out.println("Resultado da Multiplicação: " + resultado);
        }
        if (opcao == 4) {
            resultado = Divisao(valor1, valor2);
            System.out.println("Resultado da Divisão: " + resultado);
        }

    }

    private static double Soma(double a, double b) {
        double resultadoSoma;
        resultadoSoma = a + b;
        return resultadoSoma;
    }

    private static double Subtracao(double a, double b) {
        double resultadoSubtracao;
        resultadoSubtracao = a - b;
        return resultadoSubtracao;
    }

    private static double Multiplicacao(double a, double b) {
        double resultadoMultiplicacao;
        resultadoMultiplicacao = a * b;
        return resultadoMultiplicacao;
    }

    private static double Divisao(double a, double b) {
        double resultadoDivisao;
        resultadoDivisao = a / b;
        return resultadoDivisao;
    }
}

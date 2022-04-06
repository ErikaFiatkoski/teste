/*Exercícios para treino, dados no curso "Entendendo Métodos Java" na plataforma DIO (Digital Innovation One).
Descrição do Exercício: Crie uma aplicação que resolva as seguintes situações:
* 1: Calcule as quatro operações básicas: soma, subtração, multiplicação e divisão. Sempre dois valores devem ser passados;
* 2: A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite;
* 3: Calcule o valor final de um empréstimo, a partir do valor solicitado.
        Taxas e parcelas influenciam (Defina arbritariamente as faixas que influenciam nos valores).*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao;
        System.out.println("Escolha a opção que deseja:" +
                "\n1 - Calculadora" +
                "\n2 - Mensagem adequada" +
                "\n3 - Empréstimo");

        opcao = ler.nextInt();
        for (int i = 0; i != 1; ) {
            if (opcao == 1) {
                Calculadora();
                i = 1;
            } else if (opcao == 2) {
                Mensagem();
                i = 1;
            } else if (opcao == 3) {
                Emprestimo();
                i = 1;
            } else {
                System.out.println("Opção inválida. Escolha entre 1 a 3");
                opcao = ler.nextInt();
            }
        }
    }

    private static void Calculadora() {
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

    public static void Mensagem() {
        Scanner ler = new Scanner(System.in);
        int hora;
        System.out.println("Digite as horas, desconsiderando os minutos");
        hora = ler.nextInt();

        for (int i = 0; i != 1; ) {
            if (hora >= 5 && hora <= 12) {
                System.out.println("Mensagem Adequada: Bom dia!!");
                i = 1;
            } else if (hora >= 13 && hora <= 17) {
                System.out.println("Mensagem Adequada: Boa Tarde!!");
                i = 1;
            } else if (hora >= 18 || hora <= 4) {
                System.out.println("Mensagem Adequada: Boa Noite!!");
                i = 1;
            } else {
                System.out.println("Horário inválido!");
                System.out.println("Digite as horas (horários de 00 a 23), desconsiderando os minutos");
                hora = ler.nextInt();
            }
        }
    }

    public static void Emprestimo() {
        Scanner ler = new Scanner(System.in);
        float valor;
        float parcela;
        float total;
        float juros;
        float aux;
        float aux2;
        System.out.println("Digite o valor que deseja pegar emprestado");
        valor = ler.nextFloat();

        System.out.println("Digite a quantidade de parcelas desejadas, entre 1 e 25." +
                "\nOBSERVAÇÃO: A PARTIR DE 12 PARCELAS, É COBRADO 2% DE JUROS AO MÊS E " +
                "\nA PARTIR DE 20 PARCELAS, É COBRADO 5% DE JUROS AO MÊS.");
        parcela = ler.nextFloat();

        for (int i = 0; i != 1; ) {
            if (parcela < 12 && parcela != 0) {
                System.out.println("Não será cobrado juros pela quantidade de parcelas." +
                        "\nValor final: " + valor);
                i = 1;
            } else if (parcela >= 12 && parcela < 20) {
                juros = (2f / 100f); //assim, pega a porcentagem;
                aux = (juros * valor);
                aux2 = (aux * parcela);
                total = (valor + aux2);

                System.out.println("Cobrado 2% de juros. Valor final: " + total);
                i = 1;
            } else if (parcela > 20 && parcela <= 25) {
                juros = 5f / 100f; //assim, pega a porcentagem;
                aux = (juros * valor);
                aux2 = (aux * parcela);
                total = (valor + aux2);
                System.out.println("Cobrado 5% de juros. Valor final: " + total);
                i = 1;
            } else {
                System.out.println("Digite uma quantidade válida de parcelas");
                parcela = ler.nextInt();
            }
        }

    }
}

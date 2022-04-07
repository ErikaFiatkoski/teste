/*Exercícios para treino, dados no curso "Entendendo Métodos Java" na plataforma DIO (Digital Innovation One).
* 1: Calcule as quatro operações básicas: soma, subtração, multiplicação e divisão. Sempre dois valores devem ser passados; (CLASSE CALCULADORA)
* 2: A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite; (CLASSE MENSAGEM)
* 3: Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam (Defina arbritariamente as faixas que influenciam nos valores). (CLASSE EMPRESTIMO)
* 4: Crie uma aplicação que calcula a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio. OBS: use sobrecarga. (CLASSE CALCULOAREA) */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao;
        System.out.println("Escolha a opção que deseja:" +
                "\n1 - Calculadora" +
                "\n2 - Mensagem adequada" +
                "\n3 - Empréstimo" +
                "\n4 - Calcular Área do Quadrilátero");

        opcao = ler.nextInt();
        for (int i = 0; i != 1; ) {
            if (opcao == 1) {
                Calculadora.Calcular();
                i = 1;
            } else if (opcao == 2) {
                Mensagem.criaMensagem();
                i = 1;
            } else if (opcao == 3) {
                Emprestimo.calculoEmprestimo();
                i = 1;
            }else if (opcao == 4) {
                CalculoArea.Calculo();
                i = 1;
            }else {
                System.out.println("Opção inválida. Escolha entre 1 a 4");
                opcao = ler.nextInt();
            }
        }
    }

}

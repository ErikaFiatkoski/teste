/*Exercícios para treino, dados no curso "Entendendo Métodos Java" na plataforma DIO (Digital Innovation One).
Calcule o valor final de um empréstimo, a partir do valor solicitado.
Taxas e parcelas influenciam (Defina arbritariamente as faixas que influenciam nos valores).
*/

import java.util.Scanner;

public class Emprestimo {
    public static void calculoEmprestimo() {
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

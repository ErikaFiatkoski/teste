/*Exercícios para treino, dados no curso "Entendendo Métodos Java" na plataforma DIO (Digital Innovation One).
 A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite;
 */

import java.util.Scanner;

public class Mensagem {
    public static void criaMensagem() {
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
}

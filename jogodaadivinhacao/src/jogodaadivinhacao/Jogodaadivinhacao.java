package jogodaadivinhacao;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Jogodaadivinhacao {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Boas vindas ao Jogo Da Adivinhação!!!");

        String str = JOptionPane.showInputDialog("Digite seu nome: ");

        int resposta = JOptionPane.showConfirmDialog(null, "Certo " + str + " deseja iniciar o jogo?");
        if (resposta == JOptionPane.YES_OPTION) {

        } else if (resposta == JOptionPane.NO_OPTION) {

        } else {

        }

        Random random = new Random();

        int a = random.nextInt(10) + 1;
        int c = 0;

        if (resposta == 0) {
            for (int i = 0; a <= 10; i++) {

               String st = JOptionPane.showInputDialog("Digite um número entre 1 e 10");
            int b = Integer.parseInt(st); 

                

                if (b > a) {
                    JOptionPane.showMessageDialog(null, "O número é menor");
                } else if (b < a) {
                    JOptionPane.showMessageDialog(null, "o Número é maior");
                } else if (b == a) {
                    JOptionPane.showMessageDialog(null, "Acertou!!!");
                    c++;

                    int r = JOptionPane.showConfirmDialog(null, "Certo " + str + " deseja jogar novamente o jogo?");

                    if (r == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "Certo, vamos novamente");
                        a = random.nextInt(10) + 1;
                        i--;
                    } else if (r == JOptionPane.NO_OPTION) {
                        JOptionPane.showMessageDialog(null, "Você " + str + " errou " + i + " vezes e acertou " + c + " vezes");

                        break;
                    } else {
                        break;
                    }

                }

            }
        } else if (resposta == 1) {
            JOptionPane.showMessageDialog(null, "OK, até outro dia");
        }
    }

}

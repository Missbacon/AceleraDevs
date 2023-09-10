import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner adivinhacao = new Scanner(System.in);
        int numeroaleatorio = new Random().nextInt(100);
        int chutes = 0;
        System.out.println(numeroaleatorio);
        System.out.println("            Jogo da adivinhação!\n \n Você terá 5 tentativas para adivinhar o número que estou pensando.");

        int chuterealizado = 0;

        while (chutes < 5) {
            System.out.println("\n Digite um número de 0 a 100:\n");
            int chuteRealizado = adivinhacao.nextInt();
            chutes++;

            if (chuteRealizado > 100) {
                System.out.println("Número invalido, tentativa desperdiçada!");
            }

            if (chuteRealizado == numeroaleatorio) {
                System.out.println("Parabens! Você sabe ler mentes :)");
                break;
            } else if (chuteRealizado > numeroaleatorio && chutes < 5 && chuteRealizado <= 100) {
                System.out.println("\n Não é este, mas Não desista!  Tente um número MENOR que o anterior.");
            } else if (chuteRealizado < numeroaleatorio && chutes < 5 && chuteRealizado <= 100) {
                System.out.println("\n Não é este, mas Não desista! Tente um número MAIOR que o anterior.");
            }
            if (chutes == 5) {
                System.out.println("\n Poxa, acabaram suas chances, mas você pode iniciar novamente e gerar outro número para ser adivinhado!");
            }
        }
    }
}

// Gostaria de saber como implementar para quando o úsuario digita algo diferente de um número como uma letra por exemplo.
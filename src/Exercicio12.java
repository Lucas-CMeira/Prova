import java.util.Scanner;

class Jogo {
    private int horaInicial;
    private int horaFinal;

    public Jogo(int horaInicial, int horaFinal) {
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
    }

    public int calcularDuracao() {
        if (horaInicial == horaFinal) {
            return 24;
        } else if (horaInicial < horaFinal) {
            return horaFinal - horaInicial;
        } else {
            return 24 - horaInicial + horaFinal;
        }
    }
}

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int inicio = scanner.nextInt();

        System.out.print("Hora final: ");
        int fim = scanner.nextInt();

        Jogo jogo = new Jogo(inicio, fim);
        int duracao = jogo.calcularDuracao();

        System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);

        scanner.close();
    }
}

import java.util.Scanner;

class ContaTelefone {
    private int minutos;
    private final double valorBase = 50.0;
    private final int franquia = 100;
    private final double valorExcedente = 2.0;

    public ContaTelefone(int minutos) {
        this.minutos = minutos;
    }

    public double calcularValor() {
        if (minutos <= franquia) {
            return valorBase;
        } else {
            int excedente = minutos - franquia;
            return valorBase + (excedente * valorExcedente);
        }
    }
}

public class PlanoTelefone {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos: ");
        int minutosUsados = teclado.nextInt();

        ContaTelefone conta = new ContaTelefone(minutosUsados);
        double valorFinal = conta.calcularValor();

        System.out.printf("Valor a pagar: R$ %.2f%n", valorFinal);

        teclado.close();
    }
}

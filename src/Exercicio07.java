import java.util.Scanner;

class ArremessoDardo {
    private double tentativa1;
    private double tentativa2;
    private double tentativa3;

    public ArremessoDardo(double t1, double t2, double t3) {
        this.tentativa1 = t1;
        this.tentativa2 = t2;
        this.tentativa3 = t3;
    }

    public double maiorDistancia() {
        double maior = tentativa1;

        if (tentativa2 > maior) {
            maior = tentativa2;
        }
        if (tentativa3 > maior) {
            maior = tentativa3;
        }

        return maior;
    }
}

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as tres distancias:");
        double d1 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        double d3 = scanner.nextDouble();

        ArremessoDardo arremesso = new ArremessoDardo(d1, d2, d3);
        double maior = arremesso.maiorDistancia();

        System.out.printf("MAIOR DISTANCIA = %.2f\n", maior);

        scanner.close();
    }
}

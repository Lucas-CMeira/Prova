import java.util.Scanner;

class EquacaoSegundoGrau {
    private double a;
    private double b;
    private double c;

    public EquacaoSegundoGrau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcularDelta() {
        return (b * b) - (4 * a * c);
    }

    public boolean temRaizesReais() {
        return calcularDelta() >= 0;
    }

    public double calcularX1() {
        return (-b + Math.sqrt(calcularDelta())) / (2 * a);
    }

    public double calcularX2() {
        return (-b - Math.sqrt(calcularDelta())) / (2 * a);
    }
}

public class BhaskaraProva {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Coeficiente a: ");
        double a = teclado.nextDouble();

        System.out.print("Coeficiente b: ");
        double b = teclado.nextDouble();

        System.out.print("Coeficiente c: ");
        double c = teclado.nextDouble();

        EquacaoSegundoGrau conta = new EquacaoSegundoGrau(a, b, c);

        if (conta.temRaizesReais()) {
            double x1 = conta.calcularX1();
            double x2 = conta.calcularX2();

            System.out.printf("X1 = %.4f%n", x1);
            System.out.printf("X2 = %.4f%n", x2);
        } else {
            System.out.println("Esta equacao nao possui raizes reais");
        }

        teclado.close();
    }
}

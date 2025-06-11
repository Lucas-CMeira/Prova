import java.util.Scanner;

class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String localizar() {
        if (x == 0 && y == 0) {
            return "Origem";
        } else if (x == 0) {
            return "Eixo Y";
        } else if (y == 0) {
            return "Eixo X";
        } else if (x > 0 && y > 0) {
            return "Q1";
        } else if (x < 0 && y > 0) {
            return "Q2";
        } else if (x < 0 && y < 0) {
            return "Q3";
        } else {
            return "Q4";
        }
    }
}

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor de X: ");
        double x = scanner.nextDouble();

        System.out.print("Valor de Y: ");
        double y = scanner.nextDouble();

        Ponto ponto = new Ponto(x, y);
        String localizacao = ponto.localizar();

        System.out.println(localizacao);

        scanner.close();
    }
}

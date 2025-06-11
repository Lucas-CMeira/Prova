import java.util.Scanner;

class Glicose {
    private double valor;

    public Glicose(double valor) {
        this.valor = valor;
    }

    public String classificar() {
        if (valor <= 100) {
            return "normal";
        } else if (valor <= 140) {
            return "elevado";
        } else {
            return "diabetes";
        }
    }
}

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        double valor = scanner.nextDouble();

        Glicose glicose = new Glicose(valor);
        String classificacao = glicose.classificar();

        System.out.println("Classificacao: " + classificacao);

        scanner.close();
    }
}

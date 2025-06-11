import java.util.Scanner;

class ReajusteSalarial {
    private double salarioAtual;

    public ReajusteSalarial(double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    public double getPorcentagem() {
        if (salarioAtual <= 1000.00) {
            return 20.0;
        } else if (salarioAtual <= 3000.00) {
            return 15.0;
        } else if (salarioAtual <= 8000.00) {
            return 10.0;
        } else {
            return 5.0;
        }
    }

    public double calcularAumento() {
        return salarioAtual * (getPorcentagem() / 100.0);
    }

    public double calcularNovoSalario() {
        return salarioAtual + calcularAumento();
    }
}

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario da pessoa: ");
        double salario = scanner.nextDouble();

        ReajusteSalarial reajuste = new ReajusteSalarial(salario);

        double aumento = reajuste.calcularAumento();
        double novoSalario = reajuste.calcularNovoSalario();
        double porcentagem = reajuste.getPorcentagem();

        System.out.printf("Novo salario R$ %.2f\n", novoSalario);
        System.out.printf("Aumento R$ %.2f\n", aumento);
        System.out.printf("Porcentagem = %.0f%%\n", porcentagem);

        scanner.close();
    }
}

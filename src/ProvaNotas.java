import java.util.Scanner;

class Aluno {
    private double primeiraNota;
    private double segundaNota;

    public Aluno(double n1, double n2) {
        this.primeiraNota = n1;
        this.segundaNota = n2;
    }

    public double calcularNotaFinal() {
        return primeiraNota + segundaNota;
    }

    public boolean foiAprovado() {
        return calcularNotaFinal() >= 60.0;
    }
}

public class ProvaNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = teclado.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = teclado.nextDouble();

        Aluno aluno = new Aluno(n1, n2);
        double finalNota = aluno.calcularNotaFinal();

        System.out.printf("NOTA FINAL = %.1f%n", finalNota);

        if (!aluno.foiAprovado()) {
            System.out.println("REPROVADO");
        }

        teclado.close();
    }
}

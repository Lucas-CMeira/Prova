import java.util.Scanner;

class Multiplo {
    private int a;
    private int b;

    public Multiplo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public boolean saoMultiplos() {
        return (a % b == 0) || (b % a == 0);
    }
}

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        Multiplo multiplo = new Multiplo(num1, num2);

        if (multiplo.saoMultiplos()) {
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }

        scanner.close();
    }
}

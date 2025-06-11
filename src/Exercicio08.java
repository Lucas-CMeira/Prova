import java.util.Scanner;

class ConversorTemperatura {
    public static double celsiusParaFahrenheit(double c) {
        return (c * 9.0 / 5.0) + 32.0;
    }

    public static double fahrenheitParaCelsius(double f) {
        return (5.0 / 9.0) * (f - 32.0);
    }
}

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        char escala = scanner.next().toUpperCase().charAt(0);

        if (escala == 'F') {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double f = scanner.nextDouble();
            double c = ConversorTemperatura.fahrenheitParaCelsius(f);
            System.out.printf("Temperatura equivalente em Celsius: %.2f\n", c);
        } else if (escala == 'C') {
            System.out.print("Digite a temperatura em Celsius: ");
            double c = scanner.nextDouble();
            double f = ConversorTemperatura.celsiusParaFahrenheit(c);
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f\n", f);
        } else {
            System.out.println("Escala invalida. Use apenas C ou F.");
        }

        scanner.close();
    }
}

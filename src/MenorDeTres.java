import java.util.Scanner;

class Comparador {
    private int valor1;
    private int valor2;
    private int valor3;

    public Comparador(int v1, int v2, int v3) {
        this.valor1 = v1;
        this.valor2 = v2;
        this.valor3 = v3;
    }

    public int menorValor() {
        int menor = valor1;

        if (valor2 < menor) {
            menor = valor2;
        }

        if (valor3 < menor) {
            menor = valor3;
        }

        return menor;
    }
}

public class MenorDeTres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int v1 = teclado.nextInt();

        System.out.print("Segundo valor: ");
        int v2 = teclado.nextInt();

        System.out.print("Terceiro valor: ");
        int v3 = teclado.nextInt();

        Comparador comparar = new Comparador(v1, v2, v3);

        int menor = comparar.menorValor();
        System.out.println("MENOR = " + menor);

        teclado.close();
    }
}

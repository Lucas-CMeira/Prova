import java.util.Scanner;

class Venda {
    private double precoUnitario;
    private int quantidade;
    private double valorRecebido;

    public Venda(double precoUnitario, int quantidade, double valorRecebido) {
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
        this.valorRecebido = valorRecebido;
    }

    public double calcularTotal() {
        return precoUnitario * quantidade;
    }

    public boolean pagamentoCompleto() {
        return valorRecebido >= calcularTotal();
    }

    public double calcularTrocoOuFalta() {
        return Math.abs(valorRecebido - calcularTotal());
    }
}

public class TrocoProva {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double preco = teclado.nextDouble();

        System.out.print("Quantidade comprada: ");
        int qtd = teclado.nextInt();

        System.out.print("Dinheiro recebido: ");
        double recebido = teclado.nextDouble();

        Venda venda = new Venda(preco, qtd, recebido);

        if (venda.pagamentoCompleto()) {
            System.out.printf("TROCO = %.2f%n", venda.calcularTrocoOuFalta());
        } else {
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS%n", venda.calcularTrocoOuFalta());
        }

        teclado.close();
    }
}

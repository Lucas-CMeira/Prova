import java.util.Scanner;

class Produto {
    private int codigo;
    private double preco;

    public Produto(int codigo, double preco) {
        this.codigo = codigo;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }
}

class Lanchonete {
    private Produto[] produtos;

    public Lanchonete() {
        produtos = new Produto[5];
        produtos[0] = new Produto(1, 5.00);
        produtos[1] = new Produto(2, 3.50);
        produtos[2] = new Produto(3, 4.80);
        produtos[3] = new Produto(4, 8.90);
        produtos[4] = new Produto(5, 7.32);
    }

    public double calcularTotal(int codigo, int quantidade) {
        for (Produto p : produtos) {
            if (p.getCodigo() == codigo) {
                return p.getPreco() * quantidade;
            }
        }
        return 0.0; // Se o código não for encontrado
    }
}

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lanchonete lanchonete = new Lanchonete();

        System.out.print("Codigo do produto comprado: ");
        int codigo = scanner.nextInt();

        System.out.print("Quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double total = lanchonete.calcularTotal(codigo, quantidade);
        System.out.printf("Valor a pagar: R$ %.2f\n", total);

        scanner.close();
    }
}

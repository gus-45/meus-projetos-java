import java.util.Scanner;
import java.util.Locale;

public class programaProduto {
  public static void main(String[] args) {
     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);
     
     Produto p = new Produto();
     
     System.out.println("Informe os dados do produtos: ");
     System.out.print("Produto: ");
     p.nome = sc.nextLine();
     
     System.out.print("Qtd.Estoque: ");
     p.quantidade = sc.nextInt();
     
     System.out.print("Preco: ");
     p.preco = sc.nextDouble();
     
     System.out.println("Dados do produto: ");
     System.out.println("Nome: " +  p.nome  +  "Quantidade: " + p.quantidade +  "Preco: " + p.preco + "Valor total no estoque: " + p.valorTotalEstoque());
     
     System.out.println("Digite a quantidade de entrada no estoque: ");
     int entrada = sc.nextInt();
     p.adicionarProdutos(entrada);
     
     System.out.println("Dados atualizados: ");
     System.out.println("Nome: " +  p.nome  +  "Quantidade: " + p.quantidade +  "Preco: " + p.preco + "Valor total no estoque: " + p.valorTotalEstoque());
     
     System.out.println("Digite a quantidade de saida do estoque: ");
     int saida = sc.nextInt();
     p.removerProdutos(saida);
     
     System.out.println("Dados atualizados: ");
     System.out.println("Nome: " +  p.nome  +  "Quantidade: " + p.quantidade +  "Preco: " + p.preco + "Valor total no estoque: " + p.valorTotalEstoque());
     
     sc.close();
  }
}
     
     
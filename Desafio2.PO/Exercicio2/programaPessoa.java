import java.util.Scanner;
import java.util.Locale;

public class programaPessoa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da pessoa:");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Dia nascimento: ");
        int diaNascimento = sc.nextInt();

        System.out.print("Mês nascimento: ");
        int mesNascimento = sc.nextInt();

        System.out.print("Ano nascimento: ");
        int anoNascimento = sc.nextInt();

        System.out.print("Sexo (F/M): ");
        char sexo = sc.next().charAt(0);

        Pessoa pessoa = new Pessoa(nome, diaNascimento, mesNascimento, anoNascimento, sexo);

        System.out.println("\nInforme a data atual:");

        System.out.print("Dia: ");
        int diaAtual = sc.nextInt();

        System.out.print("Mês: ");
        int mesAtual = sc.nextInt();

        System.out.print("Ano: ");
        int anoAtual = sc.nextInt();
        
        pessoa.calculaIdade(diaAtual, mesAtual, anoAtual);

        pessoa.exibeDados();

        sc.close();
    }
}

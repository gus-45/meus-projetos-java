//Gustavo Monteiro


import java.util.Locale;
import java.util.Scanner;

public class ProgramaFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);

        Funcionario func = new Funcionario();

        System.out.print("Nome: ");
        func.nome = sc.nextLine();

        System.out.print("Salario Bruto: ");
        func.salarioBruto = sc.nextDouble();

        System.out.print("Imposto: ");
        func.imposto = sc.nextDouble();

        System.out.println("Funcionario: " + func);

        System.out.print("Percentual de aumento do salario? ");
        double porcentagem = sc.nextDouble();
        func.aumentarSalario(porcentagem);

        System.out.println("Salario com aumento: " + func);

        sc.close();
    }
}

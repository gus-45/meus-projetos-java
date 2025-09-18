//Gustavo Monteiro

package aplicacao;

import entidades.FuncionarioPF;
import entidades.FuncionarioPJ;
import java.util.Scanner;

public class programaFuncionario {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Funcionário Pessoa Física 
        System.out.println(" Cadastro de Funcionário PF ");
        System.out.print("Nome: ");
        String nomePF = sc.nextLine();
        
        System.out.print("Salário: ");
        double salarioPF = sc.nextDouble();
        sc.nextLine(); 
        
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        
        FuncionarioPF pf = new FuncionarioPF(nomePF, salarioPF, cpf);
        
        //Funcionário Pessoa Jurídica
        System.out.println("\n Cadastro de Funcionário PJ ");
        System.out.print("Nome: ");
        String nomePJ = sc.nextLine();
        
        System.out.print("Salário: ");
        double salarioPJ = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("CNPJ: ");
        String cnpj = sc.nextLine();
        
        FuncionarioPJ pj = new FuncionarioPJ(nomePJ, salarioPJ, cnpj);
        
        //Impressão dos dados
        System.out.println("\n Funcionário PF ");
        System.out.println(pf.imprimirDados());
        
        System.out.println("\n Funcionário PJ ");
        System.out.println(pj.imprimirDados());
        
        sc.close();
    }
}

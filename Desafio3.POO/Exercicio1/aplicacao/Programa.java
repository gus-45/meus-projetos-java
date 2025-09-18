//Gustavo Monteiro


package aplicacao;

import java.util.Scanner;
import entidades.Conta;
import entidades.contaEmpresarial;
import entidades.contaPoupanca;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println(" Criar Conta Comum ");
        System.out.print("Numero da conta: ");
        int numConta = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Titular: ");
        String titular = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();

        Conta conta1 = new Conta(numConta, titular, saldo);

        
        System.out.println("\n Criar Conta Empresarial ");
        System.out.print("Numero da conta: ");
        int numEmp = sc.nextInt();
        sc.nextLine();
        System.out.print("Titular: ");
        String titEmp = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double saldoEmp = sc.nextDouble();
        System.out.print("Limite de Empréstimo: ");
        double limite = sc.nextDouble();

        contaEmpresarial contaEmp = new contaEmpresarial(numEmp, titEmp, saldoEmp, limite);

      
        System.out.println("\n Criar Conta Poupança ");
        System.out.print("Numero da conta: ");
        int numPoup = sc.nextInt();
        sc.nextLine();
        System.out.print("Titular: ");
        String titPoup = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double saldoPoup = sc.nextDouble();
        System.out.print("Taxa de Juros: ");
        double taxa = sc.nextDouble();

        contaPoupanca contaPoup = new contaPoupanca(numPoup, titPoup, saldoPoup, taxa);
        
        
        System.out.println("\n  RESUMO DAS CONTAS ");
        System.out.println("Conta Comum -> Nº: " + conta1.getNumero() 
                   + ", Titular: " + conta1.getTitular() 
                   + ", Saldo: " + conta1.getSaldo());
       
            sc.close();
    }
}

//Gustavo Monteiro

import java.util.Locale;
import java.util.Scanner;



class Funcionario {
    String nome;
    double salarioBruto;
    double imposto;

        public double salarioLiquido() {
        return salarioBruto - imposto;
    }

       public void aumentarSalario(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem;
    }

       public String toString() {
        return nome + ", $ " + String.format("%.2f", salarioLiquido());
    }
}




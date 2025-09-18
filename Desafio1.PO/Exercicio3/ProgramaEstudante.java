//Gustavo Monteiro


import java.util.Locale;
import java.util.Scanner;

public class ProgramaEstudante {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();

        System.out.print("Nome do aluno: ");
        estudante.nome = sc.nextLine();

        System.out.print("Nota do primeiro trimestre: ");
        estudante.grade1 = sc.nextDouble();

        System.out.print("Nota do segundo trimestre: ");
        estudante.grade2 = sc.nextDouble();

        System.out.print("Nota do terceiro trimestre: ");
        estudante.grade3 = sc.nextDouble();

        System.out.printf("Nota final: %.2f%n", estudante.finalGrade());

        if (estudante.isApproved()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("Faltaram %.2f pontos%n", estudante.missingPoints());
        }

        sc.close();
    }
}


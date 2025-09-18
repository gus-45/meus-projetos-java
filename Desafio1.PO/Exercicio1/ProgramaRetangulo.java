//Gustavo Monteiro

import java.util.Scanner;

public class ProgramaRetangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Retangulo ret = new Retangulo();

        System.out.println("Informe a altura e a largura do retangulo:");
        ret.altura = sc.nextDouble();
        ret.largura = sc.nextDouble();

        double area = ret.Area();
        double perimetro = ret.Perimetro();
        double diagonal = ret.Diagonal();

        System.out.println("A area e: " + area);
        System.out.println("O perimetro e: " + perimetro);
        System.out.println("A diagonal e: " + diagonal);

        sc.close();
    }
}

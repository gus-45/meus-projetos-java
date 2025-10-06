// Gustavo Monteiro

public class Caminhao extends Veiculo {
    private int numeroDeEixos;

    public Caminhao() {
        super();
    }

    public Caminhao(String placa, double capacidadeDeCarga, int numeroDeEixos) {
        super(placa, capacidadeDeCarga);
        this.numeroDeEixos = numeroDeEixos;
    }

    public int getNumeroDeEixos() {
        return numeroDeEixos;
    }

    public void setNumeroDeEixos(int numeroDeEixos) {
        this.numeroDeEixos = numeroDeEixos;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Número de Eixos: " + numeroDeEixos;
    }
}

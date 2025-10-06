// Gustavo Monteiro 

public class Furgao extends Veiculo {
    private int capacidadeCaixas;

    public Furgao() {
        super();
    }

    public Furgao(String placa, double capacidadeDeCarga, int capacidadeCaixas) {
        super(placa, capacidadeDeCarga);
        this.capacidadeCaixas = capacidadeCaixas;
    }

    public int getCapacidadeCaixas() {
        return capacidadeCaixas;
    }

    public void setCapacidadeCaixas(int capacidadeCaixas) {
        this.capacidadeCaixas = capacidadeCaixas;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Capacidade de Caixas: " + capacidadeCaixas;
    }
}

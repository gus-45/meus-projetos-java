// Gustavo Monteiro

public class Veiculo {
    private String placa;
    private double capacidadeDeCarga;

    public Veiculo(String placa, double capacidadeDeCarga) {
        this.placa = placa;
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public Veiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(double capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }
    

    public String getInfo() {
        return "Placa: " + placa + ", Capacidade de Carga: " + capacidadeDeCarga + " kg";
    }
}


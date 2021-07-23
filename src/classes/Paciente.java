package classes;

public class Paciente {

    private double altura;
    private double peso;

    public Paciente (double altura, double peso)
    {
        this.altura = altura;
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setAltura(double altura) {
        if (!(altura>= this.altura)){
            throw new IllegalArgumentException("Altura não pode ser menor.");
        }
        this.altura = altura;
    }

    public void setPeso(double peso) {
        if (peso<=0){
            throw new IllegalArgumentException("Peso inválido");
        }
        this.peso = peso;
    }
}

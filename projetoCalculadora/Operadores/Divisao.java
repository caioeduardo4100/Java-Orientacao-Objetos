package Operadores;

public class Divisao extends Main {
    private double A, B;

    public Divisao(double A, double B) {        //Classe filha (subclasse)
        super(A, B);
        this.A = A;
        this.B = B;
    }

    public double calculaDivisao() {
        return A / B;
    }

    public double getA() {
        return (int) A;
    }

    public double getB() {
        return (int) B;
    }
}

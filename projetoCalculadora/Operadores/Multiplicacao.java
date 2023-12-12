package Operadores;

public class Multiplicacao extends Main {
    private int A, B;

    public Multiplicacao(int A, int B) {        //Classe filha (subclasse)
        super(A, B);
        this.A = A;
        this.B = B;
    }

    public int calculaMultiplicacao() {
        return A * B;
    }

    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }
}

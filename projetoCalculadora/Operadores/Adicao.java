package Operadores;

public class Adicao extends Main {
    private int A, B;

    public Adicao(int A, int B) {       //Classe filha (subclasse)
        super(A, B);
        this.A = A;
        this.B = B;
    }

    public int calculaAdicao() {
        return A + B;
    }

    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }

    

    
}
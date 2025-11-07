package strategy;

public class CalculadoraFrete {

    private float valor1;
    private float valor2;

    public CalculadoraFrete(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public float calcular(Frete frete) {
        return frete.calcular(valor1, valor2);
    }
}

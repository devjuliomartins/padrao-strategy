package strategy;

public class Pedido {

    private float valorFrete;

    public float getValorFrete() {
        return valorFrete;
    }

    public void calcularFreteSedex(float peso, float distancia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso, distancia);
        this.valorFrete = calculadora.calcular(new FreteSedex());
    }

    public void calcularFretePAC(float peso, float distancia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso, distancia);
        this.valorFrete = calculadora.calcular(new FretePAC());
    }

    public void calcularFreteRetiradaLocal(float peso, float distancia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso, distancia);
        this.valorFrete = calculadora.calcular(new FreteRetiradaLocal());
    }

}

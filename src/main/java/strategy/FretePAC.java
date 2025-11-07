package strategy;

public class FretePAC implements Frete {

    public float calcular(float peso, float distancia) {
        return peso * 1.5f + distancia * 0.5f;
    }

}

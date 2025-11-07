package strategy;

public class FreteSedex implements Frete {

    public float calcular(float peso, float distancia) {
        return peso * 3 + distancia * 0.1f;
    }

}

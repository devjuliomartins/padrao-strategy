package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveCalcularFreteSedexAluno() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteSedex(3.0f, 100.0f);
        assertEquals(19.0f, pedido.getValorFrete());
    }

    @Test
    void deveCalcularFretePacAluno() {
        Pedido pedido = new Pedido();
        pedido.calcularFretePAC(3.0f, 100.0f);
        assertEquals(54.5f, pedido.getValorFrete());
    }

    @Test
    void deveCalcularFreteRetiradaLocalAluno() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteRetiradaLocal(3.0f, 0.0f);
        assertEquals(0.0f, pedido.getValorFrete());
    }

}
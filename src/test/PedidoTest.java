import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PedidoTest {
    @Test
    void somaPrecosDasBebidas() {
        Pedido pedido = new Pedido();
        pedido.adicionar(new Suco(EFruta.LARANJA));
        pedido.adicionar(new Vitamina(EFruta.MANGA));
        assertEquals(7.0, pedido.preco(), 0.001);
    }
}

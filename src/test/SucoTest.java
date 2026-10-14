import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SucoTest {
    @Test
    void calculaMediaDeUmaFruta() {
        Suco suco = new Suco(EFruta.LARANJA);
        assertEquals(2.0, suco.preco(), 0.001);
    }

    @Test
    void aceitaLaranjaComoSegundaFrutaECalculaMedia() {
        Suco suco = new Suco(EFruta.MANGA);
        assertEquals(0, suco.adicionar(EFruta.LARANJA));
        assertEquals(2.25, suco.preco(), 0.001);
    }

    @Test
    void rejeitaDuasFrutasSemLaranja() {
        Suco suco = new Suco(EFruta.MANGA);
        assertEquals(-1, suco.adicionar(EFruta.MORANGO));
        assertEquals(1, suco.getFrutas().size());
    }
}

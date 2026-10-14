import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VitaminaTest {
    @Test
    void calculaPrecoComUmaFrutaELeite() {
        Vitamina vitamina = new Vitamina(EFruta.MANGA);
        assertEquals(5.0, vitamina.preco(), 0.001);
    }

    @Test
    void aplicaAcrescimoDeQuarentaPorCentoComDuasFrutas() {
        Vitamina vitamina = new Vitamina(EFruta.MANGA);
        vitamina.adicionar(EFruta.LARANJA);
        assertEquals((2.25 + 2.5) * 1.40, vitamina.preco(), 0.001);
    }

    @Test
    void aplicaAcrescimoDeSessentaPorCentoComTresFrutas() {
        Vitamina vitamina = new Vitamina(EFruta.MANGA);
        vitamina.adicionar(EFruta.LARANJA);
        vitamina.adicionar(EFruta.MORANGO);
        assertEquals(((2.5 + 2.0 + 3.0) / 3.0 + 2.5) * 1.60, vitamina.preco(), 0.001);
    }

    @Test
    void naoPermiteMaisDeTresFrutas() {
        Vitamina vitamina = new Vitamina(EFruta.MANGA);
        vitamina.adicionar(EFruta.LARANJA);
        vitamina.adicionar(EFruta.MORANGO);
        assertEquals(-1, vitamina.adicionar(EFruta.CUPUACU));
    }
}

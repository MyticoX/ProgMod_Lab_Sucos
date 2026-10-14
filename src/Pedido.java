import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Bebida> itens;

    public Pedido() {
        itens = new ArrayList<>();
    }

    /** Adiciona a bebida e retorna 0; retorna -1 se o item for nulo. */
    public int adicionar(Bebida item) {
        if (item == null) return -1;
        itens.add(item);
        return 0;
    }

    public double preco() {
        double total = 0.0;
        for (Bebida item : itens) total += item.preco();
        return total;
    }

    @Override
    public String toString() {
        return "Pedido: " + itens + String.format(" | Total: R$ %.2f", preco());
    }
}

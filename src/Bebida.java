import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public abstract class Bebida {
    private String descricao;
    protected List<EFruta> frutas;

    public Bebida(String descricao) {
        this.descricao = Objects.requireNonNull(descricao, "A descrição não pode ser nula.");
        this.frutas = new ArrayList<>();
    }

    public String getDescricao() { return descricao; }

    public List<EFruta> getFrutas() {
        return Collections.unmodifiableList(frutas);
    }

    public abstract int adicionar(EFruta fruta);
    public abstract double preco();

    protected double mediaPrecosFrutas() {
        if (frutas.isEmpty()) return 0.0;
        double soma = 0.0;
        for (EFruta fruta : frutas) soma += fruta.valor();
        return soma / frutas.size();
    }

    @Override
    public String toString() {
        return descricao + " " + frutas + String.format(" - R$ %.2f", preco());
    }
}

public class Suco extends Bebida {
    public Suco(EFruta fruta) {
        super("Suco");
        if (fruta == null) throw new IllegalArgumentException("A fruta não pode ser nula.");
        frutas.add(fruta);
    }

    /** Retorna 0 quando adiciona; -1 quando a regra do suco não é atendida. */
    @Override
    public int adicionar(EFruta fruta) {
        if (fruta == null || frutas.size() >= 2) return -1;
        // Com duas frutas, uma delas obrigatoriamente precisa ser laranja.
        if (frutas.size() == 1 && frutas.get(0) != EFruta.LARANJA && fruta != EFruta.LARANJA) return -1;
        frutas.add(fruta);
        return 0;
    }

    @Override
    public double preco() {
        if (frutas.isEmpty()) return 0.0;
        return mediaPrecosFrutas();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

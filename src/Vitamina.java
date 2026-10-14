public class Vitamina extends Bebida {
    private static final double ACRESCIMO = 2.5;

    public Vitamina(EFruta fruta) {
        super("Vitamina");
        if (fruta == null) throw new IllegalArgumentException("A fruta não pode ser nula.");
        frutas.add(fruta);
    }

    /** Retorna 0 quando adiciona; -1 se exceder três frutas ou receber nulo. */
    @Override
    public int adicionar(EFruta fruta) {
        if (fruta == null || frutas.size() >= 3) return -1;
        frutas.add(fruta);
        return 0;
    }

    @Override
    public double preco() {
        if (frutas.isEmpty()) return 0.0;
        double precoBase = mediaPrecosFrutas() + ACRESCIMO;
        if (frutas.size() == 2) return precoBase * 1.40;
        if (frutas.size() == 3) return precoBase * 1.60;
        return precoBase;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

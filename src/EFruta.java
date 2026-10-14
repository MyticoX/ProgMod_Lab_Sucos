public enum EFruta {
    // Os valores não são informados numericamente no enunciado; estes são valores-base
    // definidos para permitir os cálculos e podem ser ajustados conforme orientação do professor.
    CUPUACU(4.00),
    GRAVIOLA(3.50),
    LARANJA(2.00),
    MANGA(2.50),
    MORANGO(3.00);

    private final double valor;

    EFruta(double preco) {
        this.valor = preco;
    }

    public double valor() {
        return valor;
    }
}

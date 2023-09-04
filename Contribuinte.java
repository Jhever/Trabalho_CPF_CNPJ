package receitaFederal;

public abstract class Contribuinte {
    protected String nome;
    protected double rendaBruta;

    public Contribuinte(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    public abstract double calcularImposto();
    public abstract String getCpfCnpj();

    @Override
    public String toString() {
        return "Nome: " + nome + ", Renda Bruta: " + rendaBruta;
    }
}
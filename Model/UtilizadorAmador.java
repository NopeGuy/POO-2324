package Model;

public class UtilizadorAmador extends Utilizador{
    private int pontos;
    private int atividadesRealizadas;


    // Construtores
    public UtilizadorAmador(String nome, String morada, String email, int freqCard, int pontos, int atividadesRealizadas) {
        super(nome, morada, email, freqCard);
        this.pontos = pontos;
        this.atividadesRealizadas = atividadesRealizadas;
    }

    public UtilizadorAmador(UtilizadorAmador u) {
        super(u.getNome(), u.getMorada(), u.getEmail(), u.getFreqCard());
        this.pontos = u.getPontos();
        this.atividadesRealizadas = u.getAtividadesRealizadas();
    }

    public UtilizadorAmador() {
        super();
        this.pontos = 0;
        this.atividadesRealizadas = 0;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getAtividadesRealizadas() {
        return atividadesRealizadas;
    }

    public void setAtividadesRealizadas(int atividadesRealizadas) {
        this.atividadesRealizadas = atividadesRealizadas;
    }

    @Override
    public String toString() {
        return "UtilizadorAmador{ " +
                "Nº Utilizador = " + getNUtilizador() +
                ",Nome = " + getNome() +
                ", Email = " + getEmail() +
                ", Morada = " + getMorada() +
                ", Frequência Cardíaca Média = " + getFreqCard() +
                ", Pontos = " + pontos +
                ", Atividades Realizadas = " + atividadesRealizadas +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if(this == null || o.getClass() != this.getClass()) return false;
        if(this == o) return true;
        UtilizadorAmador u = (UtilizadorAmador) o;
        return (this.getNUtilizador() == u.getNUtilizador()) &&
                this.getNome().equals(u.getNome()) &&
                this.getMorada().equals(u.getMorada()) &&
                this.getEmail().equals(u.getEmail()) &&
                this.getFreqCard() == u.getFreqCard() &&
                this.pontos == u.getPontos() &&
                this.atividadesRealizadas == u.getAtividadesRealizadas();
    }

    @Override
    public Utilizador clone() {
        return new UtilizadorAmador(this);
    }
    
}
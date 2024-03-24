package Model;


public class UtilizadorProfissional extends Utilizador{
    private int pontos;
    private int atividadesRealizadas;

    // Construtores
    public UtilizadorProfissional(String nome, String morada, String email, int freqCard, int pontos, int atividadesRealizadas) {
        super(nome, morada, email, freqCard);
        this.pontos = pontos;
        this.atividadesRealizadas = atividadesRealizadas;
    }

    public UtilizadorProfissional(UtilizadorProfissional u) {
        super(u.getNUtilizador(), u.getNome(), u.getMorada(), u.getEmail(), u.getFreqCard());
        this.pontos = u.getPontos();
        this.atividadesRealizadas = u.getAtividadesRealizadas();
    }

    public UtilizadorProfissional() {
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
        return "UtilizadorProfissional{ " +
                "Nº Utilizador = " + getNUtilizador() +
                ",Nome = " + getNome() +
                ", Email = " + getEmail() +
                ", Morada = " + getMorada() +
                ", Frequência Cardíaca Média = " + getFreqCard() +
                ", Tipo = Profissional" +
                ", Pontos = " + pontos +
                ", Atividades Realizadas = " + atividadesRealizadas +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == null || o.getClass() != this.getClass())
            return false;
        if (this == o)
            return true;
        UtilizadorProfissional u = (UtilizadorProfissional) o;
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
        return new UtilizadorProfissional(this);
    }

     public double calculoCalorias(){
        return 0;
    }
    
}

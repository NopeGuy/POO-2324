package Model;

public class UtilizadorAmador extends Utilizador{
    private int nivel;
    private int pontos;
    private int atividadesRealizadas;


    // Construtores
    public UtilizadorAmador(String nUtilizador, String nome, String morada, String email, int freqCard, int nivel, int pontos, int atividadesRealizadas) {
        super(nUtilizador, nome, morada, email, freqCard);
        this.nivel = nivel;
        this.pontos = pontos;
        this.atividadesRealizadas = atividadesRealizadas;
    }

    public UtilizadorAmador(UtilizadorAmador u) {
        super(u.getNUtilizador(), u.getNome(), u.getMorada(), u.getEmail(), u.getFreqCard());
        this.nivel = u.getNivel();
        this.pontos = u.getPontos();
        this.atividadesRealizadas = u.getAtividadesRealizadas();
    }

    public UtilizadorAmador() {
        super();
        this.nivel = 0;
        this.pontos = 0;
        this.atividadesRealizadas = 0;
    }
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
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
        return "UtilizadorAmador{" +
                "nome=" + getNome() +
                ", email=" + getEmail() +
                ", morada=" + getMorada() +
                ", freqCard=" + getFreqCard() +
                ", nivel=" + nivel +
                ", pontos=" + pontos +
                ", atividadesRealizadas=" + atividadesRealizadas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == null || o.getClass() != this.getClass()) return false;
        if(this == o) return true;
        UtilizadorAmador u = (UtilizadorAmador) o;
        return this.getNUtilizador().equals(u.getNUtilizador()) &&
                this.getNome().equals(u.getNome()) &&
                this.getMorada().equals(u.getMorada()) &&
                this.getEmail().equals(u.getEmail()) &&
                this.getFreqCard() == u.getFreqCard() &&
                this.nivel == u.getNivel() &&
                this.pontos == u.getPontos() &&
                this.atividadesRealizadas == u.getAtividadesRealizadas();
    }

    @Override
    public Utilizador clone() {
        return new UtilizadorAmador(this);
    }
    
}

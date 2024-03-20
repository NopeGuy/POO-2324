package Model;

public abstract class Utilizador {

    // Variáveis de instância
    private String nUtilizador;
    private String nome;
    private String morada;
    private String email;
    private int freqCard;

    // Getters
    public String getNUtilizador() {
        return this.nUtilizador;
    }

    public String getNome() {
        return this.nome;
    }

    public String getMorada() {
        return this.morada;
    }

    public String getEmail() {
        return this.email;
    }

    public int getFreqCard() {
        return this.freqCard;
    }

    // Setters
    public void setNUtilizador(String nUtilizador) {
        this.nUtilizador = nUtilizador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFreqCard(int freqCard) {
        this.freqCard = freqCard;
    }

    // Construtores
    public Utilizador(String nUtilizador, String nome, String morada, String email, int freqCard) {
        this.nUtilizador = nUtilizador;
        this.nome = nome;
        this.morada = morada;
        this.email = email;
        this.freqCard = freqCard;
    }

    public Utilizador(Utilizador u) {
        this.nUtilizador = u.getNUtilizador();
        this.nome = u.getNome();
        this.morada = u.getMorada();
        this.email = u.getEmail();
        this.freqCard = u.getFreqCard();
    }

    public Utilizador() {
        this.nUtilizador = "";
        this.nome = "";
        this.morada = "";
        this.email = "";
        this.freqCard = 0;
    }

    public abstract String toString();

    public abstract boolean equals(Object o);

    public abstract Utilizador clone();
}
package Model;

import java.io.Serializable;
import java.util.List;

public abstract class Utilizador implements Serializable{

    // Para auto incrementar o ID de utilizador
    private static int nUtilizadorCounter = 1;

    // Variáveis de instância
    private int nUtilizador;
    private String nome;
    private String morada;
    private String email;
    private int freqCard;
    private List<Atividade> atividadesEfetuadas;
    
    // Getters
    public int getNUtilizador() {
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

    public int getnUtilizadorCounter() {
        return nUtilizadorCounter;
    }

    public List<Atividade> getAtividadesEfetuadas() {
        return this.atividadesEfetuadas;
    }

    // Setters
    public void setNUtilizador(int nUtilizador) {
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

    public void setnUtilizadorCounter(int nUtilizadorCounter) {
        Utilizador.nUtilizadorCounter = nUtilizadorCounter;
    }

    public void setAtividades(List<Atividade> atividadesEfetuadas){
        this.atividadesEfetuadas = atividadesEfetuadas;
    }
    
    // Construtores
    public Utilizador(String nome, String morada, String email, int freqCard) {
        this.nUtilizador = nUtilizadorCounter++;
        this.nome = nome;
        this.morada = morada;
        this.email = email;
        this.freqCard = freqCard;
    }

    public Utilizador(int nUtilizador, String nome, String morada, String email, int freqCard) {
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
        this.nUtilizador = 0;
        this.nome = "";
        this.morada = "";
        this.email = "";
        this.freqCard = 0;
    }

    public abstract String toString();

    public abstract boolean equals(Object o);

    public abstract Utilizador clone();

    // método que determine um factor multiplicativo a utilizar no cálculo das calorias
    public abstract double calculoCalorias();
}
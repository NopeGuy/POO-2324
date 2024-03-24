package Model;

public class UtilizadorAmador extends Utilizador{


    // Construtores
    public UtilizadorAmador(String nome, String morada, String email, int freqCard) {
        super(nome, morada, email, freqCard);
    }
    
    public UtilizadorAmador(int uNum, String nome, String morada, String email, int freqCard) {
        super(uNum, nome, morada, email, freqCard);
    }

    public UtilizadorAmador(UtilizadorAmador u) {
        super(u.getNUtilizador() ,u.getNome(), u.getMorada(), u.getEmail(), u.getFreqCard());
    }

    public UtilizadorAmador() {
        super();
    }


    @Override
    public String toString() {
        return "UtilizadorAmador{ " +
                "Nº Utilizador = " + getNUtilizador() +
                ",Nome = " + getNome() +
                ", Email = " + getEmail() +
                ", Morada = " + getMorada() +
                ", Frequência Cardíaca Média = " + getFreqCard() +
                ", Tipo = Amador" +
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
                this.getFreqCard() == u.getFreqCard();
    }

    @Override
    public Utilizador clone() {
        return new UtilizadorAmador(this);
    }

    public double calculoCalorias(){
        return 0;
    }
    
    
}

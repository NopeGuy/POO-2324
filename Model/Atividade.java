package Model;

public abstract class Atividade {
    private int tempoDispendido;
    private Dificuldade dificuldade;

    enum Dificuldade {
        Normal, Hard;
    }

    // Default constructor
    public Atividade() {
        this.tempoDispendido = 0;
        this.dificuldade = null;
    }

    // Constructor with all parameters
    public Atividade(int tempoDispendido, Dificuldade dificuldade) {
        this.tempoDispendido = tempoDispendido;
        this.dificuldade = dificuldade;
    }

    // Copy constructor
    public Atividade(Atividade other) {
        this.tempoDispendido = other.tempoDispendido;
        this.dificuldade = other.dificuldade;
    }

    public int getTempoDispendido() {
        return tempoDispendido;
    }

    public Dificuldade getDificuldade() {
        return dificuldade;
    }

    public void setTempoDispendido(int tempoDispendido) {
        this.tempoDispendido = tempoDispendido;
    }

    public void setDificuldade(Dificuldade dificuldade) {
        this.dificuldade = dificuldade;
    }

    // equals method
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Atividade atividade = (Atividade) o;
        return tempoDispendido == atividade.tempoDispendido &&
                dificuldade == atividade.dificuldade;
    }

    // toString method
    public String toString() {
        return "Atividade{" +
                ", tempoDispendido=" + tempoDispendido +
                ", dificuldade=" + dificuldade +
                '}';
    }

    // clone method
    public abstract Atividade clone();

    public abstract double calculaCaloriasGastas(Utilizador utilizador);
}
package Model;

public class AtividadeRepPesos extends Atividade{
    
    private int tempoDispendido;
    private Atividade.Dificuldade dificuldade;

    // Default constructor
    public AtividadeRepPesos() {
        this.tempoDispendido = 0;
        this.dificuldade = null;
    }

    // Constructor with all parameters
    public AtividadeRepPesos(int tempoDispendido, Atividade.Dificuldade dificuldade) {
        this.tempoDispendido = tempoDispendido;
        this.dificuldade = dificuldade;
    }

    // Copy constructor
    public AtividadeRepPesos(AtividadeRepPesos other) {
        this.tempoDispendido = other.tempoDispendido;
        this.dificuldade = other.dificuldade;
    }

    public int getTempoDispendido() {
        return tempoDispendido;
    }

    public Atividade.Dificuldade getDificuldade() {
        return dificuldade;
    }

    public void setTempoDispendido(int tempoDispendido) {
        this.tempoDispendido = tempoDispendido;
    }

    public void setDificuldade(Atividade.Dificuldade dificuldade) {
        this.dificuldade = dificuldade;
    }

    @Override
    public double calculaCaloriasGastas(Utilizador utilizador) {
        if (utilizador instanceof UtilizadorAmador) {
            switch (this.getDificuldade()) {
                case Normal:
                    return 0.2 * this.getTempoDispendido();
                case Hard:
                    return 0.3 * this.getTempoDispendido();
            }
        } else if (utilizador instanceof UtilizadorOcasional) {
            switch (this.getDificuldade()) {
                case Normal:
                    return 0.25 * this.getTempoDispendido();
                case Hard:
                    return 0.35 * this.getTempoDispendido();
            }
        } else if (utilizador instanceof UtilizadorProfissional) {
            switch (this.getDificuldade()) {
                case Normal:
                    return 0.3 * this.getTempoDispendido();
                case Hard:
                    return 0.4 * this.getTempoDispendido();
            }
        }
        return 0;
    }

    // equals method
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        AtividadeRepPesos atividade = (AtividadeRepPesos) o;
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

    @Override
    public Atividade clone() {
        return new AtividadeRepPesos(this);
    }
}

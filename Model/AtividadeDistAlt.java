package Model;

public class AtividadeDistAlt extends Atividade {

    public enum DistanciaEnum {
        Remo,
        CorridaNaPistaDeAtletismo,
        Patinagem;
    }

    private DistanciaEnum distanciaEnum;

    // Constructors
    public AtividadeDistAlt() {
        super();
        this.distanciaEnum = null;
    }

    public AtividadeDistAlt(int tempoDispendido, Dificuldade dificuldade, DistanciaEnum distanciaEnum) {
        super(tempoDispendido, dificuldade);
        this.distanciaEnum = distanciaEnum;
    }

    public AtividadeDistAlt(AtividadeDistAlt other) {
        super(other);
        this.distanciaEnum = other.distanciaEnum;
    }

    // Getters and Setters
    public DistanciaEnum getDistanciaEnum() {
        return this.distanciaEnum;
    }

    public void setDistanciaEnum(DistanciaEnum distanciaEnum) {
        this.distanciaEnum = distanciaEnum;
    }

    // Override methods
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        if (!super.equals(obj))
            return false;
        AtividadeDistAlt that = (AtividadeDistAlt) obj;
        return distanciaEnum == that.distanciaEnum;
    }

    @Override
    public String toString() {
        return "AtividadeDistAlt{" +
                "distanciaEnum=" + distanciaEnum +
                ", " + super.toString() +
                '}';
    }

    @Override
    public AtividadeDistAlt clone() {
        return new AtividadeDistAlt(this);
    }
}

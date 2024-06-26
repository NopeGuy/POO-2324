package Model.Atividades;

import java.time.LocalDateTime;

import Model.Utilizadores.*;

public class BicicletaDeMontanha extends AtividadeDistAlt{

  // Constructors
  public BicicletaDeMontanha() {
    super();
  }

  public BicicletaDeMontanha(int tempoDispendido, int distancia, int altura) {
    super(tempoDispendido, distancia, altura);
  }

  public BicicletaDeMontanha(BicicletaDeMontanha other) {
    super(other);
  }

  public BicicletaDeMontanha(LocalDateTime datainicio) {
    super(datainicio);
  }

  // Override methods
  @Override
  public float calculaCaloriasGastas(Utilizador utilizador) {
    float tempoEsperado = 1.25f * this.getAltura();
    float tempo;
    if (utilizador instanceof UtilizadorAmador) {
      tempoEsperado += this.getDistancia() * 0.003f;
      if (this.getTempoDispendido() > tempoEsperado) {
        tempo = this.getTempoDispendido();
      } else {
        tempo = tempoEsperado;
      }
      return 2.4f * this.getAltura() + this.getDistancia() / tempo;
    } else if (utilizador instanceof UtilizadorOcasional) {
      tempoEsperado += this.getDistancia() * 0.00285f;
      if (this.getTempoDispendido() > tempoEsperado) {
        tempo = this.getTempoDispendido();
      } else {
        tempo = tempoEsperado;
      }
      return 2.5f * this.getAltura() + this.getDistancia() / tempo;
    } else if (utilizador instanceof UtilizadorProfissional) {
      tempoEsperado += this.getDistancia()* 0.0027f;
      if (this.getTempoDispendido() > tempoEsperado) {
        tempo = this.getTempoDispendido();
      } else {
        tempo = tempoEsperado;
      }
      return 2.7f * this.getAltura() + this.getDistancia() / tempo;
    }
    return 0;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof BicicletaDeMontanha)) {
      return false;
    }
    BicicletaDeMontanha that = (BicicletaDeMontanha) obj;
    return super.equals(that);
  }

  @Override
  public String toString() {
    return "AtividadeDist - Bicicleta de Montanha {" + super.toString() + '}';
  }

  @Override
  public BicicletaDeMontanha clone() {
    return new BicicletaDeMontanha(this);
  }
}

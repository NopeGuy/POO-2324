package Model;

import java.util.Date;
import java.util.List;

public class PlanoTreino{
  private Date dataRealizacao;
  private List<Atividade> atividadesACumprir;
  private int nIteracoes;
  private Utilizador utilizador;

  public PlanoTreino(Date dataRealizacao, List<Atividade> atividadesACumprir, int nIteracoes, Utilizador utilizador){
    this.dataRealizacao = dataRealizacao;
    this.atividadesACumprir = atividadesACumprir;
    this.nIteracoes = nIteracoes;
    this.utilizador = utilizador;
  }

  public PlanoTreino(){
    this.dataRealizacao = new Date();
    this.atividadesACumprir = null;
    this.nIteracoes = 0;
    this.utilizador = null;
  }

  public Date getDataRealizacao(){
    return this.dataRealizacao;
  } 

  public List<Atividade> getAtividadesACumprir(){
    return this.atividadesACumprir;
  }

  public int getNIteracoes(){
    return this.nIteracoes;
  }

  public Utilizador getUtilizador(){
    return this.utilizador;
  }

  public void setDataRealizacao(Date dataRealizacao){
    this.dataRealizacao = dataRealizacao;
  }

  public void setAtividadesACumprir(List<Atividade> atividadesACumprir){
    this.atividadesACumprir = atividadesACumprir;
  }

  public void setNIteracoes(int nIteracoes){
    this.nIteracoes = nIteracoes;
  }

  public void setUtilizador(Utilizador utilizador){
    this.utilizador = utilizador;
  }

  
}

public class Utilizador {

    // Variáveis de instância
    private String nUtilizador;
    private String nome;
    private String morada;
    private String email;
    private String tipoUtilizador;
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

    public String getTipoUtilizador() {
        return this.tipoUtilizador;
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

    public void setTipoUtilizador(String tipoUtilizador) {
        this.tipoUtilizador = tipoUtilizador;
    }

    public void setFreqCard(int freqCard) {
        this.freqCard = freqCard;
    }

    // Construtores
    public Utilizador(String nUtilizador, String nome, String morada, String email, String tipoUtilizador, int freqCard) {
        this.nUtilizador = nUtilizador;
        this.nome = nome;
        this.morada = morada;
        this.email = email;
        this.tipoUtilizador = tipoUtilizador;
        this.freqCard = freqCard;
    }

    public Utilizador(Utilizador u) {
        this.nUtilizador = u.getNUtilizador();
        this.nome = u.getNome();
        this.morada = u.getMorada();
        this.email = u.getEmail();
        this.tipoUtilizador = u.getTipoUtilizador();
        this.freqCard = u.getFreqCard();
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Número do Utilizador: " + this.nUtilizador + "\n");
        sb.append("Nome: " + this.nome + "\n");
        sb.append("Morada: " + this.morada + "\n");
        sb.append("Email: " + this.email + "\n");
        sb.append("Tipo de Utilizador: " + this.tipoUtilizador + "\n");
        sb.append("Frequência cardíaca média: " + this.freqCard + "\n");
        return sb.toString();
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        Utilizador u = (Utilizador) o;
        return (this.nUtilizador.equals(u.getNUtilizador()) && 
            this.nome.equals(u.getNome()) && 
            this.morada.equals(u.getMorada()) && 
            this.email.equals(u.getEmail()) && 
            this.tipoUtilizador.equals(u.getTipoUtilizador()) && 
            this.freqCard == u.getFreqCard());
    }

    public Utilizador clone() {
        return new Utilizador(this);
    }
}
package Models;

public class Alien {
    private String apelido;
    private String raca;
    private int pontosDeVida;
    private int pontosDeForca;
    private String ataque;
    private String habilidade;

    public Alien(String apelido, String raca, int pontosDeVida, int pontosDeForca, String tipoAtaque, String tipoHabilidade) {
        this.apelido = apelido;
        this.raca = raca;
        this.pontosDeVida = pontosDeVida;
        this.pontosDeForca = pontosDeForca;
        this.ataque = tipoAtaque;
        this.habilidade = tipoHabilidade;
    }

    public String getApelido() {
        return apelido;
    }

    public String getRaca() {
        return raca;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public int getPontosDeForca() {
        return pontosDeForca;
    }

    public String getAtaque() {
        return ataque;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public void setPontosDeForca(int pontosDeForca) {
        this.pontosDeForca = pontosDeForca;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public String toString() {
        return ("ALIEN: " + apelido + " RAÇA: " + raca + " PONTOS DE VIDA: " + pontosDeVida + " PONTOS DE FORÇA: " + pontosDeForca + " ATAQUE: " + ataque + " HABILIDADE: " + habilidade);
    }
}


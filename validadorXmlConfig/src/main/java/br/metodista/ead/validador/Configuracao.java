package br.metodista.ead.validador;


public class Configuracao {
    
    private String chave;
    private Integer valor;

    public Configuracao(String chave, Integer valor) {
	this.chave = chave;
	this.valor = valor;
    }

    public Configuracao() {
    }

    public String getChave() {
	return chave;
    }

    public void setChave(String chave) {
	this.chave = chave;
    }

    public Integer getValor() {
	return valor;
    }

    public void setValor(Integer valor) {
	this.valor = valor;
    }
    
    
    
}

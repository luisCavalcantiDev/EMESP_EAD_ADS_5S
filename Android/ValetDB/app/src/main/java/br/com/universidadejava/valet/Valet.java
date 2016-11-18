package br.com.universidadejava.valet;

import java.util.Date;

/**
 * Created by rafaelsakurai on 30/08/15.
 */
public class Valet {
    private Long id;
    private String modelo;
    private String placa;
    private Date entrada;
    private Date saida;
    private double preco;

    public Valet() {

    }

    public Valet(String modelo, String placa, Date entrada) {
        this.modelo = modelo;
        this.placa = placa;
        this.entrada = entrada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

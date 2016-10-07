package valet.capitulo5.livro.valet;

import java.util.Date;

/**
 * Created by luis.pereira on 07/10/2016.
 */

public class Valet {

    private Long id;
    private String modelo;
    private String placa;
    private Date entrada;
    private Date saida;
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Date getSaida() {

        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public Date getEntrada() {

        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public String getPlaca() {

        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {

        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

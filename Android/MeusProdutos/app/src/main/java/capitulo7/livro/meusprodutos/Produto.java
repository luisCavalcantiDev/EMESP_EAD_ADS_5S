package capitulo7.livro.meusprodutos;

public class Produto {

    private String _id;
    private String nome;
    private String imagem;
    private Double preco;
    private int quantidade;

    public Produto(String nome, String imagem, Double preco) {
        this.nome = nome;
        this.imagem = imagem;
        this.preco = preco;
    }

    public Produto(String id, String nome, String imagem, Double preco) {
        this._id = id;
        this.nome = nome;
        this.imagem = imagem;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecoTotal() {
        return preco * quantidade;
    }
}

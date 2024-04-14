package lojadedepartamentos;

public class Produto extends Estoque {
    private static int id = 1;
    private int codProduto;
    private String descricao;
    private double precoVenda;

    public Produto() {

    }

    public Produto(String descricao,double precoVenda)throws PrecoInvalidoException {
        if (precoVenda <= 0) {
            throw new PrecoInvalidoException("O preço de venda do produto não pode ser negativo ou igual a zero.");
        }
        this.codProduto = id;
        this.descricao = descricao;
        this.precoVenda = precoVenda;
        id++;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) throws PrecoInvalidoException {
        if (precoVenda <= 0) {
            throw new PrecoInvalidoException("O preço de venda do produto não pode ser negativo ou igual a zero.");
        }
        this.precoVenda = precoVenda;
    }

    public Integer getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Integer codProduto) {
        this.codProduto = codProduto;
    }

    @Override
    public String toString() {
        return "Código do Produto: "
                + codProduto
                + ", Descrição: "
                + descricao
                + ", Preço de Venda: R$"
                + precoVenda;
    }
}

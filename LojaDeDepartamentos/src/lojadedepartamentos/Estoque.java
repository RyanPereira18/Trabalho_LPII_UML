package lojadedepartamentos;

public class Estoque extends Fornecedor{
    private static int id = 1;
    private int codEstoque;
    private String produtoEmEstoque;
    private double quantidade;

    
    public Estoque() {
        
    }

    public Estoque(String produtoEmEstoque, double quantidade) {
        this.codEstoque = id;
        this.produtoEmEstoque = produtoEmEstoque;
        this.quantidade = quantidade;
        id++;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getCodEstoque() {
        return codEstoque;
    }
    
    
    @Override
    public String toString() {
        return "Estoque: " 
                + "Código Estoque: " 
                + codEstoque 
                + ", Produto: " 
                + produtoEmEstoque 
                + ", Quantidade: " 
                + quantidade;
                
    }
}


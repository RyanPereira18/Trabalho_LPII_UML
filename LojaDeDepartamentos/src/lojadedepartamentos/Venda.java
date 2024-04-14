package lojadedepartamentos;

public class Venda extends Produto {
    private static int id = 1;
    private int codVenda;
    private Cliente cliente;
    private Funcionario funcionario;
    private double valorTotalVenda;
    private String dataVenda;

    public Venda() {
        
    }

    public Venda(int codVenda, Cliente cliente, Funcionario funcionario, double valorTotalVenda, String dataVenda) {
        this.codVenda = id;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.valorTotalVenda = valorTotalVenda;
        this.dataVenda = dataVenda;
        id++;
    }

    public int getCodVenda() {
        return codVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    
    @Override
    public String toString() {
        return "Venda:"
                + " Código de Venda: " 
                + codVenda 
                + ", Cliente: " 
                + cliente.getNome() 
                + ", Funcionário: " 
                + funcionario.getNome()
                + ", Valor Venda: "
                + valorTotalVenda 
                + ", Data Venda: " 
                + dataVenda;
    }
}
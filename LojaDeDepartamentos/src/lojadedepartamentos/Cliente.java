package lojadedepartamentos;

public class Cliente extends Pessoa {
    private static int id = 1;
    private int codCliente;
    private String dataNascimento;
    private String telefone;
    private String endereco;
    
     
    public Cliente(String dataNascimento, String telefone, String endereco, String nome, String cpf) {
        super(nome, cpf);
        this.codCliente = id;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
        id++;
    }

    

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    @Override
    public String toString() {
        return "Código do Cliente: "
                + codCliente
                + ", Nome: "
                + getNome()
                + ", CPF: "
                + getCpf()
                + ", Data de nascimento: "
                + dataNascimento
                + ", Telefone: "
                + telefone
                + ", Endereço: "
                + endereco;
    }
}

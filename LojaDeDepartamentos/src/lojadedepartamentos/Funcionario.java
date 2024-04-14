package lojadedepartamentos;

public class Funcionario extends Pessoa implements Bonificavel{
    private static int id = 1;
    private int codFuncionario;
    private String dataAdmissao;
    private String cargo;
    private double salario;
    

    public Funcionario(String nome, String cpf, String dataAdmissao, String cargo, double salario) {
        super(nome, cpf);
        this.codFuncionario = id;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
        this.salario = salario;
        id++;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void bonifica(double aumento){
       this.salario = salario + aumento;
    }

    
    @Override
    public String toString() {
        return "Código do Funcionário: "
                + codFuncionario
                + ", Nome: "
                + getNome()
                + ", CPF: "
                + getCpf()
                + ", Data de Admissão: "
                + dataAdmissao
                + ", Cargo: "
                + cargo
                + ", Salário: R$"
                + salario;
    }
}
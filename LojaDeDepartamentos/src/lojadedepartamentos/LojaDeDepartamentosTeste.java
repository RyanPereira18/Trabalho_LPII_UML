
package lojadedepartamentos;

import java.util.Scanner;


public class LojaDeDepartamentosTeste {

    public static void main(String[] args) throws PrecoInvalidoException {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente =sc.nextLine();
        System.out.println("Digite o cpf do cliente : ");
        String cpfCliente =sc.nextLine();
        System.out.println("Digite a data de nascimento (dd/mm/aaaa) do cliente: ");
        String dataNascCliente =sc.nextLine();
        System.out.println("Digite o telefone do cliente: ");
        String telefoneCliente = sc.nextLine();
        System.out.println("Digite o endereco do cliente: ");
        String enderecoCliente =sc.nextLine();
        
        Cliente cliente1 = new Cliente(nomeCliente, cpfCliente, dataNascCliente, telefoneCliente, enderecoCliente);
        
        System.out.println("Digite o nome do funcionario: ");
        String nomeFuncionario =sc.nextLine();
        System.out.println("Digite o cpf do funcionario:");
        String cpfFuncionario = sc.nextLine();
        System.out.println("Digite a Data de Admissão do funcionario: ");
        String dataAdmissaoFuncionario = sc.nextLine();
        System.out.println("Digite o cargo do funcionario:");
        String cargoFuncionario = sc.nextLine();
        System.out.println("Digite salario do funcionario: ");
        double salarioFuncionario = sc.nextDouble();
        
        Funcionario funcionario1 = new Funcionario(nomeFuncionario, cpfFuncionario, dataAdmissaoFuncionario, cargoFuncionario, salarioFuncionario);
        
        sc.nextLine();
        System.out.println("Digite a descricao do produto:");
        String descricao = sc.nextLine();
        System.out.println("Digite o preco do produto:");
        double precoVenda = sc.nextDouble();
        
        Produto produto1 = new Produto(descricao, precoVenda);
        
        sc.nextLine();
        System.out.println("Digite o produto em estoque: ");
        String produtoEstoque = sc.nextLine();
        System.out.println("Digite a quantidade de produtos: ");
        double QuantidadeDeProdutos = sc.nextDouble();
        
        Estoque estoque1 = new Estoque(produtoEstoque, QuantidadeDeProdutos);
        
        sc.nextLine();
        System.out.println("Digite o nome do fornecedor: ");
        String nomeFornecedor = sc.nextLine();
        System.out.println("Digite o cnpj do fornecedor: ");
        String cnpjFornecedor = sc.nextLine();
        System.out.println("Digite o endereco do fornecedor: ");
        String enderecoFornecedor = sc.nextLine();
        System.out.println("Digite o telefone do fornecedor: ");
        String telefoneFornecedor = sc.nextLine();
        
        Fornecedor fornecedor1 = new Fornecedor(nomeFornecedor, cnpjFornecedor, enderecoFornecedor, telefoneFornecedor);
        
        sc.nextLine();
        System.out.println("Informações do Cliente:");
        System.out.println(cliente1.toString());
        System.out.println("Informaçoes do funcionario: ");
        System.out.println(funcionario1.toString());
        System.out.println("Informacoes do produto:");
        System.out.println(produto1.toString());
        System.out.println("Informacoes do estoque:");
        System.out.println(estoque1.toString());
        System.out.println("Informacoes do fornecedor:");
        System.out.println(fornecedor1.toString());
        
    }
}

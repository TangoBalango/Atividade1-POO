public class Funcionario{
    private int codigo;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private int idade;
    private float salario;


public Funcionario(int codigo, String nome, String cpf, String endereco, String telefone, int idade, float salario) {

   this.codigo = codigo;
   this.nome = nome;
   this.cpf = cpf;
   this.endereco = endereco;
   this.telefone = telefone;
   this.idade = idade;
   this.salario = salario;

}
 
public int getcodigo(){
    return codigo;
 }
 public String getNome() {
    return nome;
}

public String getCpf() {
    return cpf;
}

public String getEndereco() {
    return endereco;
}

public String getTelefone() {
    return telefone;
}

public int getIdade() {
    return idade;
}

public float getSalario() {
    return salario;
}

public void setCodigo(int codigo) {
    this.codigo = codigo;
}

public void setNome(String nome) {
    this.nome = nome;
}

public void setCpf(String cpf) {
    this.cpf = cpf;
}

public void setEndereco(String endereco) {
    this.endereco = endereco;
}

public void setTelefone(String telefone) {
    this.telefone = telefone;
}

public void setIdade(int idade) {
    this.idade = idade;
}

public void setSalario(float salario) {
    this.salario = salario;
}

public float calculaSalarioLiquido(){
    return salario * 0.89f;
}

public String toString(){
    return String.format(
        "\n=== DADOS DO FUNCIONÁRIO ===\n" +
            "Código: %d\n" +
            "Nome: %s\n" +
            "CPF: %s\n" +
            "Endereço: %s\n" +
            "Telefone: %s\n" +
            "Idade: %d\n" +
            "Salário Bruto: R$%.2f\n" +
            "Salário Líquido: R$%.2f\n" +
            "============================",
            codigo, nome, cpf, endereco, telefone, idade, salario, calculaSalarioLiquido()
        );
}




}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um funcionário inicial
        Funcionario funcionario = new Funcionario(
            1, 
            "batata frita", 
            "123.456.789-00", 
            "Rua das palmeiras, 666", 
            "(11) 12345-6789", 
            30, 
            5000.00f
        );

        // Mostrando dados iniciais
        System.out.println("=== DADOS INICIAIS DO FUNCIONÁRIO ===");
        System.out.println(funcionario);

        // Solicitando novo salário
        System.out.print("\nDigite o novo salário do funcionário: ");
        float novoSalario = scanner.nextFloat();
        funcionario.setSalario(novoSalario);

        // Mostrando dados atualizados
        System.out.println("\n=== DADOS ATUALIZADOS DO FUNCIONÁRIO ===");
        System.out.println(funcionario);

        scanner.close();
    }
}
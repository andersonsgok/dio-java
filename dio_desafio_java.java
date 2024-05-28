import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;

        try {
            // Solicitar o número da conta
            System.out.println("Por favor, digite o número da conta:");
            numero = Integer.parseInt(scanner.nextLine());

            // Solicitar a agência
            System.out.println("Por favor, digite o número da Agência:");
            agencia = scanner.nextLine();

            // Solicitar o nome do cliente
            System.out.println("Por favor, digite o nome do cliente:");
            nomeCliente = scanner.nextLine();

            // Solicitar o saldo
            System.out.println("Por favor, digite o saldo inicial:");
            saldo = Double.parseDouble(scanner.nextLine());
            
            // Exibir mensagem final
            String mensagem = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo);
            System.out.println(mensagem);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira valores numéricos corretos.");
        } catch (Exception e) {
            System.out.println("Erro: Ocorreu um problema inesperado. " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

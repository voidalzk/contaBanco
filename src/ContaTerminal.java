import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada com sucesso
        //Exibir os dados da conta criada: número, agência, nome do cliente e saldo
        //Exibir a mensagem "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem-vindo ao ByteBank!");

        System.out.println("Por favor, digite o número da conta: ");
        Integer numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        Double saldo;
        try {
            saldo = scanner.nextDouble();
        }  catch (Exception e) {
            System.out.println("Valor inválido para o saldo. Iniciando com valor 00.00.");
            saldo = 0.00; 
        }

        System.out.println("Conta criada com sucesso!");
    
        System.out.println("Dados da conta criada:");
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Saldo: " + saldo);

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        scanner.close();
    }
}

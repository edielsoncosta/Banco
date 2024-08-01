import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("nome do banco: ");
        String nomeBanco = sc.nextLine();
        System.out.println("\n");
        System.out.println("Cadastro " + nomeBanco);
        System.out.print("Usuário: ");
        String nomeUsuario = sc.nextLine();
        System.out.print("CPF: ");
        String cpfUsuario = sc.nextLine();
        System.out.print("ID: ");
        String idUsuario = sc.nextLine();

        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();

        Banco cliente = new Cliente(saldo);
        Cliente dadosCliente = new Cliente(saldo, nomeUsuario, cpfUsuario, idUsuario);

        System.out.print("Gostaria de fazer saque (yes/no)? ");
        String decisaoSaque = sc.next().toUpperCase();

        if (decisaoSaque.equals("YES")){
            System.out.print("valor do saque: R$");
            double saque = sc.nextDouble();

            // lógica para não fazer saque maior que saldo

            while (saque > saldo) {
                System.out.println("Valor do saque maior que seu saldo!");
                System.out.print("seu saldo é de: R$" + saldo + ", valor do saque: ");
                saque = sc.nextDouble();
                cliente.saque(saque);
            }
            cliente.saque(saque);
        }
        System.out.print("Gostaria de fazer depósito (yes/no): ");
        String decisaoDeposito = sc.next().toUpperCase();
        if (decisaoDeposito.equals("YES")){
            System.out.print("valor do depósito: R$");
            double deposito = sc.nextDouble();
            cliente.deposito(deposito);
        }

        System.out.println(dadosCliente + cliente.printDetails());

        System.out.print("tem conta empresarial(yes/no): ");
        String decisaoContaEmpresarial = sc.next().toUpperCase();

        sc.nextLine();

        if (decisaoContaEmpresarial.equals("YES")) {
            System.out.print("nome da empresa: ");
            String nomeEmpresa = sc.nextLine();
            System.out.print("CNPJ: ");
            String cnpj = sc.next();

            System.out.print("saldo atual da empresa: R$");
            double saldoEmpresa = sc.nextDouble();

            Banco clienteEmpresarial = new ClienteEE(saldoEmpresa, cnpj);

            System.out.print("quer fazer depósito, taxa(5R$) (yes/no)? ");
            String decisaoDepositoEmpresa = sc.next().toUpperCase();

            if (decisaoDepositoEmpresa.equals("YES")) {
                System.out.print("valor deposito: ");
                double depositoEmpresa = sc.nextDouble();
                clienteEmpresarial.deposito(depositoEmpresa);
            }
            System.out.print("quer fazer saque taxa(R$5)? ");
            String decisaoSaqueEmpresarial = sc.next().toUpperCase();

            if (decisaoSaqueEmpresarial.equals("YES")) {
                System.out.print("valor do saque: ");
                double saqueEmpresarial = sc.nextDouble();
                while (saqueEmpresarial > saldoEmpresa) {
                    System.out.println("valor acima do saldo da empresa, saldo atual: R$" + saldoEmpresa);
                    System.out.print("valor do saque: ");
                    saqueEmpresarial = sc.nextDouble();
                    clienteEmpresarial.saque(saqueEmpresarial);
                }
                clienteEmpresarial.saque(saqueEmpresarial);

            }
            System.out.print(clienteEmpresarial);
        }
        sc.close();
    }
}
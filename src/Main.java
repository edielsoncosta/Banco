import java.util.Date;
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

        Banco banco = new Banco(saldo);
        Banco cliente = new Cliente(saldo);

        System.out.println("quer fazer saque (yes/no)? ");
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
            System.out.print("Gostaria de fazer depósito (yes/no): ");
            String decisaoDeposito = sc.next().toUpperCase();
            if (decisaoDeposito.equals("YES")){
                System.out.print("valor do depósito: R$");
                double deposito = sc.nextDouble();
                cliente.deposito(deposito);
            }
        }

        System.out.println(cliente.printDetails());
        sc.close();
    }
}
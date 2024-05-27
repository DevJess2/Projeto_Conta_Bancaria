import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String Agencia, Nome_Cliente;
		int Numero;
		double Saldo;
		
		System.out.println("Por favor, informar os dados abaixo:");
		
		System.out.print("\nNome: ");
		Nome_Cliente = sc.nextLine();
		
		System.out.print("Agência: ");
		Agencia = sc.nextLine();
		
		System.out.print("Número: ");
		Numero = sc.nextInt();
		
		System.out.print("Saldo: R$ ");
		Saldo = sc.nextDouble();
		
		System.out.printf("\nOlá " + Nome_Cliente + ", obrigado por criar uma conta em nosso banco, sua Agência é " + Agencia + ", Conta " + Numero);
		System.out.printf(" e seu Saldo de R$ %.2f.", Saldo);
		System.out.printf(" já está disponível.");
		
		sc.close();
	}	   
}

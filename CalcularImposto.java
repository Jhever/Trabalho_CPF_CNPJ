package receitaFederal;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	public class CalcularImposto {
	    public static void main(String[] args) {
	        List<Contribuinte> contribuintes = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);

	        for (int i = 0; i < 6; i++) {
	            System.out.println("Informe o nome do contribuinte " + (i + 1) + ":");
	            String nome = scanner.nextLine();

	            System.out.println("Informe a renda bruta do contribuinte " + (i + 1) + ":");
	            double rendaBruta = scanner.nextDouble();
	            scanner.nextLine(); // Limpar o buffer

	            System.out.println("Informe o CPF ou CNPJ:");
	            String cpfCnpj = scanner.nextLine();
	            
	            if (cpfCnpj.length() == 11) { // Verifica se é CPF
	                contribuintes.add(new PessoaFisica(nome, rendaBruta, cpfCnpj));
	            } else if (cpfCnpj.length() == 14) { // Verifica se é CNPJ
	                contribuintes.add(new PessoaJuridica(nome, rendaBruta, cpfCnpj));
	            } else {
	                System.out.println("CPF ou CNPJ inválido. Contribuinte não adicionado.");
	            }
	        }

	        System.out.println("Impostos a pagar:");
	        for (Contribuinte contribuinte : contribuintes) {
	            double imposto = contribuinte.calcularImposto();
	            System.out.println(contribuinte.toString() + ", Imposto a pagar: " + imposto);
	        }
	    }
	}

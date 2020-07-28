package aplicacao;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

import objetos.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Funcionario> lista_funcionarios = new ArrayList<>();
		System.out.println("Quantos funcion�rios ser�o registrados? ");
		int numero_fucionarios = sc.nextInt();
		System.out.println();

		for (int i = 0; i < numero_fucionarios; i++) {

			System.out.println("Funcion�rio " + (i + 1) + ":");
			System.out.println("ID: ");
			Integer id = sc.nextInt();

			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.println("Sal�rio");
			Double salario = sc.nextDouble();

			Funcionario fulano = new Funcionario(id, nome, salario);

			lista_funcionarios.add(fulano);
		}

		System.out.println("Insira o ID do funcion�rio que ter� o sal�rio aumentado: ");

		int id_aumento_salario = sc.nextInt();

		Funcionario emp = lista_funcionarios.stream().filter(x -> x.getId() == id_aumento_salario).findFirst()
				.orElse(null);

		if (emp == null) {
			System.out.println("O ID digitado � nulo");
		}

		else {
			System.out.print("Digite o percentual do aumento que o funcion�rio ir� receber: ");
			double perc_aumento = sc.nextDouble();

			emp.incremento_salario(perc_aumento);
		}

		sc.close();
	}
	
}
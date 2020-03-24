package br.fai.aula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.start();
	}

	Scanner scanner = new Scanner(System.in);

	Cavalo cavalo = new Cavalo();

	Girafa girafa = new Girafa();

	// static List<Animal> listaDeAnimais = new ArrayList<Animal>();
	static List<Cavalo> listaDeCavalo = new ArrayList<Cavalo>();

	private void start() {

		// Cavalo cavalo = new Cavalo();

		// Girafa girafa = new Girafa();

		// List<Animal> listaDeAnimais = new ArrayList<Animal>();
		// static List<Cavalo> listaDeCavalo = new ArrayList<Cavalo>();

		int opcao = 0;

		do {
			System.out.println("1. Cadastrar cavalo");
			System.out.println("2. Cadastrar girafa");
			System.out.println("3. Listar cavalos");
			System.out.println("4. Listar girafas");
			System.out.println("5. Listar todos os animais");
			System.out.println("6. remover um animal por id");
			System.out.println("7. Exibir a quantidade de animais cadastrados por tipo");
			System.out.println("8. Sair");
			System.out.println(" ");
			System.out.println("Opção: ");

			opcao = scanner.nextInt();

			switch (opcao) {

			case 1:
				cadastrarCavalo();
				// listaDeCavalo.add();

				System.out.println("O cavalo foi inserido com sucesso!");
				System.out.println(" ");
				break;

			case 2:

				break;

			case 3:
				for (Cavalo animal : listaDeCavalo) {

					
					System.out.println("Dados do cavalo: " + animal.getId() + "|" + animal.getNome());
					System.out.println("");

				}
			case 4:
				break;

			}

		} while (opcao != 8);
	}

	public void cadastrarCavalo() {

		System.out.println("Id do cavalo: ");
		cavalo.id = scanner.nextInt();

		System.out.println("Nome do cavalo: ");
		cavalo.setNome(scanner.next());
		listaDeCavalo.add(cavalo);

	}

	public void cadastrarGirafa() {

		System.out.println("Id do girafa: ");
		girafa.id = scanner.nextInt();

		System.out.println("Nome do girafa: ");
		girafa.nome = scanner.next();

	}

}

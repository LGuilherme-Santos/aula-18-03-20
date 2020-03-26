package br.fai.aula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.start();
	}

	Scanner scanner = new Scanner(System.in);

	Cavalo c1 = new Cavalo("Marchador", 123);
	Cavalo c2 = new Cavalo("Manga larga", 456489);
	Cavalo c3 = new Cavalo("DUck", 65412);

	Girafa g1 = new Girafa("Gorda", 15896);
	Girafa g2 = new Girafa("Magra", 6556);
	Girafa g3 = new Girafa("Pescoçuda", 56431);

	List<Animal> listaDeAnimais = new ArrayList<Animal>();
	List<Cavalo> listaDeCavalo = new ArrayList<Cavalo>();
	List<Girafa> listaDeGirafa = new ArrayList<>();

	private void start() {

		// Cavalo cavalo = new Cavalo();

		// Girafa girafa = new Girafa();

		// List<Animal> listaDeAnimais = new ArrayList<Animal>();
		// static List<Cavalo> listaDeCavalo = new ArrayList<Cavalo>();

		int opcao = 0;

		System.out.println("INICIO");

		do {
			System.out.println(" ");
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

				break;

			case 2:
				cadastrarGirafa();

				break;

			case 3:
				listarCavalos();

				break;

			case 4:
				listarGirafas();
				break;

			case 5:
				listarAnimais();

				break;

			case 6:
				removerAnimal();

				break;

			case 7:
				listarTamanhoDaLista();

				break;
				
			case 8:
				System.out.println("Saindo.....");

			}

		} while (opcao != 8);

	}

	public void cadastrarCavalo() {

		listaDeCavalo.add(c1);
		listaDeCavalo.add(c2);
		listaDeCavalo.add(c3);

		listaDeAnimais.add(c1);
		listaDeAnimais.add(c2);
		listaDeAnimais.add(c3);

		System.out.println("O cavalo foi inserido com sucesso!");
		System.out.println(" ");

	}

	public void cadastrarGirafa() {

		listaDeGirafa.add(g1);
		listaDeGirafa.add(g2);
		listaDeGirafa.add(g3);

		listaDeAnimais.add(g1);
		listaDeAnimais.add(g2);
		listaDeAnimais.add(g3);

		System.out.println("A girafa foi inserido com sucesso!");
		System.out.println(" ");

	}

	public void listarCavalos() {
		for (Animal animal : listaDeCavalo) {

			System.out.println("Dados do cavalo: " + animal);

		}
	}

	public void listarGirafas() {
		for (Animal animal : listaDeGirafa) {

			System.out.println("Dados da girafa: " + animal);

		}
	}

	private void listarAnimais() {
		for (Animal animais : listaDeAnimais) {
			if (animais instanceof Cavalo) {
				Cavalo c = (Cavalo) animais;
				System.out.println("Dados do animal: " + c.getTipo() + animais);
			} else if (animais instanceof Girafa) {
				Girafa g = (Girafa) animais;
				System.out.println("Dados do animal: " + g.getTipo() + animais);
			}

		}
	}

	private void removerAnimal() {
		for (Animal animal : listaDeAnimais) {
			Animal a = (Animal) animal;
			System.out.println("Id do animal: ");
			a.id = scanner.nextInt();
			listaDeAnimais.remove(a);

		}

	}

	private void listarTamanhoDaLista() {
		System.out.println(" ");
		System.out.println("Numero de cavalos cadastrados: " + listaDeCavalo.size());
		for (Animal animal : listaDeCavalo) {

			System.out.println("Dados do cavalo: " + animal);

		}
		System.out.println(" ");
		System.out.println("Numero de girafas cadastradas: " + listaDeGirafa.size());
		for (Animal animal : listaDeGirafa) {

			System.out.println("Dados da girafa: " + animal);

		}
		System.out.println(" ");
		System.out.println("Total de animais cadastrados: " + listaDeAnimais.size());
	}

}

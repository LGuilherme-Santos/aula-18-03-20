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
	

	private void start() {
		
		
		Cavalo cavalo = new Cavalo();
		
		Girafa girafa = new Girafa();
		
		List<Animal> listaDeAnimais = new ArrayList<Animal>();
		//List<Girafa> listaDeGirafas = new ArrayList<Girafa>();
		
		int opcao = 0;
		
		do {
			
			System.out.println("1. Cadastrar cavalo");
			System.out.println("2. Cadastrar girafa");
			System.out.println("3. Listar cavalos");
			System.out.println("4. Listar girafas");
			System.out.println("5. Listar todos os animais");
			System.out.println("6. remover umanimal por id");
			System.out.println("7. Exibir a quantidade de animais cadastrados por tipo");
			System.out.println("8. Sair");
			System.out.println(" ");
			System.out.println("Opção: ");
			
			opcao = scanner.nextInt();
			
			switch(opcao) {
			
			case 1: cadastrarCavalo();
			}
			
		}while(opcao == 8);
		
		
	}

	public void cadastrarCavalo() {
		
		
		System.out.println("Id do cavalo: ");
		scanner.nextInt();
		System.out.println("Nome do cavalo: ");
		scanner.hasNext();
				
	}

}

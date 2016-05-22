package br.com.k19.jpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AdicionaLivroAutor {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("livraria-pu");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Scanner entrada = new Scanner(System.in);
		Autor a1 = new Autor();
		System.out.println("Digite o nome do autor: ");
		a1.setNome(entrada.nextLine());
		Autor a2 = new Autor();
		System.out.println("Digite o nome do autor: ");
		a2.setNome(entrada.nextLine());
		Livro l = new Livro();
		System.out.println("Digite o nome do Livro: ");
		l.setNome(entrada.nextLine());
		l.getAutores().add(a1);
		l.getAutores().add(a2);
		entrada.close();
		manager.persist(a1);
		manager.persist(a2);
		manager.persist(l);
		System.out.println("Autor1 cadastrado com id: " + a1.getId());
		System.out.println("Autor2 cadastrado com id: " + a2.getId());
		System.out.println("Livro cadastrado com id: " + l.getId());
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
	
}

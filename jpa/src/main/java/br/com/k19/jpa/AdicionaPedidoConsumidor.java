package br.com.k19.jpa;

import java.util.Calendar;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AdicionaPedidoConsumidor {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("livraria-pu");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Scanner entrada = new Scanner(System.in);
		int i = 0;
		while (i < 10) {
			Consumidor c = new Consumidor();
			System.out.println("Digite o nome do consumidor: ");
			c.setNome(entrada.nextLine());
			Pedido p = new Pedido();
			p.setData(Calendar.getInstance());
			p.setConsumidor(c);
			manager.persist(c);
			manager.persist(p);
			System.out.println("Consumidor cadastrado com id " + c.getId());
			System.out.println("Pedido cadastrado com id " + p.getId());
			i++;
		}
		entrada.close();
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		
	}
	
}

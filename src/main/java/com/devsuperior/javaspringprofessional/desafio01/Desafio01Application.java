package com.devsuperior.javaspringprofessional.desafio01;

import com.devsuperior.javaspringprofessional.desafio01.entities.Order;
import com.devsuperior.javaspringprofessional.desafio01.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(2282, 800.00, 10.0);
		double total = orderService.total(order);
		System.out.printf("Pedido código %d%nValor total: R$ %.2f%n", order.getCode(), total);
	}
}

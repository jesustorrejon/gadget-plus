package com.debuggeandoideas.gadget_plus;


import com.debuggeandoideas.gadget_plus.entities.BillEntity;
import com.debuggeandoideas.gadget_plus.entities.OrderEntity;
import com.debuggeandoideas.gadget_plus.entities.ProductEntity;
import com.debuggeandoideas.gadget_plus.repositories.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.debuggeandoideas.gadget_plus.repositories.OrderRepository;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class GadgetPlusApplication implements CommandLineRunner {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private BillRepository billRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(GadgetPlusApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
//		this.billRepository.findAll().forEach(bill -> System.out.println(bill.toString()));
//		this.orderRepository.findAll().forEach(orderEntity -> System.out.println(orderEntity.toString()));
//
//		var bill = BillEntity.builder()
//				.rfc("AS537GD7DF")
//				.totalAmount(BigDecimal.TEN)
//				.id("b-17")
//				.build();
//
//		var order = OrderEntity.builder()
//				.CreatedAt(LocalDateTime.now())
//				.clientName("Alex Pereira")
//				.bill(bill)
//				.build();
//
//		this.orderRepository.save(order);

//		var order = this.orderRepository.findById(17L).get();

//		System.out.println("Pre persist: " + order.getClientName());
//		order.setClientName("Michael Pereira");
//
//		order.getBill().setRfc("AAAA1111");
//		this.orderRepository.save(order);
//
//		var order2 = this.orderRepository.findById(17L).get();
//		System.out.println("Post persist: " + order2.getClientName());

		var order = this.orderRepository.findById(17L).get();

		this.orderRepository.delete(order);

		 */

		var order = this.orderRepository.findById(1L).orElseThrow();

		/*var product1 = ProductEntity.builder().quantity(BigInteger.ONE).build();
		var product2 = ProductEntity.builder().quantity(BigInteger.TWO).build();
		var product3 = ProductEntity.builder().quantity(BigInteger.TEN).build();

		var products = List.of(product1, product2);

		order.setProducts(products);

		products.forEach(p -> p.setOrder(order));
		 */

		// Remover el primer producto de la lista
		order.getProducts().removeFirst();

		this.orderRepository.save(order);
	}

}

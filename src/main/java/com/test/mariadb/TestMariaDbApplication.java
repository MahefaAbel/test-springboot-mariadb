package com.test.mariadb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestMariaDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestMariaDbApplication.class, args);
	}

	  @Bean
	  public CommandLineRunner demoBla(PaymentRepository repository) {
	    return (args) -> {
	    	System.out.print("===========demoBla===========");
	      // save a few customers
		  repository.save(new Payment(1, "Jack", PaymentStatus.ATTENTE.toString()));
		  repository.save(new Payment(2, "Chloe", PaymentStatus.ATTENTE.toString()));
		  repository.save(new Payment(3, "Kim", PaymentStatus.VALIDER.toString()));
		
//		  // fetch all customers
//		  log.info("Customers found with findAll():");
//		  log.info("-------------------------------");
		  for (Payment p : repository.findAll()) {
		    System.out.print(p.toString());
		    System.out.print("\n");
		  }
//		  log.info("");
//		
//		  // fetch an individual customer by ID
//		  Customer customer = repository.findById(1L);
//		  log.info("Customer found with findById(1L):");
//		  log.info("--------------------------------");
//		  log.info(customer.toString());
//		  log.info("");
//		
//		  // fetch customers by last name
//		  log.info("Customer found with findByLastName('Bauer'):");
//		  log.info("--------------------------------------------");
//		  repository.findByLastName("Bauer").forEach(bauer -> {
//		    log.info(bauer.toString());
//		  });
//		  // for (Customer bauer : repository.findByLastName("Bauer")) {
//		  //  log.info(bauer.toString());
//		  // }
//		  log.info("");
	    };
	  }

	  @Bean
	  public CommandLineRunner demoBlo(PaymentRepository repository) {
	    return (args) -> {
//		  // fetch all customers
	    	System.out.print("===========demoBlo===========");
			  for (Payment p : repository.findByDescr("Chloe")) {
			    System.out.print(p.toString());
			    System.out.print("\n");
			  }
	    };
	  }
}

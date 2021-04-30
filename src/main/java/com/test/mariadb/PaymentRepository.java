package com.test.mariadb;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

//public class PaymentRepository {
//
//}

public interface PaymentRepository extends CrudRepository<Payment, Integer> {
	List<Payment> findByStatus(PaymentStatus status);
	List<Payment> findByDescr(String descr);
}
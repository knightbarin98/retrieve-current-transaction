package com.mrbarin.microservicios.retrievecurrenttransaction.api.dao;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.mrbarin.microservicios.retrievecurrenttransaction.api.entity.Transaction;

public interface TransactionDAO extends MongoRepository<Transaction, String>{
	
	@Query("{ 'customerId' : ?0, 'date' : { $gt: ?1, $lt: ?2 } }")
	List<Transaction> findTransactionsByCustomerIdAndDateBetween(Integer customerId,String  transactionDateStart, String  transactionDateEnd);
}

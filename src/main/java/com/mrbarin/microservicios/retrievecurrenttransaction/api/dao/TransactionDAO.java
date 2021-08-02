package com.mrbarin.microservicios.retrievecurrenttransaction.api.dao;


import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.mrbarin.microservicios.retrievecurrenttransaction.api.entity.Transaction;

@Document(collection = "Transactions")
public interface TransactionDAO extends MongoRepository<Transaction, String>{
	
	@Query("{ 'customerId' : ?0, 'date' : { $regex: ?1} }")
	List<Transaction> findTransactionsByCustomerIdAndDateBetween(Integer customerId,String  regex);
	
	@Query("{ 'customerId' : ?0 }")
	List<Transaction> findByCustomerId(Integer customerId);
}

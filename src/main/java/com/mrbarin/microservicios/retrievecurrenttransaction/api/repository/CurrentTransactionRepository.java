package com.mrbarin.microservicios.retrievecurrenttransaction.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mrbarin.microservicios.retrievecurrenttransaction.api.dao.TransactionDAO;
import com.mrbarin.microservicios.retrievecurrenttransaction.api.dto.request.RequestCurrentTransaction;
import com.mrbarin.microservicios.retrievecurrenttransaction.api.dto.response.TransactionsResponse;
import com.mrbarin.microservicios.retrievecurrenttransaction.api.entity.Transaction;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class CurrentTransactionRepository {
	
	@Autowired
	private TransactionDAO dao;
	
	
	public Optional<TransactionsResponse> search(RequestCurrentTransaction request){
		log.info("Repository run method for customer´s transactions search");
		//List<Transaction> transactions = dao.findTransactionsByCustomerIdAndDateBetween(request.getCustomerId(),buildRegex(request.getTransactionDateStart(), request.getTransactionDateEnd()));
		List<Transaction> transactions = dao.findByCustomerId(request.getCustomerId());
		log.info(transactions.toString());
		return Optional.of(new TransactionsResponse(transactions));
	}
	
	public String buildRegex(String dateStart, String dateEnd) {
		StringBuilder builder = new StringBuilder();
		
		return null;
	}
}

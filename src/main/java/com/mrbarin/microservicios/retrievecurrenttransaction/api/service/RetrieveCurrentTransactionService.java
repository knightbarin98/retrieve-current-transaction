package com.mrbarin.microservicios.retrievecurrenttransaction.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrbarin.microservicios.retrievecurrenttransaction.api.dto.request.RequestCurrentTransaction;
import com.mrbarin.microservicios.retrievecurrenttransaction.api.dto.response.TransactionsResponse;
import com.mrbarin.microservicios.retrievecurrenttransaction.api.repository.CurrentTransactionRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RetrieveCurrentTransactionService {
	
	@Autowired
	private CurrentTransactionRepository repository;
	
	public Optional<TransactionsResponse> getTransactions(RequestCurrentTransaction request){
		log.info("Service run method for ");
		Optional<TransactionsResponse> transactions = repository.search(request);
		return transactions;
	}

}

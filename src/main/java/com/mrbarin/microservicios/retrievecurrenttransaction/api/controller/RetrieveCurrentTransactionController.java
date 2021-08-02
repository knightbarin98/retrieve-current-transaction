package com.mrbarin.microservicios.retrievecurrenttransaction.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mrbarin.microservicios.retrievecurrenttransaction.api.annotations.Validate;
import com.mrbarin.microservicios.retrievecurrenttransaction.api.dto.request.RequestCurrentTransaction;
import com.mrbarin.microservicios.retrievecurrenttransaction.api.dto.response.ErrorResponse;
import com.mrbarin.microservicios.retrievecurrenttransaction.api.dto.response.TransactionsResponse;
import com.mrbarin.microservicios.retrievecurrenttransaction.api.handlerexception.GlobalException;
import com.mrbarin.microservicios.retrievecurrenttransaction.api.service.RetrieveCurrentTransactionService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class RetrieveCurrentTransactionController {

	@Autowired
	private RetrieveCurrentTransactionService service;

	@Autowired
	private ObjectMapper mapper;

	private GlobalException exception;

	@Validate
	@PostMapping("/retrieve-current-information")
	@ResponseBody
	public ResponseEntity<TransactionsResponse> retrieve(@RequestBody String json) throws Throwable {
		log.info("Post request route: /retrieve-transaction-user");

		Optional<TransactionsResponse> responseService = service
				.getTransactions(mapper.readValue(json, RequestCurrentTransaction.class));

		if (responseService.isPresent()) {
			log.info("Post request route: /retrieve-transaction-user. Success request");
			return new ResponseEntity<>(responseService.get(), HttpStatus.OK);
		} else {
			exception = new GlobalException(new ErrorResponse("Not Found", 404, "Transaccion no encontrada",
					"La transacción que busca no se encuentra en nuestras bases de datos."));
			log.info("Exception 404", exception);
			log.trace("Exception 404", exception);
			throw exception;
		}

	}
}

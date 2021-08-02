
package com.mrbarin.microservicios.retrievecurrenttransaction.api.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@Builder
@Document(collection = "Transactions")
public class Transaction {
	
	@Id
	public String _id;
    public Integer customerId;
    public String date;
    public TransactionDescription transactionDescription;

}

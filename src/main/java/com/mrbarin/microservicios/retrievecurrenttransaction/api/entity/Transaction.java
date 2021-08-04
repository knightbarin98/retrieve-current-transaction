
package com.mrbarin.microservicios.retrievecurrenttransaction.api.entity;


import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@Document(collection = "Transactions")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"_id",
    "customerId",
    "date",
    "transactionDescription"
})
@Generated("jsonschema2pojo")
public class Transaction {
	
	@Id
	@JsonProperty("_id")
	private String _id;
    @JsonProperty("customerId")
    private Integer customerId;
    @JsonProperty("date")
    private String date;
    @JsonProperty("transactionDescription")
    private TransactionDescription transactionDescription;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Transaction() {
    }

    /**
     * @param _id
     * @param date
     * @param customerId
     * @param transactionDescription
     */
    public Transaction(String _id, Integer customerId, String date, TransactionDescription transactionDescription) {
        super();
        this._id = _id;
        this.customerId = customerId;
        this.date = date;
        this.transactionDescription = transactionDescription;
    }
    
    @JsonProperty("_id")
    public String getId() {
        return _id;
    }

    @JsonProperty("_id")
    public void setCustomerId(String _id) {
        this._id = _id;
    }

    @JsonProperty("customerId")
    public Integer getCustomerId() {
        return customerId;
    }

    @JsonProperty("customerId")
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("transactionDescription")
    public TransactionDescription getTransactionDescription() {
        return transactionDescription;
    }

    @JsonProperty("transactionDescription")
    public void setTransactionDescription(TransactionDescription transactionDescription) {
        this.transactionDescription = transactionDescription;
    }
}
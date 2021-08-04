
package com.mrbarin.microservicios.retrievecurrenttransaction.api.entity;



import javax.annotation.Generated;

import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TransactionType",
    "Descripcion",
    "amount"
})
@Generated("jsonschema2pojo")
public class TransactionDescription {
	
	
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
    @JsonProperty("TransactionType")
	@Field("TransactionType")
    private String transactionType;
	
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
    @JsonProperty("Descripcion")
	@Field("Descripcion")
    private String descripcion;
    @JsonProperty("amount")
    private Float amount;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TransactionDescription() {
    }

    /**
     * 
     * @param transactionType
     * @param descripcion
     * @param amount
     */
    public TransactionDescription(String transactionType, String descripcion, Float amount) {
        super();
        this.transactionType = transactionType;
        this.descripcion = descripcion;
        this.amount = amount;
    }
    
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
    @JsonProperty("TransactionType")
    @Field("TransactionType")
    public String getTransactionType() {
        return transactionType;
    }
    
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
    @JsonProperty("TransactionType")
    @Field("TransactionType")
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
    @JsonProperty("Descripcion")
    @Field("Descripcion")
    public String getDescripcion() {
        return descripcion;
    }
    
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
    @JsonProperty("Descripcion")
    @Field("Descripcion")
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @JsonProperty("amount")
    public Float getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Float amount) {
        this.amount = amount;
    }

}

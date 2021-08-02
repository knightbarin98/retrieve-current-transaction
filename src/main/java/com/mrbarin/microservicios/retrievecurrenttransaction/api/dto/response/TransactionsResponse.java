
package com.mrbarin.microservicios.retrievecurrenttransaction.api.dto.response;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.mrbarin.microservicios.retrievecurrenttransaction.api.entity.Transaction;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transactions"
})
@Generated("jsonschema2pojo")
public class TransactionsResponse {

    @JsonProperty("transactions")
    private List<Transaction> transactions = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TransactionsResponse() {
    }

    /**
     * 
     * @param transactions
     */
    public TransactionsResponse(List<Transaction> transactions) {
        super();
        this.transactions = transactions;
    }

    @JsonProperty("transactions")
    public List<Transaction> getTransactions() {
        return transactions;
    }

    @JsonProperty("transactions")
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

}

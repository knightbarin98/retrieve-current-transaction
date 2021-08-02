
package com.mrbarin.microservicios.retrievecurrenttransaction.api.entity;



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
public class TransactionDescription {

    public String transactionType;
    public String descripcion;
    public Float amount;

}

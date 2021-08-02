package com.mrbarin.microservicios.retrievecurrenttransaction.api.handlerexception;


import com.mrbarin.microservicios.retrievecurrenttransaction.api.dto.response.ErrorResponse;

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
public class GlobalException extends Throwable {

	private static final long serialVersionUID = 1L;
	private ErrorResponse errorResponse;

}

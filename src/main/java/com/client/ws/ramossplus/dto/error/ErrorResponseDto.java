package com.client.ws.ramossplus.dto.error;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ErrorResponseDto {

	private String message;
	private HttpStatus httpStatus;
	private Integer statusCode;
}

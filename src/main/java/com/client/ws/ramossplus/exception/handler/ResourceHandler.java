package com.client.ws.ramossplus.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.client.ws.ramossplus.dto.error.ErrorResponseDto;
import com.client.ws.ramossplus.exception.BadRequestException;
import com.client.ws.ramossplus.exception.NotFoundException;
import com.mysql.cj.protocol.Message;

@RestControllerAdvice
public class ResourceHandler {

	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<ErrorResponseDto> notFoundException(NotFoundException n){
		String errorMessage = n.getMessage();
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ErrorResponseDto.builder()
					.message(n.getMessage())
					.httpStatus(HttpStatus.NOT_FOUND)
					.statusCode(HttpStatus.NOT_FOUND.value())
				.build());
	}
	
	@ExceptionHandler(BadRequestException.class)
		public ResponseEntity<ErrorResponseDto> badRequestException(BadRequestException b){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ErrorResponseDto.builder()
						.message(b.getMessage())
						.httpStatus(HttpStatus.BAD_REQUEST)
						.statusCode(HttpStatus.BAD_REQUEST.value())
					.build());
		}
	}
	


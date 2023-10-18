package com.client.ws.ramossplus.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubscriptionTypeDto {

	private Long id;
	
	@NotBlank(message = "campo name não pode ser nulo ou vazio")
	@Size(min = 5, max = 30)
	private String name;
	
	@Max(value = 12, message = "campo accessMonth não pode ser maior do que 12")
	private Long accessMonth;
	
	@NotNull(message = "campo price não pode ser nulo")
	private BigDecimal price;
	
	@NotBlank(message = "campo productKey não pode ser nulo ou vazio")
	@Size(min = 5, max = 15)
	private String productKey;
}

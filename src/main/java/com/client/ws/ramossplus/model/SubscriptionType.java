package com.client.ws.ramossplus.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

//@Getter //Get
//@Setter //Set
//@ToString //ToString
@Data //Está incluso Get,Set,ToString
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor //Construtor sem argumentos
@AllArgsConstructor //Construtor com todos os argumentos
@Builder //Padrão de mapeamento
@Entity
@Table(name = "subscriptions_type")
public class SubscriptionType extends RepresentationModel<SubscriptionType> implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subscriptions_type_id")
	private Long id;
	
	private String name;
	
	@Column(name = "access_months")
	private Long accessMonths;
	
	private BigDecimal price;
	
	@Column(name = "product_key", unique = true)
	private String productKey;
	
}

package com.client.ws.ramossplus.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Getter //Get
//@Setter //Set
//@ToString //ToString
@Data //Está incluso Get,Set,ToString
@NoArgsConstructor //Construtor sem argumentos
@AllArgsConstructor //Construtor com todos os argumentos
@Builder //Padrão de mapeamento
@Entity
@Table(name= "user_type")
public class UserType implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_type_id")
	private Long id;
	private String name;
	private String description;
	
}

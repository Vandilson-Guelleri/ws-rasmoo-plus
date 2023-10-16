package com.client.ws.ramossplus.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "users")
public class User implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "users_id")
	private Long id;
	
	private String name;
	private String email;
	private String phone;
	private String cpf;
	@Column(name = "dt_subscription")
	private LocalDate dtSubscription = LocalDate.now();
	@Column(name = "dt_expiration")
	private LocalDate dtExpiration;
	
	//quando tem relacionamento não renomeia com @Column
	
	@ManyToOne
	@JoinColumn(name = "user_type_id")
	private UserType userType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subscriptions_type_id")
	private SubscriptionType subscriptionType;
	
}

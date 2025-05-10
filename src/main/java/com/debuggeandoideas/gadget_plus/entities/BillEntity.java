package com.debuggeandoideas.gadget_plus.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "bill")
@Data
public class BillEntity {

	@Id
	@Column(nullable = true, length = 64)
	private String id;

	@Column()
	private BigDecimal totalAmount;

}

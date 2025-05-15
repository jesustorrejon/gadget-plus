package com.debuggeandoideas.gadget_plus.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.engine.spi.CascadingAction;

import java.math.BigInteger;

@Entity
@Table(name = "products")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    private BigInteger quantity;

    @ManyToOne
    @JoinColumn(name = "id_order", nullable = false)
    private OrderEntity order;
}

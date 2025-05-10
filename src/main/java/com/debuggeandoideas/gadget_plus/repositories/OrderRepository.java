package com.debuggeandoideas.gadget_plus.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.debuggeandoideas.gadget_plus.entities.OrderEntity;

@Repository
public interface OrderRepository extends CrudRepository<OrderEntity, Long> {
    // No additional methods are needed for basic CRUD operations
    // The CrudRepository interface provides methods like save(), findById(), findAll(), deleteById(), etc.

}

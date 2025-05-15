package com.debuggeandoideas.gadget_plus.repositories;

import com.debuggeandoideas.gadget_plus.entities.BillEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends CrudRepository<BillEntity, Long> {
    // No additional methods are needed for basic CRUD operations
    // The CrudRepository interface provides methods like save(), findById(), findAll(), deleteById(), etc.

}

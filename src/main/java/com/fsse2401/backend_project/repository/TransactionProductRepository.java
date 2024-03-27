package com.fsse2401.backend_project.repository;

import com.fsse2401.backend_project.data.entity.TransactionEntity;
import com.fsse2401.backend_project.data.entity.TransactionProductEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransactionProductRepository extends CrudRepository<TransactionProductEntity,Integer> {
    List<TransactionProductEntity> findAllByTransaction(TransactionEntity transaction);
}

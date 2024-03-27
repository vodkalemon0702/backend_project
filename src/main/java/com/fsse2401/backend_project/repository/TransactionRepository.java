package com.fsse2401.backend_project.repository;

import com.fsse2401.backend_project.data.entity.TransactionEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TransactionRepository extends CrudRepository<TransactionEntity,Integer> {
    Optional<TransactionEntity> findByUserEntityFireBaseUidAndTid(String uid,Integer tid);
}

package com.fsse2401.backend_project.repository;

import com.fsse2401.backend_project.data.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<ProductEntity,Integer> {
    Optional<ProductEntity> findByPid(Integer pid);
}

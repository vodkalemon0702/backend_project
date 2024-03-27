package com.fsse2401.backend_project.repository;

import com.fsse2401.backend_project.data.user.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
    Optional<UserEntity> findByFireBaseUid(String firebaseUid);
}

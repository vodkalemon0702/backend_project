package com.fsse2401.backend_project.repository;

import com.fsse2401.backend_project.data.entity.CartItemEntity;
import com.fsse2401.backend_project.data.user.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CartItemRepository extends CrudRepository<CartItemEntity,Integer> {
    Optional<CartItemEntity> findByUserEntity_UidAndProductEntity_Pid(Integer uid,Integer pid);
    List<CartItemEntity> findAllByUserEntity(UserEntity userEntity);
    void deleteAllByUserEntity_FireBaseUid(String firebaseUid);
}

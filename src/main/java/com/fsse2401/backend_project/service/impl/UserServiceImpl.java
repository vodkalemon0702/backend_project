package com.fsse2401.backend_project.service.Impl;

import com.fsse2401.backend_project.data.user.domainObject.FirebaseUserData;
import com.fsse2401.backend_project.data.user.entity.UserEntity;
import com.fsse2401.backend_project.repository.UserRepository;
import com.fsse2401.backend_project.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity getEntityByFireBaseUserData(FirebaseUserData firebaseUserData) {
//        Optional<UserEntity> userEntityOptional = userRepository.findByFireBaseUid(firebaseUserData.getFirebaseUid());
//        if (userEntityOptional.isEmpty()){
//            UserEntity userEntity = new UserEntity(firebaseUserData);
//            return userRepository.save(userEntity);
//        }else {
//            return userEntityOptional.get();
//        }
        return userRepository.findByFireBaseUid(
                firebaseUserData.getFirebaseUid()).orElseGet(
                () -> userRepository.save(new UserEntity(firebaseUserData))
        );
    }
}

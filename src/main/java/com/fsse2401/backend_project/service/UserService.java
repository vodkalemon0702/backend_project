package com.fsse2401.backend_project.service;

import com.fsse2401.backend_project.data.user.domainObject.FirebaseUserData;
import com.fsse2401.backend_project.data.user.entity.UserEntity;

public interface UserService {
    UserEntity getEntityByFireBaseUserData(FirebaseUserData firebaseUserData);
}

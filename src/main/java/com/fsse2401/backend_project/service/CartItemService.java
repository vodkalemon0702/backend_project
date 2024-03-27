package com.fsse2401.backend_project.service;

import com.fsse2401.backend_project.data.domainObject.cartItem.response.CartItemResponseData;
import com.fsse2401.backend_project.data.entity.CartItemEntity;
import com.fsse2401.backend_project.data.user.domainObject.FirebaseUserData;
import com.fsse2401.backend_project.data.user.entity.UserEntity;

import java.util.List;

public interface CartItemService {


    boolean putCartItem(FirebaseUserData firebaseUserData, Integer pid, Integer quantity);

    List<CartItemResponseData> getAllCartProductsByUserId(FirebaseUserData firebaseUserData);

    CartItemResponseData updateCartQuantity(FirebaseUserData firebaseUserData, Integer pid, Integer quantity);


    boolean deleteCartItem(FirebaseUserData firebaseUserData, Integer pid);

    List<CartItemEntity> getAllCartItemEntity(UserEntity user);

    void emptyUserCart(String firebaseUid);
}

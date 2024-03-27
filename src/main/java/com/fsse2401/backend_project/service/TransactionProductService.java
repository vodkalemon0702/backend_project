package com.fsse2401.backend_project.service;

import com.fsse2401.backend_project.data.entity.CartItemEntity;
import com.fsse2401.backend_project.data.entity.TransactionEntity;
import com.fsse2401.backend_project.data.entity.TransactionProductEntity;

import java.util.List;

public interface TransactionProductService {

    TransactionProductEntity createTransactionProduct(TransactionEntity transactionEntity, CartItemEntity cartItemEntity);

    List<TransactionProductEntity> getEntityListByTransaction(TransactionEntity transactionEntity);
}

package com.fsse2401.backend_project.service.Impl;

import com.fsse2401.backend_project.data.entity.CartItemEntity;
import com.fsse2401.backend_project.data.entity.TransactionEntity;
import com.fsse2401.backend_project.data.entity.TransactionProductEntity;
import com.fsse2401.backend_project.repository.TransactionProductRepository;
import com.fsse2401.backend_project.service.TransactionProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionProductServiceImpl implements TransactionProductService {
    private final TransactionProductRepository transactionProductRepository;

    @Autowired
    public TransactionProductServiceImpl(TransactionProductRepository transactionProductRepository) {
        this.transactionProductRepository = transactionProductRepository;
    }
    @Override
    public TransactionProductEntity createTransactionProduct(TransactionEntity transactionEntity, CartItemEntity cartItemEntity){
        TransactionProductEntity transactionProductEntity = new TransactionProductEntity(transactionEntity,cartItemEntity);
        return transactionProductRepository.save(transactionProductEntity);
    }
    @Override
    public List<TransactionProductEntity> getEntityListByTransaction(TransactionEntity transactionEntity){
        return transactionProductRepository.findAllByTransaction(transactionEntity);
    }
}

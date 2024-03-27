package com.fsse2401.backend_project.service;

import com.fsse2401.backend_project.data.domainObject.transaction.response.TransactionResponseData;
import com.fsse2401.backend_project.data.user.domainObject.FirebaseUserData;

import java.util.List;

public interface TransactionService {

    TransactionResponseData prepareTransaction(FirebaseUserData firebaseUserData);

    TransactionResponseData getTransactionByTid(FirebaseUserData firebaseUserData, Integer tid);

    boolean payTransaction(FirebaseUserData firebaseUserData, Integer tid);

    TransactionResponseData finishTransaction(FirebaseUserData firebaseUserData, Integer tid);
}

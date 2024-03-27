package com.fsse2401.backend_project.data.domainObject.transaction.response;

public class TransactionSuccessResponseData {
    private String status;

    public TransactionSuccessResponseData() {
        setStatus("Success");
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

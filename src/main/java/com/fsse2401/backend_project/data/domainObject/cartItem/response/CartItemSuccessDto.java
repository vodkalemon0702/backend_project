package com.fsse2401.backend_project.data.domainObject.cartItem.response;

public class CartItemSuccessDto {
    private String status;

    public CartItemSuccessDto() {
        setStatus("Success");
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

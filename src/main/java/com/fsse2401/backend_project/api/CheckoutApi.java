package com.fsse2401.backend_project.api;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckoutApi {
    @PostMapping("/public/checkout")
    public void checkout() throws StripeException {
        Stripe.apiKey = "sk_test_51PBpbqRwLhcWWY6dubnOa4dIhYhwD8wTkZfWKQh3sELg9H9VtKjjaUffPRQeFrFZVYohqWsuC4oDMrdosbFCjdlz00IZA8PHsx";
        String YOUR_DOMAIN = "http://localhost:5173";
        SessionCreateParams params =
                SessionCreateParams.builder()
                        .setMode(SessionCreateParams.Mode.PAYMENT)
                        .setSuccessUrl(YOUR_DOMAIN + "/thankyou")
                        .setCancelUrl(YOUR_DOMAIN + "/error")
                        .addLineItem(
                                SessionCreateParams.LineItem.builder()
                                        .setQuantity(1L)
                                        .setPrice("price_1PBqEhRwLhcWWY6dE6WJHQbP")
                                        .build())
                        .build();
        Session session = Session.create(params);
        System.out.println(session.getId());
        System.out.println(session.getUrl());
    }
}

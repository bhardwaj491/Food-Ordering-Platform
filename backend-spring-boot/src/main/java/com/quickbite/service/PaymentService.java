package com.quickbite.service;

import com.stripe.exception.StripeException;
import com.quickbite.model.Order;
import com.quickbite.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}

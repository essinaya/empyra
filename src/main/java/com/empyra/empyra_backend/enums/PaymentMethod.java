package com.empyra.empyra_backend.enums;

public enum PaymentMethod {
	OVER_THE_COUNTER("Over the Counter"),
	OTHERS("Others"),;
	
	
	private final String paymentType;

	private PaymentMethod(String method) {
		this.paymentType = method;
	}

	public String getPaymentMethod() {
		return paymentType;
	}
}

package com.empyra.empyra_backend.enums;

public enum PaymentStatus {
	UNPAID(0),
	PAID(1),
	OVERDUE(2);

	private final int status;

	PaymentStatus(int status) {
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public static PaymentStatus getStatus(int status) {
		for (PaymentStatus paymentStatus : PaymentStatus.values()) {
			if (paymentStatus.getStatus() == status) {
				return paymentStatus;
			}
		}
		throw new IllegalArgumentException("Invalid payment status: " + status);
	}
}

package com.test.mariadb;

public enum PaymentStatus 
{
	ATTENTE("Attente"),
    VALIDER("Validé");
	
	String s;
    
    private PaymentStatus() {};

	PaymentStatus(String s) {
		this.s = s;
	}
	
	@Override
	public String toString() {
		return this.s;
	}
	
}
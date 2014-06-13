package jbosseap;

import javax.enterprise.event.Event;
import javax.inject.Inject;

public class PaymentsProcessor {

	 @Inject
	    Event<Payment> event;
	
	/**
	 * mock method for making a payment and firing a payment event
	 * @param payment
	 */
	public void pay(Payment payment) {
		// TODO process and validate the payment
		
		event.fire(payment);
	}

}

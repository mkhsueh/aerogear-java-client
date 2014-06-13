package jbosseap;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/payments")
public class PaymentService {

	@Inject
	PaymentsProcessor processor;

	@POST
	@Consumes("application/json")
	public Response pay(Payment payment) {
		// print payment just for testing purposes
		System.out.println("a payment was received: " + payment.getItemID()
				+ ", " + payment.getUsername() + ", " + payment.getZipCode()
				+ ", " + payment.getAmount());
		processor.pay(payment);

		return Response.ok().build();
	}
}

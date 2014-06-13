package jbosseap;

import java.util.Arrays;

import javax.enterprise.event.Observes;
import javax.enterprise.event.TransactionPhase;
import javax.inject.Inject;

import org.jboss.aerogear.unifiedpush.SenderClient;
import org.jboss.aerogear.unifiedpush.message.UnifiedMessage;

/**
 * The class that listens for payment events
 * and responsible to send receipt notifications
 */
public class NotificationSender {

  @Inject
  SenderClient sender;

  void sendPaymentNotification(@Observes(during = TransactionPhase.AFTER_SUCCESS) Payment payment) {
      UnifiedMessage message = new UnifiedMessage.Builder()
                .pushApplicationId("b26b3b77-87af-4bb9-9f84-d5a95d02273f")
                .masterSecret("69abd58f-2976-43e9-b38d-21ff58f929bd")
                .alert("Your payment amount of " + payment.getAmount() + " has been received!")
                .sound("default")
                .aliases(Arrays.asList(payment.getUsername()))
                .build();

      sender.send(message);
  }
}

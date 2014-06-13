package jbosseap;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import org.jboss.aerogear.unifiedpush.SenderClient;

public class Resources {

    @Produces
    @ApplicationScoped
    public SenderClient getSenderClient() {
       // initialize to point to the hostname of the running UnifiedPush server
       return new SenderClient("https://aerogear-mhsueh.rhcloud.com");
    }
}
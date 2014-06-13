The OpenShift `jbosseap` cartridge documentation can be found at:

http://openshift.github.io/documentation/oo_cartridge_guide.html#jbosseap
 
 ---------------
 
 - This client has been tested against EAP 6 and Aerogear Unified Push Server 0.10.4 deployed on OpenShift Online.
 - Sample call to REST endpoint that posts a request for notification:  `curl -H "Content-Type: application/json" -d '{"username":"yourEmail@gmail.com", "amount":"14.99", "zipCode":"94040", "itemID":"artOfWar"}' http://hostname.com/api/payment`

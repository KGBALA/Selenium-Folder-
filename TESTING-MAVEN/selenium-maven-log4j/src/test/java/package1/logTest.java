package package1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class logTest {

	public static void main(String[] args) {
		
		Logger log = LogManager.getLogger(logTest.class.getName());
		log.debug("I am logging");  // When each selenium action is perform like click(), sendKeys(), getText()
		
		log.info("Object is present");  // When operation is successfully complated ex:After loading page
		
		log.debug("starting");
		
		if(0>2) {
			log.info("object is present");
		}else {
			log.error("Object is NOT present");
		}
		
		/* Output:
		 * ERROR StatusLogger No Log4j 2 configuration file found. Using default configuration (logging only errors to the console), 
		 * or user programmatically provided configurations. Set system property 'log4j2.debug' to show Log4j 2 internal initialization logging. 
		 * See https://logging.apache.org/log4j/2.x/manual/configuration.html for instructions on how to configure Log4j 2 
		 * 08:12:23.363 [main] ERROR package1.logTest - Object is NOT present
		 */
	}

}

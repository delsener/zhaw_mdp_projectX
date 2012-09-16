package ch.zhaw.mdp.projectX;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;



/**
 * Class containing the main method in which the application runs.
 * 
 * @author Roger Knecht, David Elsener (zhaw)
 */
public class Application {

	private static final Logger LOGGER = Logger.getLogger(Application.class);
	
	/**
	 * Main method.
	 * 
	 * @param args the program arguments.
	 */
	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		LOGGER.info("I'm such a cool project.");
	}

}

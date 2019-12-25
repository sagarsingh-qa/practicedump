package tests;
import org.apache.log4j.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Log4jDemo {

		 @BeforeTest
		   public void init() throws Exception
		   {
		       // Log4J junit configuration.
		       BasicConfigurator.configure();
		   }
	private static Logger log = LogManager.getLogger(Log4jDemo.class.getName());
	@Test
	public void log()
	
	{
		log.debug("I'm debugging");
		log.info("This is information");
		log.error("This is Error");
	}
}
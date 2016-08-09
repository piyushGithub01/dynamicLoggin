package routingLogger.loggerApplication;

//import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jRoutingAppender {

	// private final static Logger log =
	// LogManager.getLogger(Slf4jRoutingAppender.class);

	public static void main(String[] args) {

		Logger log = LoggerFactory.getLogger(Slf4jRoutingAppender.class);
		log.info("Hello World");

		ThreadContext.put("logFileName", "David");
		log.info("Error happened");

		ThreadContext.put("logFileName", "Mark");
		log.info("Something is broken");

		ThreadContext.remove("logFileName");
	}
}

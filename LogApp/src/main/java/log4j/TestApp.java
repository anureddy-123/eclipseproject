package log4j;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

public class TestApp {
	private static Logger log = Logger.getLogger(TestApp.class);
public static void main(String[] args) {
	//create layout
	//Layout layout = new SimpleLayout();
	//Layout layout = new HTMLLayout();
Layout layout = new XMLLayout();
	// create appender + link layout
	Appender  app =new ConsoleAppender(layout);
	// link appender with logger
	log.addAppender(app);
	
	log.debug("from debug");
	log.info("from info");
	log.warn("from warn");
	log.error("from error");
	log.fatal("from fatal");
	
}

}

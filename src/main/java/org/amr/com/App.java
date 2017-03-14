package org.amr.com;
import org.slf4j.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
	   Logger log =LoggerFactory.getLogger(App.class);
	   log.info("hello world, welcome");
    }
}

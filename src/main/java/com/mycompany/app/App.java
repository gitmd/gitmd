package com.mycompany.app;

/**
 * Hello world!
 *
 */
import org.apache.log4j.Logger;

public class App
{
    /**
     * The current logger instance.
     */
    private static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args)
    {
        App app = new App();
        app.run(5, 2);
        System.out.println("Hello World!");
    }

    public int run(int a, int b)
    {
        logger.debug("debug - results  of a + b = " + (a + b));
        logger.info("info - results  of a + b = " + (a + b));
        return a + b;
    }
}

package com.lzh;

import com.lzh.config.GrafanaMonitorConfig;
import com.lzh.properties.MonitorProperties;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        GrafanaMonitorConfig grafanaMonitorConfig = new GrafanaMonitorConfig();
        MonitorProperties properties = new MonitorProperties();
        properties.setGatewayHost("localhost:9091");

        grafanaMonitorConfig.setProperties(properties);

        System.out.println("hello world");


    }
}

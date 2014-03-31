package org.upv.ufasu;

import java.io.InputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.upv.ufasu.weather.Weather;
import org.upv.ufasu.weather.YahooParser;

public class YahooParserTest extends TestCase {

    public YahooParserTest(String name) {
        super(name);
    }
    public static Test suite()
    {
        return new TestSuite( YahooParserTest.class );
    }
    public void testParser() throws Exception {
        InputStream valenciaData =
            getClass().getClassLoader().getResourceAsStream("valencia-weather.xml");
        Weather weather = new YahooParser().parse( valenciaData );
        assertEquals( "Valencia", weather.getCity() );
        assertEquals( "Spain", weather.getCountry() );
        assertEquals( "64", weather.getTemp() );
        assertEquals( "Partly Cloudy", weather.getCondition() );
        assertEquals( "64", weather.getChill() );
        assertEquals( "56", weather.getHumidity() );
    }
}


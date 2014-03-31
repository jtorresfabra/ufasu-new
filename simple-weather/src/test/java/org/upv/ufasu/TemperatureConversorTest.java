package org.upv.ufasu;

import org.upv.ufasu.weather.TemperatureConversor;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TemperatureConversorTest  extends TestCase {
		
	 public TemperatureConversorTest(String name) {
	        super(name);
	    }
	   /**
	     * @return the suite of tests being tested
	     */
	    public static Test suite()
	    {
	        return new TestSuite( TemperatureConversorTest.class );
	    }
	    /**
	     * Test conversion from  :-)
	     */
	    public void testFahrenheitToCelsius()
	    {
	        TemperatureConversor t = new TemperatureConversor();
	        String tempC = t.fromFahrenheitToCelsius("50");    	
	    	assertEquals("10", tempC);
	    }

	 
	 
}

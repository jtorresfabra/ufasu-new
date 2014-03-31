package org.upv.ufasu.weather;

public class TemperatureConversor {
	
	 public TemperatureConversor() {}
	
     public String fromFahrenheitToCelsius(String tempF)
     {
    	 // (°F - 32) /1.8 = °C
    	 int f = Integer.parseInt(tempF);
    	 int c = (int) ((f -32)/1.8);
    	 String tempC=String.valueOf(c);	
    	 return tempC;
     }
	
	
}

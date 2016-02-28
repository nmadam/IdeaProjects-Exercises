package example;

import com.nancyadam.client.*;

import java.math.BigDecimal;

/**
 * Created by Nancy on 2/23/2016.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
    TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap();
    //invoke business method
    BigDecimal celciusUserNumber = BigDecimal.valueOf(10.0); //this info is usually form data;

    BigDecimal degreeResult = service.celciusToFahrenheit(celciusUserNumber);
    System.out.println(degreeResult);

  }
}

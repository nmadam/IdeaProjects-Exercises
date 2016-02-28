package example;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by Nancy on 2/25/2016.
 */
@WebService()
public class HelloWorld {
  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }

  public String sayGoodbyeWorldFrom (String from) {
    String resultGoodbye = "Goodbye - from: " + from;
    System.out.println(resultGoodbye);
    return resultGoodbye;
  }

}

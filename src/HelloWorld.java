import javax.jws.WebService;

@WebService
public class HelloWorld {

	public HelloWorld(){}
	public String getGreetings(String name)
	{
		return "hello" + name;
	}
	
}

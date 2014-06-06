import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld { 
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() { //uioyhuiyhu
		System.out.println("Your Message1 : " + message); 
		System.out.println("Your Message2 : " + message); 
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

		obj.getMessage();
	}
}

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		
		DemoBean db=(DemoBean)ctx.getBean("id2");
		db.sayHello();
	}
}
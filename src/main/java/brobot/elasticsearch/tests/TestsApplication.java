package brobot.elasticsearch.tests;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class TestsApplication {

	public static void main( String[] args )
	{
		SpringApplicationBuilder builder = new SpringApplicationBuilder(TestsApplication.class);
		builder.headless(false);
		ConfigurableApplicationContext context = builder.run(args);

		LoadLib loadLib = context.getBean(LoadLib.class);
		loadLib.doStuff();
	}

}

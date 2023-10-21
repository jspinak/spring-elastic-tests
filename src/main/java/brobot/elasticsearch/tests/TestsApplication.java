package brobot.elasticsearch.tests;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class TestsApplication {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(TestsApplication.class);
		builder.headless(false);
		ConfigurableApplicationContext context = builder.run(args);

		TestElasticsearch testElasticsearch = context.getBean(TestElasticsearch.class);
		testElasticsearch.test();
	}

}



@Configuration
@EnableWebMvc
@ComponentScan("com")


public class MyAppConfig {
	
	
	@Bean
	InternalResourceViewResolver viewResolver() {
	
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	viewResolver.setPrefix("/WEB-INF/views");
	viewResolver.setSuffix(".jsp");
	
	return viewResolver;
	
	}

	
}

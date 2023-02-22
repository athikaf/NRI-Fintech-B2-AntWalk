import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

	
	//configure
	//some user details
	//username password roles
	
   //in server memory
   //AuthenticationManagerBuilder
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		
		auth
		  .inMemoryAuthentication()
		  .withUser("spring")
		  .password("{noop}spring")
		  .roles("admin")
		
	}
	
}

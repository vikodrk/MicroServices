package mx.com.spring.data.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mx.com.spring.service.ISaveUserService;
import mx.com.spring.service.impl.SaveUserServiceImpl;

@Configuration
public class DataArtifactConfiguration {

	@Bean
	public ISaveUserService saveUserService() {
		return new SaveUserServiceImpl();
	}

}

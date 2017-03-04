package mx.com.spring.data.configuration;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import mx.com.spring.service.ISaveUserService;
import mx.com.spring.service.impl.SaveUserServiceImpl;

public class DataArtifactConfigurationTest {

	DataArtifactConfiguration configClass;

	@Autowired
	ISaveUserService saveUserServiceTest;

	@Before
	public void setUp() {

		configClass = new DataArtifactConfiguration();

	}

	@Test
	public void testServeUserService() {

		ISaveUserService saveUserService = configClass.saveUserService();
		assertTrue(saveUserService instanceof SaveUserServiceImpl);

	}

}

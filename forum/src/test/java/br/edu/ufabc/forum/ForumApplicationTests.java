package br.edu.ufabc.forum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * The project's integration tests configuration.
 * @author Giulio Denardi
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ForumApplication.class)
@WebAppConfiguration
public class ForumApplicationTests {

	
	@Test
	public void contextLoads() {
	}

}

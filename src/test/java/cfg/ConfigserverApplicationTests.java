package cfg;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cfg.ConfigserverApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ConfigserverApplication.class)
@WebAppConfiguration
public class ConfigserverApplicationTests {

	@Test
	public void contextLoads() {
	}

}

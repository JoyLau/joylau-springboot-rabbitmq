package cn.joylau.code;

import cn.joylau.code.rabbitmq.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JoylauSpringBootRabbitmqApplicationTests {

	@Autowired
	private Product product;

	@Test
	@Scheduled(cron = "0/5 * * * * ? ")
	public void test() throws Exception {
		product.send();
	}

}

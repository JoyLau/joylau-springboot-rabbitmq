package cn.joylau.code;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableRabbit
public class JoylauSpringBootRabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(JoylauSpringBootRabbitmqApplication.class, args);
	}

	@Bean
	public Queue meteoEquipQueue() {
		return new Queue("meteo-equip-queue",true);
	}
}

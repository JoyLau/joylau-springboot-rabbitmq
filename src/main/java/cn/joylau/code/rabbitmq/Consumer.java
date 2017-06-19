package cn.joylau.code.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by JoyLau on 2017/6/16.
 * cn.joylau.code.rabbitmq
 * 2587038142@qq.com
 */
@Component
@RabbitListener(queues = "hello")
public class Consumer {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("消费者接受信息 : " + hello);
    }
}

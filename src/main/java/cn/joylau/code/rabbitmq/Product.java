package cn.joylau.code.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by JoyLau on 2017/6/16.
 * cn.joylau.code.rabbitmq
 * 2587038142@qq.com
 */
@Component
public class Product {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "hello " + new Date();
        System.out.println("生产者发送信息 : " + context);

        new Queue("hello");
        this.rabbitTemplate.convertAndSend("hello", context);
    }
}

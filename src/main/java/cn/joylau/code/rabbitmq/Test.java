package cn.joylau.code.rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by JoyLau on 2017/6/27.
 * cn.joylau.code.rabbitmq
 * 2587038142@qq.com
 */
@Component
public class Test {

    @Autowired
    private Product product;

    @Scheduled(cron = "0/5 * * * * ? ")
    public void test() throws Exception {
        product.send();
    }
}

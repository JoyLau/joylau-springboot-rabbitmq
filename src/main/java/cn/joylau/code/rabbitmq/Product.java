package cn.joylau.code.rabbitmq;

import com.alibaba.fastjson.JSONObject;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
        MeteoEquip meteoEquip = new MeteoEquip();

        meteoEquip.setDeviceNum("#003");
        meteoEquip.setDeviceTime("20170627103816");
        meteoEquip.setVis10("30000");
        meteoEquip.setRc("0");
        meteoEquip.setRt("30.2");
        meteoEquip.setWh("10.2");

        JSONObject object = new JSONObject();

        object.put("success",true);
        object.put("data",meteoEquip);


        String context = object.toJSONString();

        this.rabbitTemplate.convertAndSend("meteo-equip-queue", context);
    }
}

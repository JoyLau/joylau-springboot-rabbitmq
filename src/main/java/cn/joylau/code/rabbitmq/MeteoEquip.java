package cn.joylau.code.rabbitmq;

import lombok.Data;

/**
 * Created by JoyLau on 2017/6/27.
 * cn.joylau.code.rabbitmq
 * 2587038142@qq.com
 */
@Data
public class MeteoEquip {
    private String deviceNum;   //设备编号

    private String deviceTime;  //设备时间

    private String vis10;  //10分钟能见度

    private String rt;  //路面温度

    private String wh;  //水膜厚度

    private String rc;  //路面状况，是否结冰
}

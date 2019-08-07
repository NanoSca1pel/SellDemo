package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author lhtao
 * @date 2019-01-17 18:19
 */
@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {

    /**公众号appId*/
    private String mpAppId;

    /**公众号appSecret*/
    private String mpAppSecret;

    /**商户号*/
    private String mchId;

    /**商户密钥*/
    private String mchKey;

    /**商户证书路径*/
    private String keyPath;

    /**微信支付异步通知地址*/
    private String notifyUrl;

    /** 微信开放平台appId */
    private String openAppId;

    /** 微信开放平台app密钥 */
    private String openAppSecret;

    /** 微信推送消息模板id */
    private Map<String, String> templateId;


}

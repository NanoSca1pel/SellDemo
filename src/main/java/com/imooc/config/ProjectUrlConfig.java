package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author lhtao
 * @date 2019-01-24 11:49
 */
@Data
@ConfigurationProperties(prefix = "projecturl")
@Component
public class ProjectUrlConfig {

    /**
     * 微信公众平台授权url
     */
    public String wechatMpAuthorize;


    /**
     * 微信开放平台授权url
     */
    public String wechatOpenAuthorize;


    /**
     * 点餐系统url
     */
    public String sell;
}

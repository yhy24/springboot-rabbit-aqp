package com.springboot.rabbit.aqp.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yhy
 * @Date: 2018/7/27 15:57
 * @Version 1.0
 */
@Configuration
public class MyMqpConfig {
//消息转化的使用 json
    @Bean
    public MessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }

}

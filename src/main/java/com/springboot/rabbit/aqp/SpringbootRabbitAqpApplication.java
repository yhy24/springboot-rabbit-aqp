package com.springboot.rabbit.aqp;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit //开启基于注解的RabbitMq
@SpringBootApplication
/**
 * 自动配置
 * 1,RabbitAutoConfiguration
 * 2，有自动配置了连接工厂ConnectionFactory
 * 3,RabbitProperties 封装了RabbitMQ的配置
 * 4，RabbitTemplate 给RabbitMQ发送接收消息
 * 5，AmqpAdmin ：RabbitMQ 系统管理功能组件
 * 6，@@EnableRabbit + @RabbitListener 监听消息队列
 */
public class SpringbootRabbitAqpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRabbitAqpApplication.class, args);
	}
}

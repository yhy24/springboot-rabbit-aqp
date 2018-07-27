package com.springboot.rabbit.aqp;

import com.springboot.rabbit.aqp.book.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRabbitAqpApplicationTests {
	@Autowired
	RabbitTemplate rabbitTemplate;
//发送数据
	@Test
	public void contextLoads() {
        Map maps = new HashMap();
        maps.put("name", "hua");
        maps.put("age", "ze");
        maps.put("sexly", "lei");
		maps.put("data", Arrays.asList("yang","hao","ying"));
//		放送消息
	    rabbitTemplate.convertAndSend("yang.nana","hello",new Book("摆渡人","donnt"));
	}
//接收数据 如何将数据自动转换为json
	@Test
	public void  recive() {
		Book object = (Book)rabbitTemplate.receiveAndConvert("love.nana");
		System.out.println(object.getClass());
		System.out.println(object);
		System.out.println(object.getAuthor() + object.getBooks());
	}
}

package com.springboot.rabbit.aqp.service;

import com.springboot.rabbit.aqp.book.Book;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @Author: yhy
 * @Date: 2018/7/27 16:10
 * @Version 1.0
 */
@Service
public class BookService {
//    监听器的使用
    @RabbitListener(queues = "love.nana")
    public void recive(Book book) {
        System.out.println("接收到消息-->" + book.getAuthor() +"---"+book.getBooks());
    }

    @RabbitListener(queues = "love.nana")
    public void message(Message message) {
        System.out.println("---love----"+message.getBody());
        System.out.println("-----nana----"+message.getMessageProperties());
    }
}

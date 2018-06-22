package com.example.demo_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

@RestController
public class Bean {
    @Value(value = "${book.author}")
   private String bookAuthor;
    @Value(value = "${book.name}")
   private String bookName;
    @Value(value = "${book.pinyin}")
   private String bookPinyin;

        @RequestMapping()
        public String test(){
            System.out.println("作者是："+bookAuthor);
            System.out.println("书名是："+bookName);
            System.out.println(bookPinyin);
            System.out.println("______________________");
            return "书名是： "+ this.bookName +"；作者是： "+ this.bookAuthor +"；and Book PinYin is "+ this.bookPinyin;
        }

}



package com.example.demo_web;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "book")
public class Bean1 {

    private String bookAuthor;
    private String bookName;
    private String bookPinyin;

    public String getBookAuthor() {
        return bookAuthor;
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getBookPinyin() {
        return bookPinyin;
    }
    public void setBookPinyin(String bookPinyin) {
        this.bookPinyin = bookPinyin;
    }

    @Override
    public String toString() {
        return "Bean1{" +
                "bookAuthor='" + bookAuthor + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookPinyin='" + bookPinyin + '\'' +
                '}';
    }
}

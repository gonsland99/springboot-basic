package com.gon.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //스프링부트 자동설정, bean 읽기/생성
public class Application {
    public static void main(String[] args) {

        SpringApplication.run(Application.class, args); //톰캣필요 없이 내장된 was이용

    }
}

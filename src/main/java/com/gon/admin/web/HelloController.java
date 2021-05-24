package com.gon.admin.web;

import com.gon.admin.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //json을 반환하는 컨트롤러
public class HelloController {
    @GetMapping("/hello")   //get요청을 받는 주소매핑
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloResponseDto
            (@RequestParam("name") String name, @RequestParam("amount") int amonut){
        return new HelloResponseDto(name, amonut);
    }
}

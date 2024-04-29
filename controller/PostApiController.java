package com.example.post.controller;

import com.example.post.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {
    /**
     RequestBody는 Json형태로 받음. Json에서 값으로 올 수 있는 것들은
     String, number, boolean, Object, array 5가지
     Json 기본 형태는 {"key" : value} 형태
     단, value가 Object인 경우 {}로 묶어주고, array인 경우 []로 묶어줘야 함.
     snake case가 기본
     */

    /**
    // ★RequestBody annotation으로 데이터 바디 받기
    @PostMapping("/post")
    public void post(@RequestBody Map<String, Object> requestData) {
        requestData.forEach((key, value) -> {
            System.out.println("key : "+ key);
            System.out.println("value : " + value + "\n");
        });
    }
    */

    // post 받는 방법2
    @PostMapping("/post")
    public void post(@RequestBody PostRequestDto requestDto) {
        System.out.println(requestDto);

        // requestDto.getPassword()로 받아와서 비밀번호에 대해서 처리하는 등의 작업 가능
    }
}

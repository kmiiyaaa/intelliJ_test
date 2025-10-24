package com.kmii.home.controller;

import com.kmii.home.dto.Board;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/test")
    public String test(){
        return "hello";
    }

    @GetMapping("/board")
    public Board board() {
        Board board = new Board();
        board.setName("홍길동");
        board.setPass("12345");

        return  board;
    }
}

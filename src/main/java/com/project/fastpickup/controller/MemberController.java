package com.project.fastpickup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
@RequestMapping("/member/")
public class MemberController {

    @GetMapping("list")
    public String getListMember() {
        log.info("GET | Member List");
        return "/member/list";
    }
    
}

package com.pavelshevelev.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

@GetMapping("/")
    public String getInfoForAllEmployees(){
        return "view_for_all_employees";
    }

   @GetMapping("/hr_info")
        public String getInfoOnlyHR(){
    return "view_for_HR";
        }
        @GetMapping("/manager_info")
    public String getInfoOnlyForMANAGERS(){
    return "view_for_managers";
        }

}

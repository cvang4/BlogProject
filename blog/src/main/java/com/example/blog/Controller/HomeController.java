<<<<<<< HEAD
package com.example.blog.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
    public class HomeController {

        @RequestMapping("/")
        public String home() {
            return "home";
        }

        @GetMapping("/logout")
        public String logout() {
            return "logout";
        }

        @GetMapping("/login")
        public String login() {
            return "login";
        }

    }
=======
//package com.example.blog.controller;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//    public class HomeController {
//        @RequestMapping("/")
//        public String home() {
//            return "home";
//        }
//    }
>>>>>>> 75fe6b097bde5560264c27274f70b486939c8f11

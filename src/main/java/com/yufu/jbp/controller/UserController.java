package com.yufu.jbp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

//    @Autowired
//    private IRepository<User, Integer> _userRepository;

    @RequestMapping("/hello")
    public String hello() {
//        User user = new User();
//        user.setLast_login_time(new Date());
//        user.setSex(1);
//        user.setPassword("123");
//        user.setUserNme("wang");
//        _userRepository.save(user);
        return "";
    }

}

//package com.jrbangit.jbangonlinecleaners.Controllers;
//
//import com.jrbangit.jbangonlinecleaners.Exceptions.JbangOnlineCleanersExceptions;
//import com.jrbangit.jbangonlinecleaners.Models.Login;
//import com.jrbangit.jbangonlinecleaners.Services.LoginService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/login")
//@CrossOrigin("*")
//public class MainPageController {
//
//    private LoginService loginService;
//
//    @Autowired
//    public MainPageController(LoginService loginService){
//        this.loginService = loginService;
//    }
//
//    //should be called when login button is pressed and pass data from forms.
//    @GetMapping("/enter")
//    public void login(Login login) throws JbangOnlineCleanersExceptions {
//        this.loginService.validateLogin(login);
//    }
//}

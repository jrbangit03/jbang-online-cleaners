//package com.jrbangit.jbangonlinecleaners.Services;
//
//import com.jrbangit.jbangonlinecleaners.Exceptions.JbangOnlineCleanersExceptions;
////import com.jrbangit.jbangonlinecleaners.Models.User;
////import com.jrbangit.jbangonlinecleaners.Models.Login;
////import com.jrbangit.jbangonlinecleaners.Respositories.LoginRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class LoginService {
//
//    private LoginRepository loginRepository;
//
//    @Autowired
//    public LoginService(LoginRepository loginRepository){
//        this.loginRepository = loginRepository;
//    }
//
//
//    public void validateLogin(Login login) throws JbangOnlineCleanersExceptions{
//        Optional<User> login_dtls = this.loginRepository.findUserByAccntAndPassword(login.getAcctName(), login.getPassword());
//        login_dtls.orElseThrow(() -> new JbangOnlineCleanersExceptions("incorrect username or password"));
//    }
//}

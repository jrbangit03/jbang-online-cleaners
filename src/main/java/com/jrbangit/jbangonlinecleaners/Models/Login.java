//package com.jrbangit.jbangonlinecleaners.Models;
//
//import lombok.Data;
//
//import javax.persistence.*;
//import java.sql.Timestamp;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "access_log")
//@Data
//public class Login {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) //need to generate UUID
//    @Column(nullable = false, updatable = false)
//    String accessId;
//    String acctName;
//    String password;
//    @Column(nullable = false)
//    Timestamp login_ts = Timestamp.valueOf(LocalDateTime.now());
//}

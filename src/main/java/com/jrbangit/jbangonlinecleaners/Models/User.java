package com.jrbangit.jbangonlinecleaners.Models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "User")
@Data
public class User {
    //TODO needs to be foreign key of either cleaner or client
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    Long account_id;
    String fn;
    String ln;
    String address;
    String username;
    String password;
    String accountType;
}

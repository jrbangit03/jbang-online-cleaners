package com.jrbangit.jbangonlinecleaners.Models;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name="Client")
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int client_id;

    private String client_fn;
    private String client_ln;
    private String client_mn;
    private String client_address;
    private int client_age;
    private String client_gender;
    private int client_gov_id;
    private String client_gov_id_type;
    private Long client_phone_number;
}

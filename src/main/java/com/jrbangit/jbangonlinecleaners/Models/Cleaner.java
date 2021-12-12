package com.jrbangit.jbangonlinecleaners.Models;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name= "Cleaner")
@Data
public class Cleaner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Integer cleaner_id;

    private String cleaner_fn;
    private String cleaner_ln;
    private String cleaner_mn;
    private String cleaner_gender;
    private Integer cleaner_age;
    private String cleaner_address;
    private Integer cleaner_gov_id;
    private String cleaner_gov_id_type;
    private Long cleaner_phone_number;
}

package com.yufu.jbp.domain;

import javax.persistence.*;

@Entity
public class Tenant extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
}

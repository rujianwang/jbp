package com.yufu.jbp.domain;

import javax.persistence.Entity;

@Entity
public class UserRole extends BaseEntity {

    private long userId;
    private long roleId;
    private long tenantId;
}

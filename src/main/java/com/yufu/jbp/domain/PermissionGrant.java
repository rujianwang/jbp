package com.yufu.jbp.domain;

import javax.persistence.Entity;

@Entity
public class PermissionGrant  extends  BaseEntity{

    private long tenantId;
    private String name;
    private String providerName;
    private String providerKey;
}

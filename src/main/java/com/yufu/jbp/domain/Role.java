package com.yufu.jbp.domain;

import javax.persistence.Entity;

@Entity
public class Role extends BaseEntity {

    private long tenantId;
    private String normalizedName;
    private String name;
    private boolean isDefault;
    private boolean isStatic;
    private boolean isPublic;
}

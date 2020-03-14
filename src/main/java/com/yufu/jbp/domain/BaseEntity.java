package com.yufu.jbp.domain;

import javax.persistence.*;
import java.util.Date;


@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String  creatorId;

    private Date creationTime;

    private String  lastModifierId;

    private Date lastModificationTime;

    private String  deleterId;

    private boolean isDelete;

    private Date deletionTime;

    // <editor-fold desc="creatorId">
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }





    // </editor-fold>

    // <editor-fold desc="creationTime">

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }


    // </editor-fold>

    // <editor-fold desc="lastModifierId">


    public String getLastModifierId() {
        return lastModifierId;
    }

    public void setLastModifierId(String lastModifierId) {
        this.lastModifierId = lastModifierId;
    }
    // </editor-fold>

    // <editor-fold desc="lastModificationTime">
    public Date getLastModificationTime() {
        return lastModificationTime;
    }

    public void setLastModificationTime(Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }


    // </editor-fold>

    // <editor-fold desc="deleterId">


    public String getDeleterId() {
        return deleterId;
    }

    public void setDeleterId(String deleterId) {
        this.deleterId = deleterId;
    }
    // </editor-fold>

    // <editor-fold desc="isDelete">

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
    // </editor-fold>

    // <editor-fold desc="deletionTime">
    public Date getDeletionTime() {
        return deletionTime;
    }

    public void setDeletionTime(Date deletionTime) {
        this.deletionTime = deletionTime;
    }


    // </editor-fold>
}

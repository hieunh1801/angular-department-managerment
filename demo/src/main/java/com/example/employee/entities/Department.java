package com.example.employee.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "position")
public class Department implements Serializable {

    private static final long serialVersionUID = -4814772747742136039L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private int status;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "edited_date")
    private Date editedDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "edited_by")
    private String editedBy;

    public Department() {}
    /**
     * Constructor Department
     * @param code mã phòng ban
     * @param name tên phòng ban
     * @param status trạng thái 1 or 0
     * @param createdDate ngày tạo
     * @param editedDate ngày chỉnh sửa
     * @param createdBy được tạo bởi username
     * @param editedBy được chỉnh sửa bởi
     */
    public Department(String code,
                      String name,
                      int status,
                      Date createdDate,
                      Date editedDate,
                      String createdBy,
                      String editedBy) {
        this.code = code;
        this.name = name;
        this.status = status;
        this.createdDate = createdDate;
        this.editedDate = editedDate;
        this.createdBy = createdBy;
        this.editedBy = editedBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getEditedDate() {
        return editedDate;
    }

    public void setEditedDate(Date editedDate) {
        this.editedDate = editedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}

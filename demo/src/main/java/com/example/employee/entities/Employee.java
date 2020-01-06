package com.example.employee.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements Serializable{
	
	private static final long serialVersionUID = -8918865990892157909L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "date_of_bird")
	private Date dateOfBird;
	
	@Column(name = "gender")
	private int gender;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phonenumber")
	private String phonenumber;
	
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
}

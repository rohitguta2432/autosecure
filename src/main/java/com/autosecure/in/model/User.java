package com.autosecure.in.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	
	@Column(name="user_name")
	private String username;

	@Column(name="password")
	private String password;
	
	@Column(name="user_role")
	private String userRole;

	@Column(name="status")
	private int status;
	
	@Column(name="password_token")
	private String passwordToken;
}

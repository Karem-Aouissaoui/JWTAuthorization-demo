package com.karem.users.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long user_id;
	private String username;
	private String password;
	private Boolean enabled;
	
	@ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name="user_role", joinColumns = @JoinColumn(name="user_id"),
					inverseJoinColumns = @JoinColumn(name="role_id"))
	private List<Role> roles;

	public User(Long user_id, String username, String password, Boolean enabled) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
	}
	
	
}

package com.peepalsoft.app.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.peepalsoft.app.auth.Role;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;

@Entity
@Getter
@Setter
@Table(uniqueConstraints = {
	      @UniqueConstraint(columnNames = {"username", "staffs_code"})
	      })
public class Users extends BaseEntity {
	
	@Id
	@NotNull
	@Size(min = 4, max = 20)
	private String username;
	
	@NotNull
	private String password;
	
	@NotNull
	private boolean status;
	
	@OneToOne
	@JoinColumn(updatable = false)
	private Staffs staffs;
	
	//doesn't create a new column
	@Transient
	private String confirmpassword;
	
	@Transient
	private String newpassword;
	
	@JsonManagedReference
	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable( 
        name = "users_roles", 
        joinColumns = @JoinColumn(
          name = "user_username", referencedColumnName = "username"), 
        inverseJoinColumns = @JoinColumn(
          name = "role_id", referencedColumnName = "id")) 
    private Collection<Role> roles;
	
	

}

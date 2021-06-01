package com.springboot.model;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;




 @Entity
 @Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

//    @Column(nullable = false)
//    @NotEmpty()
    @Column(name = "first_name")
    private String firstName;
	
    @Column(name = "last_name")
	private String lastName;
    

    @Column(nullable = false,unique = true)
    @NotEmpty
    @Email(message = "{erros.invalid_email}")
    private String email;

    @Column(nullable = false)
    @NotEmpty
    @Size(min = 4)
    private String password;

	//New changes
	private boolean isEnabled;
	
	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
    
    
    
    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(
        name = "users_roles",
        joinColumns = {@JoinColumn(name="USER_ID", referencedColumnName = "ID")},
        inverseJoinColumns = {@JoinColumn(name="ROLE_ID",referencedColumnName = "ID")}
    )
    private List <Role> roles;
    
    /* @OneToMany(mappedBy = "users")
    private List<Message> messages; */
    /**
     * @return Integer return the id
     * 
     */
    public User() {
 		super();
 		
 	}
    public User(String firstName, String lastName, String email, String password, List<Role> roles) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
   
    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return List<Role> return the roles
     */
    public List<Role> getRoles() {
        return roles;
    }

    /**
     * @param roles the roles to set
     */
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}

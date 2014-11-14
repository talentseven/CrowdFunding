package sf.crowdFunding.model;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: user
 *
 */
@Entity
@NamedQuery(name="User.findByUsername", query="SELECT u FROM User u WHERE u.username = :username")
public class User implements Serializable {

	@Id
	private String username;
	private String firstName;
	private String lastName;
	private String email;
	private int credit;
	private String password;
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}

	public User(String username, String firstName, String lastName,
			String email, int credit, String password) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.credit = credit;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
   
}

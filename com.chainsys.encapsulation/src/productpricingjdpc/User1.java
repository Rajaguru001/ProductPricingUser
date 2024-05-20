package productpricingjdpc;

import java.sql.SQLException;

public class User1 {
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	String firstname;
	String lastname;
	String pwd;
	String phonenumber;
	public String getPhonenumber() {
		return phonenumber;
	}
	User1(){
		
	}
	public User1(String firstname, String lastname, String pwd, String phonenumber, String username, String password) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.pwd = pwd;
		this.phonenumber = phonenumber;
		this.username = username;
		this.password = password;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	String username;
	String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}

package com.example.DevSecOpsJavaProj.model;

public class User {
    
	private String name;
	private String birthday;
	private String email;
	private String phone;
	private String message;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", birthday=" + birthday + ", email=" + email + ", phone=" + phone + ", message="
				+ message + "]";
	}
	
	
	
	
}
